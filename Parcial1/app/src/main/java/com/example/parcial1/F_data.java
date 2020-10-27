package com.example.parcial1;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link F_data#newInstance}factory method to
 * create an instance of this fragment.
 */

public class F_data extends Fragment {

    TextView explicacion;
    //private static final String TAG = "F_data";
    public static final String SENT_DATA ="com.example.Parcial1.SENT_DATA";
    private String data;

    public F_data() {
        // Required empty public constructor
    }

    public static F_data newInstance() {
        F_data fragment = new F_data();
        Bundle args = new Bundle();
        args.putString(SENT_DATA, fragment.data);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle estado) {
        super.onCreate(estado);
        if (getArguments() != null) {
            data = getArguments().getString(SENT_DATA);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle estado) {

        //Log.d(TAG, "onCreate: Started");

        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_f_data, container, false);

        explicacion = view.findViewById(R.id.txt_desc);
        explicacion.setText(data);
        return view;
    }

    public void newInfo(String info){
        explicacion.setText(info);
    }

}


