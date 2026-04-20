package com.example.thigk2nguyenhuydat;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Bai3Activity extends AppCompatActivity {

    ListView listView;
    ArrayList<DiaDiem> arrayList;
    DiaDiemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);

        listView = findViewById(R.id.listView);

        arrayList = new ArrayList<>();

        arrayList.add(new DiaDiem(R.drawable.vinwonders, "VinWonders Nha Trang", "Đảo Hòn Tre"));
        arrayList.add(new DiaDiem(R.drawable.honchong, "Hòn Chồng", "Vĩnh Phước"));
        arrayList.add(new DiaDiem(R.drawable.thapba, "Tháp Bà Ponagar", "2 Tháng 4"));
        arrayList.add(new DiaDiem(R.drawable.vienhai, "Viện Hải Dương Học", "Cầu Đá"));
        arrayList.add(new DiaDiem(R.drawable.chualongson, "Chùa Long Sơn", "23/10"));

        adapter = new DiaDiemAdapter(this, arrayList);
        listView.setAdapter(adapter);
    }
}