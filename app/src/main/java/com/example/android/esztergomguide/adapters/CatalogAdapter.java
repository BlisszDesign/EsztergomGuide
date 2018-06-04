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
import com.example.android.esztergomguide.activities.MainActivity;

import java.util.ArrayList;
import java.util.List;

public class CatalogAdapter extends RecyclerView.Adapter<CatalogAdapter.MyViewHolder> {
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener (OnItemClickListener listener) {
        mListener = listener;
    }

    private Context mContext;
    private List<Catalog> catalogList;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView image;
        CardView cv;

        public MyViewHolder(View view, final OnItemClickListener listener) {
            super(view);
            cv = (CardView)view.findViewById(R.id.list_item);
            title = (TextView)view.findViewById(R.id.layoutName);
            image = (ImageView) view.findViewById(R.id.background);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                if (listener != null){
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        listener.onItemClick(position);
                    }
                }
                }
            });
        }
    }
    public CatalogAdapter(Context mContext, List<Catalog> catalogList) {
        this.mContext = mContext;
        this.catalogList = catalogList;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Catalog catalog = catalogList.get(position);
        holder.title.setText(catalog.getLabel());
        holder.image.setImageResource(catalog.getImageResourceId());
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(itemView, mListener);
        return myViewHolder;

    }
    @Override
    public int getItemCount() {
        return catalogList.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
