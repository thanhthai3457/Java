/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapLab4;

import java.util.Scanner;
/**
 *
 * @author thanh
 */
public class SanPham {
    private String TenSP;
    private double DonGia, GiamGia;
    private double Thue(){
        return 0.1*getDonGia();
    }
    public SanPham(){
        this.TenSP = "";
        this.DonGia = 0.0;
        this.GiamGia = 0.0;
    }
    public SanPham(String tenSP, double donGia, double giamGia){
        this.TenSP = tenSP;
        this.DonGia = donGia;
        this.GiamGia = giamGia;
    }
    public SanPham(String tenSP, double donGia){
        this(tenSP,donGia,0);
    }
    public void Nhap(){
        Scanner a = new Scanner(System.in);
        System.out.print("Nhap vao ten SP: ");
        setTenSp(a.nextLine());
        System.out.print("Don gia: ");
        setDonGia(a.nextDouble());
        System.out.print("Giam gia: ");
        setGiamGia(a.nextDouble());
    }
    public void Xuat(){
        System.out.println("San pham: "+getTenSp()+", Don gia: "+getDonGia()+", Giam gia: "+getGiamGia());
    }
    /**
     * @return the tenSp
     */
    public String getTenSp() {
        return TenSP;
    }

    /**
     * @param tenSp the tenSp to set
     */
    public void setTenSp(String tenSp) {
        this.TenSP = tenSp;
    }

    /**
     * @return the donGia
     */
    public double getDonGia() {
        return DonGia;
        /**
     * @param donGia the donGia to set
     */
    }
    public void setDonGia(double donGia) {
        this.DonGia = donGia;
    }

    /**
     * @return the giamGia
     */
    public double getGiamGia() {
        return GiamGia;
    }

    /**
     * @param giamGia the giamGia to set
     */
    public void setGiamGia(double giamGia) {
        this.GiamGia = giamGia;
    }   
}

