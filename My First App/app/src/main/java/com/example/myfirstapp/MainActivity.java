package com.example.myfirstapp;

import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String SENT_TEXT1 ="com.example.myfisrtapp.SENT_TEXT1";
    public static final String SENT_TEXT2 ="com.example.myfisrtapp.SENT_TEXT2";
    public static final String SENT_TEXT3 ="com.example.myfisrtapp.SENT_TEXT3";
    public static final String SENT_TEXT4 ="com.example.myfisrtapp.SENT_TEXT4";

    EditText et1, et2;
    Button b,d;
    DatePicker dt2;
    Spinner gend;
    CheckBox ja,js,py,cp,cc,go;
    RadioGroup g;
    RadioButton y,n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txt_nomb);
        et2 = (EditText) findViewById(R.id.txt_appel);
        //dt2 = (DatePicker) findViewById(R.id.cal_Nativ);
        gend = (Spinner) findViewById(R.id.spin_gen);
        b = (Button) findViewById(R.id.btn_Env);
        d = (Button) findViewById(R.id.btn_cler);

        ja = (CheckBox) findViewById(R.id.chk_Java);
        js = (CheckBox) findViewById(R.id.chk_JS);
        py = (CheckBox) findViewById(R.id.chk_Python);
        cp = (CheckBox) findViewById(R.id.chk_Cpls);
        cc = (CheckBox) findViewById(R.id.chk_Csh);
        go = (CheckBox) findViewById(R.id.chk_Gol);

        g = (RadioGroup) findViewById(R.id.rad_prog);
        y = (RadioButton) findViewById(R.id.btn_gusta);
        n = (RadioButton) findViewById(R.id.btn_nogusta);

                checkValidation();

        et1.addTextChangedListener(mWatcher);
        et2.addTextChangedListener(mWatcher);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado();
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                borrar((ViewGroup) findViewById(R.id.lay_erz));
            }
        });
    }

    private void checkValidation() {
        if ((TextUtils.isEmpty(et1.getText())) || (TextUtils.isEmpty(et2.getText())))
            b.setEnabled(false);
        else
            b.setEnabled(true);
    }

    TextWatcher mWatcher = new TextWatcher() {
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            checkValidation();
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            // TODO Auto-generated method stub
        }

        @Override
        public void afterTextChanged(Editable s) {
            // TODO Auto-generated method stub
        }
    };

    private void borrar(ViewGroup group) {
        for (int i = 0, count = group.getChildCount(); i < count; ++i) {
            View view = group.getChildAt(i);
            if (view instanceof EditText) {
                ((EditText)view).setText("");
            }
            if (view instanceof RadioGroup) {
                ((RadioGroup)view).setSelected(false);
            }
            if (view instanceof CheckBox) {
                ((CheckBox)view).setChecked(false);
            }


            if(view instanceof ViewGroup && (((ViewGroup)view).getChildCount() > 0))
                borrar((ViewGroup)view);
        }
    }

    public void resultado(){

        String nombre = et1.getText().toString();
        String apellido = et2.getText().toString();
        //String fecha = dt2.getDisplay().getName();
        String gende = gend.getSelectedItem().toString();


        Intent intent = new Intent(this, resultado.class);
        intent.putExtra(SENT_TEXT1, nombre);
        intent.putExtra(SENT_TEXT2, apellido);
        //intent.putExtra(SENT_TEXT3, fecha);
        intent.putExtra(SENT_TEXT4, gende);

        startActivity(intent);

    }

    public void activar(RadioGroup g, int checkedId) {
        // TODO Auto-generated method stub
        switch(checkedId){
            case R.id.btn_gusta:
                ja.setEnabled(true);
                js.setEnabled(true);
                py.setEnabled(true);
                go.setEnabled(true);
                cc.setEnabled(true);
                cp.setEnabled(true);
                break;

            case R.id.btn_nogusta:
                ja.setEnabled(false);
                js.setEnabled(false);
                py.setEnabled(false);
                go.setEnabled(false);
                cc.setEnabled(false);
                cp.setEnabled(false);
                break;
        }
    }

    

}
