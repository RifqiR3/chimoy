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

        }
    }
}
