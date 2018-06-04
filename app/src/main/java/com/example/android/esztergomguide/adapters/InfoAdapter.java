package com.example.android.esztergomguide.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.esztergomguide.R;

import java.util.ArrayList;
import java.util.List;

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.MyViewHolder> {
    private Context mContext;
    private List<Info> infoList;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView image;
        CardView cv;

        public MyViewHolder(View view) {
            super(view);
            cv = (CardView)view.findViewById(R.id.list_item);
            title = (TextView)view.findViewById(R.id.info);
            image = (ImageView) view.findViewById(R.id.icon);
        }
    }
    public InfoAdapter(Context mContext, List<Info> infoList) {
        this.mContext = mContext;
        this.infoList = infoList;
    }

    @Override
    public void onBindViewHolder(@NonNull InfoAdapter.MyViewHolder holder, int position) {
        Info infos = infoList.get(position);
        holder.title.setText(infos.getInfo());
        holder.image.setImageResource(infos.getImageResourceId());
    }

    @Override
    public InfoAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item2, parent, false);

        return new InfoAdapter.MyViewHolder(itemView);

    }
    @Override
    public int getItemCount() {
        return infoList.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}


