package com.example.parcial1;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.widget.*;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the factory method to
 * create an instance of this fragment.
 */
public class F_lista extends Fragment {

    ListView A_Lister;
    String[] nomb = {"Multitarea","Entorno de desarrollo","Multi-táctil","Bluetooth","Tethering","GooglePlayStore","Soporte para hardware adicional"};
    String[] desc = {"Multitarea real de aplicaciones está disponible, es decir, las aplicaciones que no estén ejecutándose en primer plano reciben ciclos de reloj","Incluye un emulador de dispositivos, herramientas para depuración de memoria y análisis del rendimiento del software.","Tiene soporte nativo para pantallas capacitivas con soporte multitáctil","Marcación por voz a través de Bluetooth, Capacidad para compartir contactos con otros teléfonos, Soporte para bases para auto y escritorio con Bluetooth, Matriz de compatibilidad mejorada con kits y auriculares para automóvil.","Soporta tethering, que permite al teléfono ser usado como u npunto de acceso alámbrico o inalámbrico.","Es un catálogo de aplicaciones gratuitas o de pago.","Soporta cámaras de fotos, de vídeo, pantallas táctiles, GPS, acelerómetros, giroscopios."};

    public static final String SENT_TEXT1 ="com.example.Parcial1.SENT_TEXT1";
    public static final String SENT_TEXT2 ="com.example.Parcial1.SENT_TEXT2";

    private static final String TAG = "F_lista";

    public F_lista() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.d(TAG, "onCreate: Started");

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_f_lista, container, false);
        ListView A_Lister = view.findViewById(R.id.lst_fundas);
        ArrayAdapter<String> adapteur = new ArrayAdapter <> (getActivity(),android.R.layout.simple_list_item_1, nomb);

        A_Lister.setAdapter(adapteur);


        A_Lister.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {

                //String Click = nomb[i];
                //Toast.makeText(getApplicationContext(), "Selecciono: "+ Click,Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(view.getContext(),F_data.class);
                //startActivity(intent);

                if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT){
                    Intent intent = new Intent();
                    intent.setClass(getActivity(), F_data.class);
                    intent.putExtra("SENT_TEXT1", nomb[i]);
                    intent.putExtra("SENT_TEXT2", desc[i]);

                    startActivity(intent);
                }else{
                    F_data describe = (com.example.parcial1.F_data) getFragmentManager().findFragmentById(R.id.fragment2);
                    assert describe != null;
                    describe.newInfo(desc[i]);
                }

            }
        });

        return view;

    }
}