package com.example.mykultum;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }
    public void pindahkultum(View view) {
        Intent pindahdong = new Intent(this,KultumSaya.class);
        startActivity(pindahdong);

    }public void pindahbaca(View view) {
        Intent pindahyuk = new Intent(this,BacaActivity.class);
        startActivity(pindahyuk);

    }
    public void pindahsettings(View view) {
        Intent pindahkuy = new Intent(this,SettingsActivity.class);
        startActivity(pindahkuy);

    }

}
