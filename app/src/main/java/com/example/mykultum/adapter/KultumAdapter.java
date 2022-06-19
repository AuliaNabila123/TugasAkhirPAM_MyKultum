package com.example.mykultum.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mykultum.Edit_kultum;
import com.example.mykultum.KultumSaya;
import com.example.mykultum.R;
import com.example.mykultum.database.DBController;
import com.example.mykultum.database.Kultum;

import java.util.ArrayList;
import java.util.HashMap;

public class KultumAdapter extends RecyclerView.Adapter<KultumAdapter.KultumViewHolder> {
    private ArrayList<Kultum> listData;
    private Context control;

    public KultumAdapter(ArrayList<Kultum> listData) {

        this.listData = listData;
    }

    @Override
    public KultumAdapter.KultumViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutinf = LayoutInflater.from(parent.getContext());
        View view = layoutinf.inflate(R.layout.activity_kultum_row,parent,false);
        control = parent.getContext();
        return new KultumViewHolder(view);
    }

    @Override
    public void onBindViewHolder(KultumAdapter.KultumViewHolder holder, int position) {
        String id,ju, te;
        id = listData.get(position).getId();
        ju = listData.get(position).getJudul();
        te = listData.get(position).getTeks();
        DBController db = new DBController(control);

        holder.txtJudul.setTextColor(Color.BLUE);
        holder.txtJudul.setTextSize(20);

        holder.txtJudul.setText(ju);
        holder.TxtTeks.setText(te);
        holder.cardku.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View view) {
                PopupMenu popupMenu = new PopupMenu(control, holder.cardku);
                popupMenu.inflate(R.menu.menu);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem Item) {
                        switch (Item.getItemId()) {
                            case R.id.mnEdit:
                                Intent i = new Intent(control, Edit_kultum.class);
                                i.putExtra("id",id);
                                i.putExtra("judul",ju);
                                i.putExtra("teks",te);
                                control.startActivity(i);
                                break;
                            case R.id.mnHapus:
                                HashMap<String, String> values= new HashMap<>();
                                values.put("id",id);
                                db.DeleteData(values);
                                Intent j = new Intent(control, KultumSaya.class);
                                control.startActivity(j);
                                break;

                        }
                        return true;
                    }
                });
                popupMenu.show();
                return false;
            }
        });
    }

    @Override
    public int getItemCount() {

        return (listData != null)? listData.size() : 0;
    }

    public class KultumViewHolder extends RecyclerView.ViewHolder {
        private CardView cardku;
        private TextView txtJudul, TxtTeks;
        public  KultumViewHolder(View view) {
            super(view);
            cardku = (CardView) view.findViewById(R.id.kartuku);
            txtJudul = (TextView) view.findViewById(R.id.txtJUDUL);
            TxtTeks = (TextView) view.findViewById(R.id.txtTEKS);

        }
    }
}
