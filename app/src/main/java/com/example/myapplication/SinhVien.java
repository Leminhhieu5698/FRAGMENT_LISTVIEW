package com.example.myapplication;

public class SinhVien {
    private String HoTen;
    private String Tuoi;
    private String DiaChi;
    public SinhVien(String hoTen, String tuoi, String diaChi){
        this.HoTen = hoTen;
        this.Tuoi = tuoi;
        this.DiaChi = diaChi;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getTuoi() {
        return Tuoi;
    }

    public void setTuoi(String tuoi) {
        Tuoi = tuoi;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }
}
