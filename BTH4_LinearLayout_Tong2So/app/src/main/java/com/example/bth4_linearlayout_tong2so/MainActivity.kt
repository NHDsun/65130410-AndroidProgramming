package com.example.bth4_linearlayout_tong2so

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Xử lý cộng
    fun XuLyCong(v: View) {

        val editTextSo1 = findViewById<EditText>(R.id.edtSo1)
        val editTextSo2 = findViewById<EditText>(R.id.edtSo2)

        val soThu1 = editTextSo1.text.toString()
        val soThu2 = editTextSo2.text.toString()

        val soA = soThu1.toFloat()
        val soB = soThu2.toFloat()

        val tong = soA + soB

        val editTextKQ = findViewById<EditText>(R.id.edtKetQua)

        val chuoiKQ = tong.toString()

        editTextKQ.setText(chuoiKQ)
    }

    // Xử lý trừ
    fun XuLyTru(v: View) {

        val editTextSo1 = findViewById<EditText>(R.id.edtSo1)
        val editTextSo2 = findViewById<EditText>(R.id.edtSo2)

        val soA = editTextSo1.text.toString().toFloat()
        val soB = editTextSo2.text.toString().toFloat()

        val tong = soA - soB

        val editTextKQ = findViewById<EditText>(R.id.edtKetQua)

        editTextKQ.setText(tong.toString())
    }

    // Nhân
    fun XuLyNhan(v: View) {

        val soA = findViewById<EditText>(R.id.edtSo1).text.toString().toFloat()
        val soB = findViewById<EditText>(R.id.edtSo2).text.toString().toFloat()

        val kq = soA * soB

        findViewById<EditText>(R.id.edtKetQua).setText(kq.toString())
    }

    // Chia
    fun XuLyChia(v: View) {

        val soA = findViewById<EditText>(R.id.edtSo1).text.toString().toFloat()
        val soB = findViewById<EditText>(R.id.edtSo2).text.toString().toFloat()

        val kq = soA / soB

        findViewById<EditText>(R.id.edtKetQua).setText(kq.toString())
    }
}