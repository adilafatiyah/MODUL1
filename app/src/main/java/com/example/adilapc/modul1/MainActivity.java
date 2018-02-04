package com.example.adilapc.modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edMenu, edPorsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edMenu =(EditText)findViewById(R.id.edit_menu);
        edPorsi = (EditText)findViewById(R.id.edit_porsi);
    }

    public void eatbus(View view) {
        Intent i = new Intent(this, eatbus_activity.class);
        i.putExtra("eatbus_menu",edMenu.getText().toString());
        i.putExtra("eatbus_porsi",edPorsi.getText().toString());
        startActivity(i);
    }

    public void abnormal(View view) {
        Intent i = new Intent(this, abnormal_activity.class);
        i.putExtra("abnormal_menu", edMenu.getText().toString());
        i.putExtra("abnormal_porsi", edPorsi.getText().toString());
        startActivity(i);
    }
}
