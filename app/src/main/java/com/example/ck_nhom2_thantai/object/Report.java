package com.example.ck_nhom2_thantai.object;


public class Report {
    public double thu1;
    public double chi1;
    public double thu2;
    public double chi2;
    public double thu3;
    public double chi3;

    // Constructor
    public Report(double thu1, double chi1, double thu2, double chi2, double thu3, double chi3) {
        this.thu1 = thu1;
        this.chi1 = chi1;
        this.thu2 = thu2;
        this.chi2 = chi2;
        this.thu3 = thu3;
        this.chi3 = chi3;
    }

    // Getters and Setters
    public double getThu1() {
        return thu1;
    }

    public void setThu1(double thu1) {
        this.thu1 = thu1;
    }

    public double getChi1() {
        return chi1;
    }

    public void setChi1(double chi1) {
        this.chi1 = chi1;
    }

    public double getThu2() {
        return thu2;
    }

    public void setThu2(double thu2) {
        this.thu2 = thu2;
    }

    public double getChi2() {
        return chi2;
    }

    public void setChi2(double chi2) {
        this.chi2 = chi2;
    }

    public double getThu3() {
        return thu3;
    }

    public void setThu3(double thu3) {
        this.thu3 = thu3;
    }

    public double getChi3() {
        return chi3;
    }

    public void setChi3(double chi3) {
        this.chi3 = chi3;
    }
}
