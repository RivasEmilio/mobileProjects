package com.example.apptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonManager;
    ImageView imgViewManager, imgViewManager2, imgViewManager3;
    TextView txtViewManager;
    Intent myIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonManager = findViewById(R.id.button);
        imgViewManager = findViewById(R.id.imageView3);
        imgViewManager3 = findViewById(R.id.imageView);
        txtViewManager = findViewById(R.id.textView);
        myIntent = getIntent();

        if(myIntent.getExtras().getBoolean("myExtra1")){

            imgViewManager.setVisibility(View.VISIBLE);

            imgViewManager3.setVisibility(View.INVISIBLE);

            txtViewManager.setText("Bong");
        }
        buttonManager.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imgViewManager3.setVisibility(View.INVISIBLE);

                txtViewManager.setText("Bing");

                myIntent = new Intent(MainActivity.this, ChildActivity.class);

                myIntent.putExtra("myExtra", txtViewManager.getText().toString());

                startActivity(myIntent);
            }
        });

    }
}