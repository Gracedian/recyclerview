package com.test.bahasapemrograman;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardPmgAdapter  extends RecyclerView.Adapter<CardPmgAdapter.CardViewViewHolder>{
    private Context context;
    private ArrayList<Pemrograman> listpmg;
    public CardPmgAdapter(Context context)
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
    public CardPmgAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itemcard, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardPmgAdapter.CardViewViewHolder cardViewViewHolder, int i) {
        Pemrograman pmg = getListpmg().get(i);
        Glide.with(context)
                .load(pmg.getFoto())
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewViewHolder.imgPhoto);
        cardViewViewHolder.judul.setText(pmg.getJudul());
        cardViewViewHolder.desc.setText(pmg.getDesc());

        cardViewViewHolder.fav.setOnClickListener((View.OnClickListener) new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Favorite " + getListpmg().get(position).getJudul(), Toast.LENGTH_SHORT).show();
            }
        }));
        cardViewViewHolder.shr.setOnClickListener((View.OnClickListener) new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share " + getListpmg().get(position).getJudul(), Toast.LENGTH_SHORT).show();
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListpmg().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView judul, desc;
        Button fav, shr;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.foto);
            judul = itemView.findViewById(R.id.judul);
            desc = itemView.findViewById(R.id.desc);
            fav = itemView.findViewById(R.id.fave);
            shr = itemView.findViewById(R.id.share);
        }
    }
}
