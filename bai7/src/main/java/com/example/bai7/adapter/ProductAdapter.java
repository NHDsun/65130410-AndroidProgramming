package com.example.bai7.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.bai7.R;
import com.example.bai7.model.Product;

import java.util.List;

public class ProductAdapter extends BaseAdapter {

    private Context context;
    private List<Product> list;

    public ProductAdapter(Context context, List<Product> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        if (view == null) {
            view = LayoutInflater.from(context)
                    .inflate(R.layout.item_product, parent, false);
        }

        TextView txtName = view.findViewById(R.id.txtName);
        TextView txtPrice = view.findViewById(R.id.txtPrice);
        TextView txtType = view.findViewById(R.id.txtType);

        Product p = list.get(i);

        txtName.setText(p.getName());
        txtPrice.setText(p.getPrice() + " VNĐ");
        txtType.setText(p.isService() ? "Dịch vụ" : "Sản phẩm");

        return view;
    }
}