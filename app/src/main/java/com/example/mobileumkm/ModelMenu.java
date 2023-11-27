package com.example.mobileumkm;

public class ModelMenu {
    private String nama_menu;
    private String nama_gambar;
    private String harga_menu;
    private String key;

    public ModelMenu(){

    }
    public ModelMenu(String nama_menu, String nama_gambar, String harga_menu) {
        this.nama_menu = nama_menu;
        this.nama_gambar = nama_gambar;
        this.harga_menu = harga_menu;
    }

    public String getNama_menu() {
        return nama_menu;
    }

    public void setNama_menu(String nama_menu) {
        this.nama_menu = nama_menu;
    }

    public String getNama_gambar() {
        return nama_gambar;
    }

    public void setNama_gambar(String nama_gambar) {
        this.nama_gambar = nama_gambar;
    }

    public String getHarga_menu() {
        return harga_menu;
    }

    public void setHarga_menu(String harga_menu) {
        this.harga_menu = harga_menu;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
