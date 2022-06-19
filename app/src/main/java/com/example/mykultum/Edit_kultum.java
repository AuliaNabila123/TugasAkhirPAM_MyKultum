package com.example.mykultum;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mykultum.database.DBController;
import com.google.android.material.textfield.TextInputEditText;

import java.util.HashMap;

public class Edit_kultum extends AppCompatActivity {
    EditText Judul, Teks;
    Button Save;
    String ju,te, id;
    DBController controller = new DBController(this);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kultum_edit);

        Judul = findViewById(R.id.judul);
        Teks = findViewById(R.id.teks);
        Save = findViewById(R.id.btn_save);

        id = getIntent().getStringExtra("id");
        ju = getIntent().getStringExtra("judul");
        te = getIntent().getStringExtra("teks");

        Judul.setText(ju);
        Teks.setText(te);

        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Judul.getText().toString().equals("") || Teks.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Mohon isi data terlebih dahulu !!", Toast.LENGTH_LONG).show();
                } else {
                    ju = Judul.getText().toString();
                    te = Teks.getText().toString();
                    HashMap<String, String> values = new HashMap<>();
                    values.put("id", id);
                    values.put("judul", ju);
                    values.put("teks", te);
                    controller.UpdateData(values);
                    callHome();
                }
            }
        });
    }
    public void callHome(){
        Intent i = new Intent(Edit_kultum.this,KultumSaya.class);
        startActivity(i);
        finish();
    }
}

