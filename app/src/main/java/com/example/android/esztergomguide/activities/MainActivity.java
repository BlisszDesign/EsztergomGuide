package com.example.android.esztergomguide.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.android.esztergomguide.R;

public class MainActivity extends AppCompatActivity {

    private ImageView play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = (ImageView) findViewById(R.id.play);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startGuideIntent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(startGuideIntent);
            }
        });
    }
}
