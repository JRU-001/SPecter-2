package com.example.a_lister;

import android.R.layout;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    ListView A_Lister;
    String[] objetos = {"1a","1b","1c","1d"};
    String[] describ = {"primer objeto.","objeto 1b.","C. tercer objeto","Objeto final D"};

    public static final String SENT_TEXT1 ="com.example.Parcial1.SENT_TEXT1";
    public static final String SENT_TEXT2 ="com.example.Parcial1.SENT_TEXT2";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView A_Lister = findViewById(R.id.lst_objeto);
        ArrayAdapter<String> adapteur = new ArrayAdapter<> (this,android.R.layout.simple_list_item_1, objetos);

        A_Lister.setAdapter(adapteur);

        A_Lister.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {

                //String Click = objetos[i];
                //Toast.makeText(getApplicationContext(), "Selecciono: "+ Click,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(view.getContext(),MainActivity2.class);

                intent.putExtra("SENT_TEXT1", objetos[i]);
                intent.putExtra("SENT_TEXT2", describ[i]);

                startActivity(intent);


            }
        });

    }
}


