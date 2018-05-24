package com.example.android.esztergomguide.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
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

public class AccomondationsFragment extends Fragment {
    public int info;
    private ImageView cover;
    private TextView coverLabel;

    public AccomondationsFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);
        cover = (ImageView) rootView.findViewById(R.id.background);
        coverLabel = (TextView) rootView.findViewById(R.id.layoutName);
        cover.setImageResource(R.drawable.hotel);
        coverLabel.setText(R.string.accomodations);

        final ArrayList<Catalog> catalog = new ArrayList<Catalog>();
        catalog.add(new Catalog(R.string.bellue, R.drawable.belllue));
        catalog.add(new Catalog(R.string.portobello, R.drawable.portobello));
        catalog.add(new Catalog(R.string.adalbert, R.drawable.saint_adalbert));

        final CatalogAdapter adapter = new CatalogAdapter(getActivity(),catalog);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), InfoActivity.class);
                Catalog clickedItem = (Catalog) adapter.getItem(position);
                info = clickedItem.getLabel();
                intent.putExtra("infos", info);
                startActivity(intent);
            }
        });
        return rootView;}
}