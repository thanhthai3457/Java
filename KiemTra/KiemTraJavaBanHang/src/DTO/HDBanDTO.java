package DTO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thanh
 */
public class HDBanDTO {
    private String MaHDBan, Ngayban,  Makhach, Manhanvien;
    private Double Tongtien;

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
     * @return the Ngayban
     */
    public String getNgayban() {
        return Ngayban;
    }

    /**
     * @param Ngayban the Ngayban to set
     */
    public void setNgayban(String Ngayban) {
        this.Ngayban = Ngayban;
    }

    /**
     * @return the Makhach
     */
    public String getMakhach() {
        return Makhach;
    }

    /**
     * @param Makhach the Makhach to set
     */
    public void setMakhach(String Makhach) {
        this.Makhach = Makhach;
    }

    /**
     * @return the Manhanvien
     */
    public String getManhanvien() {
        return Manhanvien;
    }

    /**
     * @param Manhanvien the Manhanvien to set
     */
    public void setManhanvien(String Manhanvien) {
        this.Manhanvien = Manhanvien;
    }

    /**
     * @return the Tongtien
     */
    public Double getTongtien() {
        return Tongtien;
    }

    /**
     * @param Tongtien the Tongtien to set
     */
    public void setTongtien(Double Tongtien) {
        this.Tongtien = Tongtien;
    }
}
