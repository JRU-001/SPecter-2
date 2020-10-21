package com.example.myfirstapp;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    Button b,d;
    CheckBox ja,js,py,cp,cc,go;
    RadioGroup g;
    RadioButton y,n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txt_nomb);
        et2 = (EditText) findViewById(R.id.txt_appel);
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
