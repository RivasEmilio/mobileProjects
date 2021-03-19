package com.example.apptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    String anyString;
    TextView txtViewMgr;
    Intent intentReceiver;
    Button buttonManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        txtViewMgr = findViewById(R.id.textView2);
        intentReceiver = getIntent();
        txtViewMgr.setText(intentReceiver.getStringExtra("myExtra"));
        buttonManager = findViewById(R.id.button2);


        buttonManager.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                intentReceiver = new Intent(ChildActivity.this, MainActivity.class);
                intentReceiver.putExtra("myExtra1", true);

                startActivity(intentReceiver);

            }
        });
    }
}