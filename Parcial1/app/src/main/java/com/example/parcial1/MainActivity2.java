package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        this.setTitle(getIntent().getStringExtra("SENT_TEXT1"));
        F_data infoFragment = (com.example.parcial1.F_data) getSupportFragmentManager().findFragmentById(R.id.desc_frag);
        F_data.newInfo(getIntent().getStringExtra("SENT_TEXT2"));

    }
}