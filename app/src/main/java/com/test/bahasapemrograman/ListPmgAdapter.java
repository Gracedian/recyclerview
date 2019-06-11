package com.test.bahasapemrograman;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import java.util.ArrayList;

public class ListPmgAdapter extends RecyclerView.Adapter<ListPmgAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Pemrograman> listpmg;

    private ArrayList<Pemrograman> getListpmg()
    {
        return listpmg;
    }

    ListPmgAdapter(Context context)
    {
        this.context = context;
    }

    void setListpmg(ArrayList<Pemrograman> listpmg)
    {
        this.listpmg = listpmg;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itemlist, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvJudul.setText(getListpmg().get(position).getJudul());
        categoryViewHolder.tvDesc.setText(getListpmg().get(position).getDesc());

        Glide.with(context)
                .load(getListpmg().get(position).getFoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListpmg().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvJudul;
        TextView tvDesc;
        ImageView imgPhoto;

        CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvJudul = itemView.findViewById(R.id.judul);
            tvDesc = itemView.findViewById(R.id.desc);
            imgPhoto = itemView.findViewById(R.id.foto);
        }
    }
}