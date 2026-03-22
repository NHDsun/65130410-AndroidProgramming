package com.example.bai3zalo;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtHoTen;
    RadioButton radNam, radNu;
    CheckBox chkDocSach, chkXemPhim, chkTheThao;
    TextView txtThongTin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtHoTen = findViewById(R.id.edtHoTen);
        radNam = findViewById(R.id.radNam);
        radNu = findViewById(R.id.radNu);
        chkDocSach = findViewById(R.id.chkDocSach);
        chkXemPhim = findViewById(R.id.chkXemPhim);
        chkTheThao = findViewById(R.id.chkTheThao);
        txtThongTin = findViewById(R.id.txtThongTin);
    }

    public void xuLyXacNhan(View view) {
        String hoTen = edtHoTen.getText().toString().trim();

        if (hoTen.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập họ tên!", Toast.LENGTH_SHORT).show();
            return;
        }

        String gioiTinh = "";
        if (radNam.isChecked()) {
            gioiTinh = "Nam";
        } else if (radNu.isChecked()) {
            gioiTinh = "Nữ";
        } else {
            gioiTinh = "Chưa chọn";
        }

        String soThich = "";
        if (chkDocSach.isChecked()) soThich += "Đọc sách, ";
        if (chkXemPhim.isChecked()) soThich += "Xem phim, ";
        if (chkTheThao.isChecked()) soThich += "Thể thao, ";

        if (!soThich.isEmpty()) {
            soThich = soThich.substring(0, soThich.length() - 2);
        } else {
            soThich = "Không có";
        }

        String kq = "Họ tên: " + hoTen +
                "\nGiới tính: " + gioiTinh +
                "\nSở thích: " + soThich;

        txtThongTin.setText(kq);
    }
}