package com.example.mobileumkm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class kasir_frag extends Fragment {
    private TextView txtMenu1;
    private TextView txtHrgMenu1;
    private TextView txtCartMenu1;
    private TextView txtCartItem1;

    private TextView txtCartHarga1;
    private LinearLayout buttonContainer;
    private Button btnMenu1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_item_menu, container, false);

        txtMenu1 = view.findViewById(R.id.tv_namaMakanan);
        txtHrgMenu1 = view.findViewById(R.id.tv_hargaMakanan);
//        txtCartMenu1 = view.findViewById(R.id.menuKeranjang1);
//        txtCartItem1 = view.findViewById(R.id.jmlItem1);
//        txtCartHarga1 = view.findViewById(R.id.hrgItem1);

//        buttonContainer = view.findViewById(R.id.buttonContainer);
        btnMenu1 = view.findViewById(R.id.btn_Makanan);
        btnMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Buat button
//                Button bayarButton = new Button(getContext());
//                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
//                        LinearLayout.LayoutParams.WRAP_CONTENT,
//                        LinearLayout.LayoutParams.WRAP_CONTENT
//                );
//
//                layoutParams.gravity = Gravity.CENTER;
//                bayarButton.setLayoutParams(layoutParams);
//
//                bayarButton.setText("Keranjang");
//                bayarButton.setTextColor(getResources().getColor(R.color.black));
//                bayarButton.setBackgroundColor(getResources().getColor(R.color.kuningJadi));
//
//                buttonContainer.addView(bayarButton);
                txtCartMenu1.setText(txtMenu1.getText());
                txtCartHarga1.setText(txtHrgMenu1.getText());
                txtCartItem1.setText("1 Item");

                buttonContainer.setVisibility(View.VISIBLE);

            }
        });

        return view;
    }
}
