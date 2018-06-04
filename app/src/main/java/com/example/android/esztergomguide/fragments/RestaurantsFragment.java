package com.example.android.esztergomguide.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.esztergomguide.R;
import com.example.android.esztergomguide.activities.InfoActivity;
import com.example.android.esztergomguide.adapters.Catalog;
import com.example.android.esztergomguide.adapters.CatalogAdapter;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment{
    public int info;
    private ImageView cover;
    private TextView coverLabel;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private CatalogAdapter adapter;

    public RestaurantsFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);
        recyclerView = (RecyclerView)rootView.findViewById(R.id.list_item);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);
        cover = (ImageView) rootView.findViewById(R.id.background);
        coverLabel = (TextView) rootView.findViewById(R.id.layoutName);
        cover.setImageResource(R.drawable.restaurant);
        coverLabel.setText(R.string.restaurants);

        final ArrayList<Catalog> catalog = new ArrayList<Catalog>();
        catalog.add(new Catalog(R.string.csulok, R.drawable.csulok));
        catalog.add(new Catalog(R.string.nautilus, R.drawable.nautilus));
        catalog.add(new Catalog(R.string.ppince, R.drawable.primaspince));

        adapter = new CatalogAdapter(getActivity(), catalog);
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new CatalogAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(getActivity(), InfoActivity.class);
                Catalog clickedItem = (Catalog) catalog.get(position);
                info = clickedItem.getLabel();
                intent.putExtra("infos", info);
                startActivity(intent);
            }
        });

        return rootView;}
}
