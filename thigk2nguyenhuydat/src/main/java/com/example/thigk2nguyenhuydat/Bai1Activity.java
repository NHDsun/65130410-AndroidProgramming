package com.example.thigk2nguyenhuydat;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Bai1Activity extends AppCompatActivity {
    EditText edtDai, edtRong;
    Button btnTinh;
    TextView tvKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);

        edtDai = findViewById(R.id.edtDai);
        edtRong = findViewById(R.id.edtRong);
        btnTinh = findViewById(R.id.btnTinh);
        tvKetQua = findViewById(R.id.tvKetQua);

        btnTinh.setOnClickListener(v -> {
            String daiStr = edtDai.getText().toString().trim();
            String rongStr = edtRong.getText().toString().trim();

            if (daiStr.isEmpty() || rongStr.isEmpty()) {
                Toast.makeText(Bai1Activity.this, "Nhập đầy đủ", Toast.LENGTH_SHORT).show();
                return;
            }

            double dai = Double.parseDouble(daiStr);
            double rong = Double.parseDouble(rongStr);

            double chuVi = (dai + rong) * 2;
            double dienTich = dai * rong;

            tvKetQua.setText("Chu vi: " + chuVi + "\nDiện tích: " + dienTich);
        });
    }
}
