package com.example.android.esztergomguide.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.esztergomguide.R;
import com.example.android.esztergomguide.adapters.CatalogAdapter;
import com.example.android.esztergomguide.adapters.Info;
import com.example.android.esztergomguide.adapters.InfoAdapter;

import java.util.ArrayList;

public class InfoActivity extends AppCompatActivity {
    public int info;
    private ImageView cover;
    private TextView coverLabel;
    private String infoText;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private InfoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        recyclerView = (RecyclerView) findViewById(R.id.list_item);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);
        Bundle extras = getIntent().getExtras();
        info = extras.getInt("infos");
        cover = (ImageView) findViewById(R.id.background);
        coverLabel = (TextView) findViewById(R.id.layoutName);
        infoText = getResources().getString(info);

        ArrayList<Info> infos = new ArrayList<Info>();

        switch (infoText) {
            case "The Basilica":
                cover.setImageResource(R.drawable.bazilika);
                coverLabel.setText(R.string.thebasilica);
                infos.add(new Info(R.drawable.info, R.string.basilica_info));
                infos.add(new Info(R.drawable.placeholder, R.string.basilica_address));
                infos.add(new Info(R.drawable.web, R.string.basilica_web));
                break;
            case "The Castle":
                cover.setImageResource(R.drawable.castle);
                coverLabel.setText(R.string.thecastle);
                infos.add(new Info(R.drawable.info, R.string.castle_info));
                infos.add(new Info(R.drawable.placeholder, R.string.castle_address));
                infos.add(new Info(R.drawable.web, R.string.castle_web));
                break;
            case "The town hall":
                cover.setImageResource(R.drawable.town_hall);
                coverLabel.setText(R.string.townhall);
                infos.add(new Info(R.drawable.info, R.string.townhall_info));
                infos.add(new Info(R.drawable.placeholder, R.string.townhall_address));
                infos.add(new Info(R.drawable.web, R.string.townhall_web));
                break;
            case "Statue of King Saint Stephen":
                cover.setImageResource(R.drawable.stephen);
                coverLabel.setText(R.string.stephenstatue);
                infos.add(new Info(R.drawable.info, R.string.stephenstatueinfo));
                infos.add(new Info(R.drawable.placeholder, R.string.step_address));
                infos.add(new Info(R.drawable.web, R.string.step_web));
                break;
            case "Balassa Bálint museum":
                cover.setImageResource(R.drawable.bbm);
                coverLabel.setText(R.string.bbmuseum);
                infos.add(new Info(R.drawable.info, R.string.bbmuseum_info));
                infos.add(new Info(R.drawable.placeholder, R.string.bbmuseum_address));
                infos.add(new Info(R.drawable.web, R.string.bbmuseum_web));
                break;
            case "Danube museum":
                cover.setImageResource(R.drawable.dunamuzeum);
                coverLabel.setText(R.string.danubemuseum);
                infos.add(new Info(R.drawable.info, R.string.danubem_info));
                infos.add(new Info(R.drawable.placeholder, R.string.danubem_address));
                infos.add(new Info(R.drawable.web, R.string.danubem_web));
                break;
            case "Primate palace":
                cover.setImageResource(R.drawable.ppalota);
                coverLabel.setText(R.string.primate);
                infos.add(new Info(R.drawable.info, R.string.primate_info));
                infos.add(new Info(R.drawable.placeholder, R.string.primate_address));
                infos.add(new Info(R.drawable.web, R.string.primate_web));
                break;
            case "Christian museum":
                cover.setImageResource(R.drawable.matias);
                coverLabel.setText(R.string.christian);
                infos.add(new Info(R.drawable.info, R.string.christian_info));
                infos.add(new Info(R.drawable.placeholder, R.string.christian_address));
                infos.add(new Info(R.drawable.web, R.string.christian_web));
                break;
            case "Bellevue Hotel****":
                cover.setImageResource(R.drawable.belllue);
                coverLabel.setText(R.string.bellue);
                infos.add(new Info(R.drawable.info, R.string.bellue_info));
                infos.add(new Info(R.drawable.placeholder, R.string.bellue_address));
                infos.add(new Info(R.drawable.web, R.string.bellue_web));
                break;
            case "PORTOBELLO WELLNESS & YACHT HOTEL":
                cover.setImageResource(R.drawable.portobello);
                coverLabel.setText(R.string.portobello);
                infos.add(new Info(R.drawable.info, R.string.portobello_info));
                infos.add(new Info(R.drawable.placeholder, R.string.portobello_address));
                infos.add(new Info(R.drawable.web, R.string.portobello_web));
                break;
            case "Szent Adalbert Hotel":
                cover.setImageResource(R.drawable.saint_adalbert);
                coverLabel.setText(R.string.adalbert);
                infos.add(new Info(R.drawable.info, R.string.adalbert_info));
                infos.add(new Info(R.drawable.placeholder, R.string.adalbert_address));
                infos.add(new Info(R.drawable.web, R.string.adalbert_web));
                break;
            case "CSülök Csárda":
                cover.setImageResource(R.drawable.csulok);
                coverLabel.setText(R.string.csulok);
                infos.add(new Info(R.drawable.info, R.string.csulok_info));
                infos.add(new Info(R.drawable.placeholder, R.string.csulok_address));
                infos.add(new Info(R.drawable.web, R.string.csulok_web));
                break;
            case "Nautilus Sailor Bar":
                cover.setImageResource(R.drawable.nautilus);
                coverLabel.setText(R.string.nautilus);
                infos.add(new Info(R.drawable.info, R.string.nautilus_info));
                infos.add(new Info(R.drawable.placeholder, R.string.nautilus_address));
                infos.add(new Info(R.drawable.web, R.string.nautilus_web));
                break;
            case "Prímás Pince":
                cover.setImageResource(R.drawable.primaspince);
                coverLabel.setText(R.string.ppince);
                infos.add(new Info(R.drawable.info, R.string.ppince_info));
                infos.add(new Info(R.drawable.placeholder, R.string.ppince_address));
                infos.add(new Info(R.drawable.web, R.string.ppince_web));
                break;
            case "Aquasziget":
                cover.setImageResource(R.drawable.aquasziget);
                coverLabel.setText(R.string.aqua);
                infos.add(new Info(R.drawable.info, R.string.aqua_info));
                infos.add(new Info(R.drawable.placeholder, R.string.aqua_address));
                infos.add(new Info(R.drawable.web, R.string.aqua_web));
                break;
            case "Boat excursion":
                cover.setImageResource(R.drawable.hajo);
                coverLabel.setText(R.string.ship);
                infos.add(new Info(R.drawable.info, R.string.ship_info));
                infos.add(new Info(R.drawable.placeholder, R.string.ship_address));
                infos.add(new Info(R.drawable.web, R.string.ship_web));
                break;
            case "House of mysteries":
                cover.setImageResource(R.drawable.magnifying);
                coverLabel.setText(R.string.mystery);
                infos.add(new Info(R.drawable.info, R.string.mystery_info));
                infos.add(new Info(R.drawable.placeholder, R.string.mystery_address));
                infos.add(new Info(R.drawable.web, R.string.mystery_web));
                break;
        }

        adapter = new InfoAdapter(this, infos);
        recyclerView.setAdapter(adapter);
    }
}
