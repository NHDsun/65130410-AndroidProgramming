package ntu65cntt2.bth9_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ViewHolder> {
    private Context context;
    private ArrayList<LandScape> listData;

    public LandScapeAdapter(Context context, ArrayList<LandScape> listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_land, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        LandScape item = listData.get(position);
        holder.tvName.setText(item.getLandCaption());
        holder.imgLand.setImageResource(item.getLandImageId());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgLand;
        TextView tvName;

        public ViewHolder(View itemView) {
            super(itemView);
            imgLand = itemView.findViewById(R.id.imgLand);
            tvName = itemView.findViewById(R.id.tvLandName);
        }
    }
}