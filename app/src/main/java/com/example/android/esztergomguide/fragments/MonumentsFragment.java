package com.example.android.esztergomguide.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.esztergomguide.R;
import com.example.android.esztergomguide.adapters.Catalog;
import com.example.android.esztergomguide.adapters.CatalogAdapter;

import java.util.ArrayList;

public class MonumentsFragment extends Fragment {

    public MonumentsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<Catalog> catalog = new ArrayList<Catalog>();
        catalog.add(new Catalog(R.string.thebasilica, R.drawable.bazilika));
        catalog.add(new Catalog(R.string.thecastle, R.drawable.castle))

        final CatalogAdapter adapter = new CatalogAdapter(getActivity(),catalog);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
    return rootView;}
}
