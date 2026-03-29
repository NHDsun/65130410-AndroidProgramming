package ntu65cntt2.bth8_tuychinhlv;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Tìm listview
        ListView lvDSMonAn = (ListView) findViewById(R.id.lvDSMonAn);
         // chuẩn bị nguồn dữ liệu
        ArrayList <MonAn> dsMonAn = new ArrayList<>();
        dsMonAn.add(new MonAn("Mì cay hải sản", 590000, "Mì Koreno và hải sản", R.drawable.mc));
        dsMonAn.add(new MonAn("Ếch xào xả ớt", 790000, "Ếch đồng và hành tây", R.drawable.exxo));
        dsMonAn.add(new MonAn("Cơm chiên dương châu", 490000, "Cơm trắng và một số rau củ", R.drawable.ccdc));
        dsMonAn.add(new MonAn("Khổ qua chà bông", 390000, "Khổ qua đắng và chà bông", R.drawable.kqcb));
        dsMonAn.add(new MonAn("Thịt bò xào cải chua", 1190000, "Thịt bò xào ta với dưa cải ngâm", R.drawable.tbxdc));
        dsMonAn.add(new MonAn("Mì xào hải sản", 890000, "Mì xào dai với hải sản", R.drawable.mxhs));
        dsMonAn.add(new MonAn("Tôm mắm nhĩ", 790000, "Tôm tươi ngâm với mắm nhĩ", R.drawable.tmn));
        dsMonAn.add(new MonAn("Mì cay hải sản", 590000, "Mì Koreno và hải sản", R.drawable.mc));
        dsMonAn.add(new MonAn("Ếch xào xả ớt", 790000, "Ếch đồng và hành tây", R.drawable.exxo));
        dsMonAn.add(new MonAn("Cơm chiên dương châu", 490000, "Cơm trắng và một số rau củ", R.drawable.ccdc));
        dsMonAn.add(new MonAn("Khổ qua chà bông", 390000, "Khổ qua đắng và chà bông", R.drawable.kqcb));
        dsMonAn.add(new MonAn("Thịt bò xào cải chua", 1190000, "Thịt bò xào ta với dưa cải ngâm", R.drawable.tbxdc));
        dsMonAn.add(new MonAn("Mì xào hải sản", 890000, "Mì xào dai với hải sản", R.drawable.mxhs));
        dsMonAn.add(new MonAn("Tôm mắm nhĩ", 790000, "Tôm tươi ngâm với mắm nhĩ", R.drawable.tmn));
        dsMonAn.add(new MonAn("Tôm mắm nhĩ", 790000, "Tôm tươi ngâm với mắm nhĩ", R.drawable.tmn));
        dsMonAn.add(new MonAn("Tôm mắm nhĩ", 790000, "Tôm tươi ngâm với mắm nhĩ", R.drawable.tmn));

        MonAnAdapter adapter = new MonAnAdapter(this, dsMonAn);
        lvDSMonAn.setAdapter(adapter);

        //bắt xử lý sự kiện
        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                MonAn monAnChon = dsMonAn.get(i);

                Toast.makeText(MainActivity.this,"Bạn vừa chọn món " + monAnChon.getTenMonAn(), Toast.LENGTH_SHORT).show();

            }
        });
     }
}