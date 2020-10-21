package com.example.parcial1;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the factory method to
 * create an instance of this fragment.
 */
public class F_data extends Fragment {

    private static final String TAG = "F_data";



    public F_data() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.d(TAG, "onCreate: Started");

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_f_data, container, false);
    }
}