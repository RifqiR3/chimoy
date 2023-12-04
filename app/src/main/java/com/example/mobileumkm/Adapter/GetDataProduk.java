package com.example.mobileumkm.Adapter;

public class GetDataProduk {
    String nama_produk = "";
    Integer gambar = null;
    String harga_produk = "";

    public  GetDataProduk(String nama_produk, Integer gambar, String harga_produk){
        this.nama_produk = nama_produk;
        this.gambar = gambar;
        this.harga_produk = harga_produk;
    }
    public String getNama_produk() {
        return nama_produk;
    }

    public Integer getGambar() {
        return gambar;
    }

    public String getHarga_produk() {
        return harga_produk;
    }

}