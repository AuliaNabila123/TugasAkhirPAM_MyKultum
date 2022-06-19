package com.example.mykultum.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;

public class DBController extends SQLiteOpenHelper {
    public DBController(Context context) {
        super(context, "MyKultum", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table kultum (id integer primary key, judul text, teks text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists kultum");
        onCreate(db);
    }

    public void insertData(HashMap<String,String> dataQuery){
        SQLiteDatabase basisdata = this.getWritableDatabase();
        ContentValues nilai = new ContentValues();
        nilai.put("judul", dataQuery.get("judul"));
        nilai.put("teks", dataQuery.get("teks"));

        basisdata.insert("kultum",null,nilai);
        basisdata.close();
    }

    public void UpdateData(HashMap<String,String>queryValues){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues nilai = new ContentValues();
        nilai.put("judul", queryValues.get("judul"));
        nilai.put("teks", queryValues.get("teks"));

        db.update("kultum", nilai,"id=?", new String[]{queryValues.get("id")});
        db.close();
    }

    public void DeleteData(HashMap<String, String> queryValue) {
        SQLiteDatabase db = getWritableDatabase();
        db.delete("kultum","id=?", new String[]{queryValue.get("id")});
        db.close();
    }

    public ArrayList<HashMap<String,String>> getAllKultum() {
        ArrayList<HashMap<String,String>> daftarKultum;
        daftarKultum = new ArrayList<HashMap<String,String>>();
        String selectQuery = "Select * from kultum";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if(cursor.moveToFirst()){
            do {
                HashMap<String,String> map = new HashMap<>();

                map.put("id", cursor.getString(0));
                map.put("judul", cursor.getString(1));
                map.put("teks", cursor.getString(2));
                daftarKultum.add(map);

            } while (cursor.moveToNext());
        }
        db.close();
        return daftarKultum;
    }

}
