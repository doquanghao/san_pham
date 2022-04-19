package com.example.project_tra_sua.models;

public class chon {
    int id_l;
    String the_loai;
    String ten;
    String ghichu;

    public chon(int id_l, String the_loai, String ten, String ghichu) {
        this.id_l = id_l;
        this.the_loai = the_loai;
        this.ten = ten;
        this.ghichu = ghichu;
    }

    public int getId_l() {
        return id_l;
    }

    public String getThe_loai() {
        return the_loai;
    }

    public String getTen() {
        return ten;
    }

    public String getGhichu() {
        return ghichu;
    }
}
