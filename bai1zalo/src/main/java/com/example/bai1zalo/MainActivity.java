package com.example.bai1zalo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTen = findViewById(R.id.edtTen);
    }

    public void xuLyHello(View view) {
        String ten = edtTen.getText().toString().trim();

        if (ten.isEmpty()) {
            Toast.makeText(MainActivity.this, "Vui lòng nhập tên!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Xin chào, tôi là " + ten, Toast.LENGTH_SHORT).show();
        }
    }
}