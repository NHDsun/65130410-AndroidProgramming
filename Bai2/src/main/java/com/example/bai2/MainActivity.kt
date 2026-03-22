package com.example.bai2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Commit
        val so1 = findViewById<EditText>(R.id.edtSo1)
        val so2 = findViewById<EditText>(R.id.edtSo2)
        val btnTinh = findViewById<Button>(R.id.btnTinh)
        val ketQua = findViewById<TextView>(R.id.txtKetQua)

        btnTinh.setOnClickListener {

            val a = so1.text.toString().toIntOrNull() ?: 0
            val b = so2.text.toString().toIntOrNull() ?: 0

            val ketqua = a + b

            ketQua.text = getString(R.string.ketqua, ketqua)
        }
    }
}