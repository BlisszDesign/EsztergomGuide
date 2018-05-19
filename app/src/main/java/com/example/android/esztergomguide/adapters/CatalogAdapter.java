package com.example.android.esztergomguide.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.esztergomguide.R;

import java.util.ArrayList;

public class CatalogAdapter extends ArrayAdapter<Catalog> {

    public CatalogAdapter (Context context, ArrayList<Catalog> catalog) {
        super(context,0, catalog);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Catalog currentCatalogItem = getItem(position);

        ImageView backgroundView = (ImageView) listItemView.findViewById(R.id.background);
        backgroundView.setImageResource(currentCatalogItem.getImageResourceId());

        TextView nameView = (TextView) listItemView.findViewById(R.id.layoutName);
        nameView.setText(currentCatalogItem.getLabel());
        return listItemView;
    }
}
