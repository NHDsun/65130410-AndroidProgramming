package com.example.bai2zalo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtCanNang, edtChieuCao;
    TextView txtKetQua, txtDanhGia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCanNang = findViewById(R.id.edtCanNang);
        edtChieuCao = findViewById(R.id.edtChieuCao);
        txtKetQua = findViewById(R.id.txtKetQua);
        txtDanhGia = findViewById(R.id.txtDanhGia);
    }

    public void xuLyTinhBMI(View view) {
        String strCanNang = edtCanNang.getText().toString().trim();
        String strChieuCao = edtChieuCao.getText().toString().trim();

        if (strCanNang.isEmpty() || strChieuCao.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin!", Toast.LENGTH_SHORT).show();
            return;
        }

        double canNang = Double.parseDouble(strCanNang);
        double chieuCaoCm = Double.parseDouble(strChieuCao);
        double chieuCaoM = chieuCaoCm / 100.0;

        double bmi = canNang / (chieuCaoM * chieuCaoM);

        txtKetQua.setText(String.format("BMI = %.2f", bmi));

        String danhGia;
        if (bmi < 18.5) {
            danhGia = "Bạn bị thiếu cân";
        } else if (bmi < 25) {
            danhGia = "Bạn bình thường";
        } else if (bmi < 30) {
            danhGia = "Bạn thừa cân";
        } else {
            danhGia = "Bạn béo phì";
        }

        txtDanhGia.setText("Phân loại: " + danhGia);
    }
}