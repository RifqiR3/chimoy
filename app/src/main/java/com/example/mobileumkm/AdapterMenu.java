package com.example.mobileumkm;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterMenu extends RecyclerView.Adapter<AdapterMenu.MyViewMenu>{
    private List<ModelMenu> mList;
    private Activity activity;
    DatabaseReference database = FirebaseDatabase.getInstance().getReference();

    public AdapterMenu(List<ModelMenu>mList, Activity activity){
        this.mList = mList;
        this.activity = activity;
    }
    @NonNull
    @Override
    public MyViewMenu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View viewitem = inflater.inflate(R.layout.activity_item_menu, parent, false);
        return new MyViewMenu(viewitem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewMenu holder, int position) {
        ModelMenu menu = mList.get(position);

        // Set data ke elemen tata letak
        holder.tv_namaMakanan.setText(menu.getNama_menu());
        Picasso.get().load(menu.getNama_gambar()).into(holder.iv_makanan);
        holder.tv_hargaMakanan.setText("Rp. " + menu.getHarga_menu());

        // Mengatur OnClickListener untuk tombol masukkan
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyViewMenu extends RecyclerView.ViewHolder {
        ImageView iv_makanan;
        TextView tv_namaMakanan, tv_hargaMakanan;
        Button btn_Makanan;
        CardView card_listitem;

        public MyViewMenu(@NonNull View itemView) {
            super(itemView);

            iv_makanan = itemView.findViewById(R.id.iv_makanan);
            tv_namaMakanan = itemView.findViewById(R.id.tv_namaMakanan);
            tv_hargaMakanan = itemView.findViewById(R.id.tv_hargaMakanan);
            btn_Makanan = itemView.findViewById(R.id.btn_Makanan);
            card_listitem = itemView.findViewById(R.id.card_listitem);
        }
    }
}
