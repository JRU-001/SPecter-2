package com.example.myfirstapp;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Intent intent= getIntent();
        String text = intent.getStringExtra(MainActivity.SENT_TEXT1);
        String text2 = intent.getStringExtra(MainActivity.SENT_TEXT2);
        //String text3 = intent.getStringExtra(MainActivity.SENT_TEXT3);
        String text4 = intent.getStringExtra(MainActivity.SENT_TEXT4);

        TextView resp1 = (TextView) findViewById(R.id.txt_res1);
        TextView resp2 = (TextView) findViewById(R.id.txt_res2);
        TextView resp3 = (TextView) findViewById(R.id.txt_res3);

        resp1.setText("Hola! Mi nombre es: " + text + " "+ text2);
        resp2.setText("soy " + text4 + " y naci en: " );
        resp3.setText("Programar" );

    }
}