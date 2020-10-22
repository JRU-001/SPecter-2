package com.example.parcial1;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    FragmentTransaction transaction;
    Fragment fragment_f_lista, fragment_f_data;

    private static final String TAG = "MainActivity";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView lista = (ListView) findViewById(R.id.fundamentos);

        Log.d(TAG, "onClick: Clickeados");


        //lista.OnItemClickListener(new OnItemSelectedListener){    };




        fragment_f_lista = new F_lista();
        fragment_f_data = new F_data();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedor, fragment_f_lista).commit();



    }
}