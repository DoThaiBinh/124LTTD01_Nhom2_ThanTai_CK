package com.example.ck_nhom2_thantai.object;


public class NGUOIDUNGLOGIN {
    public String idnguoidung;
    public String passw;

    public String getIdnguoidung() {
        return idnguoidung;
    }

    public void setIdnguoidung(String idnguoidung) {
        this.idnguoidung = idnguoidung;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public NGUOIDUNGLOGIN(String idnguoidung, String passw) {
        this.idnguoidung = idnguoidung;
        this.passw = passw;
    }
}