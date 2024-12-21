package com.example.ck_nhom2_thantai;

public class User {
    private String idNguoiDung;
    private String ten;
    private String email;
    private String pass;
    private int anhDaiDien;

    // Constructor
    public User(String idNguoiDung, String ten, String email, String pass, int anhDaiDien) {
        this.idNguoiDung = idNguoiDung;
        this.ten = ten;
        this.email = email;
        this.pass = pass;
        this.anhDaiDien = anhDaiDien;
    }

    // Getters and Setters
    public String getIdNguoiDung() {
        return idNguoiDung;
    }

    public void setIdNguoiDung(String idNguoiDung) {
        this.idNguoiDung = idNguoiDung;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAnhDaiDien() {
        return anhDaiDien;
    }

    public void setAnhDaiDien(int anhDaiDien) {
        this.anhDaiDien = anhDaiDien;
    }

    @Override
    public String toString() {
        return "User{" +
                "idNguoiDung='" + idNguoiDung + '\'' +
                ", ten='" + ten + '\'' +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", anhDaiDien='" + anhDaiDien + '\'' +
                '}';
    }

    public User(String name, int profileImageResId) {
        this.ten = name;
        this.anhDaiDien = profileImageResId;
    }
}

