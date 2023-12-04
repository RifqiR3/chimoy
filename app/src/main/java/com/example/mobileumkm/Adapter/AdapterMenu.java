package com.example.mobileumkm.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mobileumkm.R;

import java.util.ArrayList;

public class AdapterMenu extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    ArrayList<GetDataProduk> model;
    public AdapterMenu(Context context, ArrayList<GetDataProduk> model){
        inflater = LayoutInflater.from(context);
        this.context=context;
        this.model=model;
    }
    @Override
    public int getCount() {
        return model.size();
    }

    @Override
    public Object getItem(int position) {
        return model.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView nama_produk;
        ImageView gambar;
        TextView harga_produk;
        View view1 = inflater.inflate(R.layout.activity_item_menu, null);
        if(view1!=null){
            nama_produk=view1.findViewById(R.id.tv_namaMakanan);
            gambar=view1.findViewById(R.id.iv_makanan);
            harga_produk=view1.findViewById(R.id.tv_hargaMakanan);
            int getGambar = model.get(position).getGambar(); // replace with your actual method

            nama_produk.setText(model.get(position).getNama_produk());
            gambar.setImageResource(getGambar);
            harga_produk.setText(model.get(position).getHarga_produk());

        }
        return view1;
    }
}
