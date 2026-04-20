package com.example.thigk2nguyenhuydat;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Bai2Activity extends AppCompatActivity {

    ListView listView;
    String[] data = {
            "Hà Nội",
            "Hải Phòng",
            "Đà Nẵng",
            "Khánh Hòa",
            "Cần Thơ",
            "Huế",
            "TP Hồ Chí Minh",
            "Bình Dương",
            "Đắk Lắk",
            "Nguyễn Huy Đạt"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);

        listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                data
        );

        listView.setAdapter(adapter);
    }
}