package com.test.bahasapemrograman;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class ItemClickSupport {
    private final RecyclerView aRecyclerView;
    private OnItemClickListener aOnItemClickListener;
    private OnItemLongClickListener aOnItemLongClickListener;
    private View.OnClickListener aOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (aOnItemClickListener != null){
                RecyclerView.ViewHolder holder = aRecyclerView.getChildViewHolder(v);
                aOnItemClickListener.onItemClicked(aRecyclerView,holder.getAdapterPosition(),v);
            }
        }
    };

    private View.OnLongClickListener aOnLongClickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            if (aOnItemLongClickListener != null) {
                RecyclerView.ViewHolder holder = aRecyclerView.getChildViewHolder(v);
                return aOnItemLongClickListener.onItemLongClicked(aRecyclerView, holder.getAdapterPosition(), v);
            }
            return false;
        }
    };
    private RecyclerView.OnChildAttachStateChangeListener bAttachListener
            = new RecyclerView.OnChildAttachStateChangeListener() {
        @Override
        public void onChildViewAttachedToWindow(@NonNull View view) {
            if (aOnItemClickListener != null) {
                view.setOnClickListener(aOnClickListener);
            }
            if (aOnItemLongClickListener != null) {
                view.setOnLongClickListener(aOnLongClickListener);
            }
        }

        @Override
        public void onChildViewDetachedFromWindow(@NonNull View view) {
        }
    };

    private ItemClickSupport(RecyclerView recyclerView) {
        aRecyclerView = recyclerView;
        aRecyclerView.setTag(R.id.itemclick, this);
        aRecyclerView.addOnChildAttachStateChangeListener(bAttachListener);
    }

    public static ItemClickSupport addTo(RecyclerView view) {
        ItemClickSupport click = (ItemClickSupport) view.getTag(R.id.itemclick);
        if (click == null) {
            click = new ItemClickSupport(view);
        }
        return click;
    }

    public static ItemClickSupport removeFrom(RecyclerView view) {
        ItemClickSupport click = (ItemClickSupport) view.getTag(R.id.itemclick);
        if (click != null) {
            click.detach(view);
        }
        return click;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        aOnItemClickListener =  listener;
    }

    public void setOnItemLongClickListener(OnItemLongClickListener listener) {
        aOnItemLongClickListener = listener;
    }

    private void detach(RecyclerView view) {
        view.removeOnChildAttachStateChangeListener(bAttachListener);
        view.setTag(R.id.itemclick, null);
    }

    public interface OnItemClickListener {
        void onItemClicked(RecyclerView recyclerView, int position, View v);
    }
    public interface OnItemLongClickListener {
        boolean onItemLongClicked(RecyclerView recyclerView, int position, View v);
    }
}
