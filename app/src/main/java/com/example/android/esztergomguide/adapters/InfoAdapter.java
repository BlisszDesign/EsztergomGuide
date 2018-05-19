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

public class InfoAdapter extends ArrayAdapter<Info>{
    public InfoAdapter(Context context, ArrayList<Info> info) {
        super(context,0, info);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item2, parent, false);
        }

        Info currentInfo = getItem(position);

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.icon);
        iconView.setImageResource(currentInfo.getImageResourceId());

        TextView infoView = (TextView) listItemView.findViewById(R.id.info);
        infoView.setText(currentInfo.getInfo());
        return listItemView;
    }
}
