package com.example.bth5_xulysukien1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtSo1, edtSo2, edtKetQua;
    Button btnCong, btnTru, btnNhan, btnChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSo1 = findViewById(R.id.edtSo1);
        edtSo2 = findViewById(R.id.edtSo2);
        edtKetQua = findViewById(R.id.edtKetQua);

        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
 //Commit
        btnCong.setOnClickListener(v -> {
            float soA = Float.parseFloat(edtSo1.getText().toString());
            float soB = Float.parseFloat(edtSo2.getText().toString());
            edtKetQua.setText(String.valueOf(soA + soB));
        });

        btnTru.setOnClickListener(v -> {
            float soA = Float.parseFloat(edtSo1.getText().toString());
            float soB = Float.parseFloat(edtSo2.getText().toString());
            edtKetQua.setText(String.valueOf(soA - soB));
        });

        btnNhan.setOnClickListener(v -> {
            float soA = Float.parseFloat(edtSo1.getText().toString());
            float soB = Float.parseFloat(edtSo2.getText().toString());
            edtKetQua.setText(String.valueOf(soA * soB));
        });

        btnChia.setOnClickListener(v -> {
            float soA = Float.parseFloat(edtSo1.getText().toString());
            float soB = Float.parseFloat(edtSo2.getText().toString());
            edtKetQua.setText(String.valueOf(soA / soB));
        });
    }
}