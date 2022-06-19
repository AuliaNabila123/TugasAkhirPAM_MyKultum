package com.example.mykultum;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mykultum.database.DBController;
import com.google.android.material.textfield.TextInputEditText;

import java.util.HashMap;

public class KultumBaru extends AppCompatActivity {
    private TextInputEditText tJudul, tTeks;
    private Button simpanBtn;
    String ju, te;
    DBController controller = new DBController(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kultum_baru);

        tJudul = (TextInputEditText) findViewById(R.id.tietJudul);
        tTeks = (TextInputEditText) findViewById(R.id.tietTeks);
        simpanBtn = (Button) findViewById(R.id.buttonSave);

        simpanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tJudul.getText().toString().equals("") || tTeks.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Data Belum Komplit !", Toast.LENGTH_SHORT).show();
                } else {
                    ju = tJudul.getText().toString();
                    te = tTeks.getText().toString();

                    HashMap<String,String> qvalues = new HashMap<>();
                    qvalues.put("judul",ju);
                    qvalues.put("teks",te);

                    controller.insertData(qvalues);
                    callHome();
                }
            }
        });

    }
    public void callHome(){
        Intent intent = new Intent(KultumBaru.this,KultumSaya.class);
        startActivity(intent);
        finish();
    }
}
