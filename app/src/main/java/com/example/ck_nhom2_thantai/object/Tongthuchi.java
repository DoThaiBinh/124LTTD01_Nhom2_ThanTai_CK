package com.example.ck_nhom2_thantai.object;


public class Tongthuchi {
    public double tienthu;
    public double tienchi;

    public double getTienthu() {
        return tienthu;
    }

    public void setTienthu(int tienthu) {
        this.tienthu = tienthu;
    }

    public double getTienchi() {
        return tienchi;
    }

    public void setTienchi(int tienchi) {
        this.tienchi = tienchi;
    }

    public Tongthuchi(double tienthu, double tienchi) {
        this.tienthu = tienthu;
        this.tienchi = tienchi;
    }
}