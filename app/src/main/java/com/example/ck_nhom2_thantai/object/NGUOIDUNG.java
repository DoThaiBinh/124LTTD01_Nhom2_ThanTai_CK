package com.example.ck_nhom2_thantai.object;

public class NGUOIDUNG {
    public String tennguoidung;
    public String idnguoidung;

    public String getTennguoidung() {
        return tennguoidung;
    }

    public void setTennguoidung(String tennguoidung) {
        this.tennguoidung = tennguoidung;
    }

    public String getIdnguoidung() {
        return idnguoidung;
    }

    public void setIdnguoidung(String idnguoidung) {
        this.idnguoidung = idnguoidung;
    }

    public NGUOIDUNG(String tennguoidung, String idnguoidung) {
        this.tennguoidung = tennguoidung;
        this.idnguoidung = idnguoidung;
    }

    public NGUOIDUNG() {
    }
}