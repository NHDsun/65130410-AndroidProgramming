package ntu65cntt2.bth9_recyclerview;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<LandScape> dsDuLieu;
    LandScapeAdapter adapter;
    RecyclerView rvLand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Thiết lập Padding cho System Bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // 1. Tìm RecyclerView
        rvLand = findViewById(R.id.lvDSMonAn); // Giữ ID cũ lvDSMonAn hoặc đổi sang id mới của RecyclerView

        // 2. Chuẩn bị nguồn dữ liệu (Gán src ảnh trực tiếp qua ID)
        dsDuLieu = new ArrayList<>();
        dsDuLieu.add(new LandScape("Cột cờ Hà Nội", R.drawable.flag_tower_of_hanoi));
        dsDuLieu.add(new LandScape("Tháp Eiffel", R.drawable.effel_tower));
        dsDuLieu.add(new LandScape("Cung điện Buckingham", R.drawable.buckingham_palace));
        dsDuLieu.add(new LandScape("Tượng nữ thần tự do", R.drawable.statue_of_liberty));
        dsDuLieu.add(new LandScape("Vịnh Hạ Long", R.drawable.halong_bay));

        // 3. Tạo Adapter
        adapter = new LandScapeAdapter(this, dsDuLieu);

        // 4. Thiết lập LayoutManager (Grid 2 cột)
        RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(this, 2);
        rvLand.setLayoutManager(layoutGrid);

        // 5. Gán adapter
        rvLand.setAdapter(adapter);
    }
}