package ntu65cntt2.bth8_tuychinhlv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {
    private ArrayList  <MonAn> dsMonAn;
    private LayoutInflater layoutInflater;
    private Context context;

    public MonAnAdapter(Context _context, ArrayList<MonAn> dsMonAn) {
        this.dsMonAn = dsMonAn;
        this.context = _context;
        this.layoutInflater = LayoutInflater.from(context);
    }
    // phần tử danh sách mon ăn
    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int i) {
        return dsMonAn.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        //View items hiện hành
        View viewHienHanh = view ;
        //kiểm tra
        if(viewHienHanh == null)
            viewHienHanh = layoutInflater.inflate(R.layout.item_monan, null);
        //Lấy dữ liệu
        MonAn monanHienTai = dsMonAn.get(i);
        //gán lên điều khiển

        //Tìm điều khiển

        TextView textView_TenMon = (TextView) viewHienHanh.findViewById(R.id.tvTenMonAn);
        TextView textView_MoTa = (TextView) viewHienHanh.findViewById(R.id.tvMoTa);
        TextView textView_DonGia = (TextView) viewHienHanh.findViewById(R.id.tvDonGia);
        ImageView imageView_Anh = (ImageView) viewHienHanh.findViewById(R.id.imanhDaiDien);

        //set lên
        textView_TenMon.setText(monanHienTai.getTenMonAn());
        textView_DonGia.setText(String.valueOf(monanHienTai.getDonGia()));
        textView_MoTa.setText (monanHienTai.getMoTa());
        imageView_Anh.setImageResource(monanHienTai.getIdAnhMinhHoa());

        return viewHienHanh;





    }
}
