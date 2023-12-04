package com.example.mobileumkm.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mobileumkm.R;

import java.util.ArrayList;

public class AdapterMenu extends RecyclerView.Adapter<AdapterMenu.ViewHolder> {
    private Context context;
    private ArrayList<GetDataProduk> model;

    public AdapterMenu(Context context, ArrayList<GetDataProduk> model) {
        this.context = context;
        this.model = model;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_menu, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int getGambar = model.get(position).getGambar();

        holder.nama_produk.setText(model.get(position).getNama_produk());
        holder.gambar.setImageResource(getGambar);
        holder.harga_produk.setText(model.get(position).getHarga_produk());
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nama_produk;
        ImageView gambar;
        TextView harga_produk;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nama_produk = itemView.findViewById(R.id.tv_namaMakanan);
            gambar = itemView.findViewById(R.id.iv_makanan);
            harga_produk = itemView.findViewById(R.id.tv_hargaMakanan);
        }
    }
}
