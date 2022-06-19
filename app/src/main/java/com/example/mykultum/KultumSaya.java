package com.example.mykultum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

import com.example.mykultum.adapter.KultumAdapter;
import com.example.mykultum.database.DBController;
import com.example.mykultum.database.Kultum;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.HashMap;

public class KultumSaya extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KultumAdapter adapter;
    private ArrayList<Kultum> kultumArrayList;
    DBController controller = new DBController(this);
    String id, judul, teks;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kultum_saya);

        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        fab = (FloatingActionButton) findViewById(R.id.floatingBtn);
        BacaData();
        adapter = new KultumAdapter(kultumArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(KultumSaya.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KultumSaya.this,KultumBaru.class);
                startActivity(intent);
            }
        });

    }
    public void BacaData (){
        ArrayList<HashMap<String,String>> daftarKultum = controller.getAllKultum();
        kultumArrayList = new ArrayList<>();

        for(int i=0;i<daftarKultum.size();i++) {
            Kultum kultum = new Kultum();

            kultum.setId(daftarKultum.get(i).get("id").toString());
            kultum.setJudul(daftarKultum.get(i).get("judul").toString());
            kultum.setTeks(daftarKultum.get(i).get("teks").toString());

            kultumArrayList.add(kultum);

        }
    }
}