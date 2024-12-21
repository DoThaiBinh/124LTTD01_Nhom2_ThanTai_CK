package com.example.ck_nhom2_thantai.object;
import java.io.Serializable;

public class Danhmuc implements Serializable {
    private String idkhoangthuchi;
    private String tenthuchi;
    private String idnguoidung;
    private String hinhanh;

    public Danhmuc(String idkhoangthuchi, String tenthuchi, String idnguoidung, String hinhanh) {
        this.idkhoangthuchi = idkhoangthuchi;
        this.tenthuchi = tenthuchi;
        this.idnguoidung = idnguoidung;
        this.hinhanh = hinhanh;

    }

    public Danhmuc() {
    }

    public String getIdkhoangthuchi() {
        return idkhoangthuchi;
    }

    public void setIdkhoangthuchi(String idkhoangthuchi) {
        this.idkhoangthuchi = idkhoangthuchi;
    }

    public String getTenthuchi() {
        return tenthuchi;
    }

    public void setTenthuchi(String tenthuchi) {
        this.tenthuchi = tenthuchi;
    }

    public String getIdnguoidung() {
        return idnguoidung;
    }

    public void setIdnguoidung(String idnguoidung) {
        this.idnguoidung = idnguoidung;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }


}
