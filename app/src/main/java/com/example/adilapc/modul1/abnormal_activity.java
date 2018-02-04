package com.example.adilapc.modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class abnormal_activity extends AppCompatActivity {
    TextView edMenu_abnormal, edPorsi_abnormal, edHarga_abnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abnormal_activity);

        edMenu_abnormal = (TextView)findViewById(R.id.abnormal_menu);
        edPorsi_abnormal = (TextView)findViewById(R.id.abnormal_porsi);
        edHarga_abnormal = (TextView)findViewById(R.id.abnormal_harga);

        Intent i = getIntent();
        String abnormal_menu = i.getStringExtra("abnormal_menu");
        String abnormal_porsi = i.getStringExtra("abnormal_porsi");

        Log.d("abnormal", abnormal_menu);
        Log.d("porsi", abnormal_porsi);

        edMenu_abnormal.setText(abnormal_menu.toString());
        edPorsi_abnormal.setText(abnormal_porsi.toString());

        int porsi = Integer.parseInt(abnormal_porsi);
        int harga = porsi*30000;

        edHarga_abnormal.setText(Integer.toString(harga));

        Toast.makeText(getApplicationContext(),"Disini saja makan malamnya", Toast.LENGTH_LONG).show();


    }
}
