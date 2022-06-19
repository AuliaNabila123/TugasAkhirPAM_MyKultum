package com.example.mykultum.database;

public class Kultum {
    String id;
    String judul;
    String teks;

    public Kultum() {
    }

    public Kultum(String id, String judul, String teks) {
        this.id = id;
        this.judul = judul;
        this.teks = teks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTeks() {
        return teks;
    }

    public void setTeks(String teks) {
        this.teks = teks;
    }
}
