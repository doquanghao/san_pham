package com.example.project_tra_sua.models;

public class danh_muc {
    int id;
    String ten_dm;
    String hinhanh;
    String ghi_chu;

    public danh_muc(int id, String ten_dm, String hinhanh, String ghi_chu) {
        this.id = id;
        this.ten_dm = ten_dm;
        this.hinhanh = hinhanh;
        this.ghi_chu = ghi_chu;
    }

    public int getId() {
        return id;
    }

    public String getTen_dm() {
        return ten_dm;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public String getGhi_chu() {
        return ghi_chu;
    }
}
