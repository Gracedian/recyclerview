package com.test.bahasapemrograman;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridPmgAdapter extends RecyclerView.Adapter<GridPmgAdapter.GridViewHolder>{
    private Context context;
    private ArrayList<Pemrograman> listpmg;

    public GridPmgAdapter(Context context)
    {
        this.context = context;
    }

    private ArrayList<Pemrograman> getListpmg()
    {
        return listpmg;
    }

    public void setListpmg(ArrayList<Pemrograman> listpmg)
    {
        this.listpmg = listpmg;
    }

    @NonNull
    @Override
    public GridPmgAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemgrid, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridPmgAdapter.GridViewHolder holder, int position) {
        Glide.with(context)
            .load(getListpmg().get(position).getFoto())
            .apply(new RequestOptions().override(350, 550))
            .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount()
    {
        return getListpmg().size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.foto);
        }
    }
}
