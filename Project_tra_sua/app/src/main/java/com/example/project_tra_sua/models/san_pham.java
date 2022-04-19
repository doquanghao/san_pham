package com.example.project_tra_sua.models;

public class san_pham {
    int idsp;
    int iddm;
    String tensp;
    String giatien;
    String hinhanh;

    public san_pham(int idsp, int iddm, String tensp, String giatien, String hinhanh) {
        this.idsp = idsp;
        this.iddm = iddm;
        this.tensp = tensp;
        this.giatien = giatien;
        this.hinhanh = hinhanh;
    }

    public int getIdsp() {
        return idsp;
    }

    public int getIddm() {
        return iddm;
    }

    public String getTensp() {
        return tensp;
    }

    public String getGiatien() {
        return giatien;
    }

    public String getHinhanh() {
        return hinhanh;
    }
}
