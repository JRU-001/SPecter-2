package com.example.a_lister;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        this.setTitle(getIntent().getStringExtra("SENT_TEXT1"));

        Intent intent= getIntent();
        TextView resp = (TextView) findViewById(R.id.txt_result);

        resp.setText(getIntent().getStringExtra("SENT_TEXT2"));
    }
}