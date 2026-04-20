package com.example.thigk2nguyenhuydat;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    Button button, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        button.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Bai1Activity.class));
        });

        button2.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Bai2Activity.class));
        });

        button3.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Bai3Activity.class));
        });

        button4.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Bai4Activity.class));
        });
    }
}