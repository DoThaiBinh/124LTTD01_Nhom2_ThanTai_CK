package com.example.ck_nhom2_thantai.object;

public class NGUOIDUNG {
    public String tennguoidung;
    public String username;

    public String getTennguoidung() {
        return tennguoidung;
    }

    public void setTennguoidung(String tennguoidung) {
        this.tennguoidung = tennguoidung;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public NGUOIDUNG(String tennguoidung, String username) {
        this.tennguoidung = tennguoidung;
        this.username = username;
    }
}