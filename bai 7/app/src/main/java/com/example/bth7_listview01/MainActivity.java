package com.example.bth7_listview01;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bth7_listview01.adapter.ProductAdapter;
import com.example.bth7_listview01.model.Product;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvProduct;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Ánh xạ
        lvProduct = findViewById(R.id.lvProduct);

        // 2. Data
        productList = new ArrayList<>();

        productList.add(new Product(
                "P01",
                "Phần mềm bán hàng",
                "Quản lý cửa hàng bán lẻ",
                500000,
                "CAT01",
                false,
                10,
                "",
                false
        ));

        productList.add(new Product(
                "P02",
                "Dịch vụ thiết kế website",
                "Thiết kế website theo yêu cầu",
                3000000,
                "CAT02",
                true,
                0,
                "",
                false
        ));
        productList.add(new Product(
                "P02",
                "Dịch vụ thiết kế website",
                "Thiết kế website theo yêu cầu",
                3000000,
                "CAT02",
                true,
                0,
                "",
                false
        ));
        productList.add(new Product(
                "P02",
                "Dịch vụ thiết kế website",
                "Thiết kế website theo yêu cầu",
                3000000,
                "CAT02",
                true,
                0,
                "",
                false
        ));
        productList.add(new Product(
                "P02",
                "Dịch vụ thiết kế website",
                "Thiết kế website theo yêu cầu",
                3000000,
                "CAT02",
                true,
                0,
                "",
                false
        ));
        productList.add(new Product(
                "P02",
                "Dịch vụ thiết kế website",
                "Thiết kế website theo yêu cầu",
                3000000,
                "CAT02",
                true,
                0,
                "",
                false
        ));
        productList.add(new Product(
                "P02",
                "Dịch vụ thiết kế website",
                "Thiết kế website theo yêu cầu",
                3000000,
                "CAT02",
                true,
                0,
                "",
                false
        ));

        // 3. Gán adapter (QUAN TRỌNG)
        lvProduct.setAdapter(new ProductAdapter(this, productList));
    }
}