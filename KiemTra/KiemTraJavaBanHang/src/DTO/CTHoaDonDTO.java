/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author thanh
 */
public class CTHoaDonDTO {
    private String MaHDBan, Mahang;
    private double Dongia, Thanhtien;
    private int Soluong, Giamgia;

    /**
     * @return the MaHDBan
     */
    public String getMaHDBan() {
        return MaHDBan;
    }

    /**
     * @param MaHDBan the MaHDBan to set
     */
    public void setMaHDBan(String MaHDBan) {
        this.MaHDBan = MaHDBan;
    }

    /**
     * @return the Mahang
     */
    public String getMahang() {
        return Mahang;
    }

    /**
     * @param Mahang the Mahang to set
     */
    public void setMahang(String Mahang) {
        this.Mahang = Mahang;
    }

    /**
     * @return the Dongia
     */
    public double getDongia() {
        return Dongia;
    }

    /**
     * @param Dongia the Dongia to set
     */
    public void setDongia(double Dongia) {
        this.Dongia = Dongia;
    }

    /**
     * @return the Thanhtien
     */
    public double getThanhtien() {
        return Thanhtien;
    }

    /**
     * @param Thanhtien the Thanhtien to set
     */
    public void setThanhtien(double Thanhtien) {
        this.Thanhtien = Thanhtien;
    }

    /**
     * @return the Soluong
     */
    public int getSoluong() {
        return Soluong;
    }

    /**
     * @param Soluong the Soluong to set
     */
    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    /**
     * @return the Giamgia
     */
    public int getGiamgia() {
        return Giamgia;
    }

    /**
     * @param Giamgia the Giamgia to set
     */
    public void setGiamgia(int Giamgia) {
        this.Giamgia = Giamgia;
    }
}
