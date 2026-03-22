package com.example.bth6_xulysukien_tinhtong;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void XuLyCong(View view){
        EditText edtSo1 = findViewById(R.id.edtSo1);
        EditText edtSo2 = findViewById(R.id.edtSo2);
        TextView txtKetQua = findViewById(R.id.txtKetQua);

        String strA = edtSo1.getText().toString();
        String strB = edtSo2.getText().toString();

//        if (strA.isEmpty() || strB.isEmpty()) {
//            txtKetQua.setText("Nhập đủ 2 số!");
//            return;
//        } hàm kiểm tra thêm

        int a = Integer.parseInt(strA);
        int b = Integer.parseInt(strB);

        txtKetQua.setText("Kết quả: " + (a + b));
    }
}