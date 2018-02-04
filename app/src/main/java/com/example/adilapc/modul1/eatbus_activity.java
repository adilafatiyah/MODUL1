package com.example.adilapc.modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class eatbus_activity extends AppCompatActivity {
    TextView edMenu_eatbus, edPorsi_eatbus, edHarga_eatbus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eatbus_activity);

        edMenu_eatbus = (TextView)findViewById(R.id.eatbus_menu);
        edPorsi_eatbus = (TextView)findViewById(R.id.eatbus_porsi);
        edHarga_eatbus = (TextView)findViewById(R.id.eatbus_harga);

        Intent i = getIntent();
        String eatbus_menu = i.getStringExtra("eatbus_menu");
        String eatbus_porsi = i.getStringExtra("eatbus_porsi");

        Log.d("eatbus", eatbus_menu);
        Log.d("porsi", eatbus_porsi);

        edMenu_eatbus.setText(eatbus_menu.toString());
        edPorsi_eatbus.setText(eatbus_porsi.toString());

        int porsi = Integer.parseInt(eatbus_porsi);
        int harga = porsi*30000;

        edHarga_eatbus.setText(Integer.toString(harga));

        Toast.makeText(getApplicationContext(),"Jangan disini makan malamnya", Toast.LENGTH_LONG).show();


    }
}
