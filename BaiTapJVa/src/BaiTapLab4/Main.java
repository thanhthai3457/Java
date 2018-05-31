/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapLab4;

/**
 *
 * @author thanh
 */
public class Main {
    public static void main(String[] args){
        SanPham sp1, sp2;
        sp1 = new SanPham("Nokia",3990000,25);
        sp2 = new SanPham();
        sp2.Nhap();
        sp1.Xuat();
        sp2.Xuat();
    }
}