/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapLab3;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author thanh
 */
public class Lab3_Bai1 {
    public static int kiemTraSNT(int n)
    {
        int dem = 0;
        for(int i=2;i<=sqrt(n);i++)        
            if(n%i == 0)
                return 0;
        return 1;
    }
    
    //Hàm tính tổng số nguyên tố tu 1 den n
    public static int tinhTong(int n)
    {
        int Tong = 0;
        for(int i=1;i<=n;i++)
        {
            if(kiemTraSNT(i) == 1)
                Tong += i;
        }
        return Tong;
    }
    public static void main(String[] args) {
        // TODO code application logic here            
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n= ");
        int n = sc.nextInt();
        if(n>0)
        {
            if(kiemTraSNT(n) == 1)
                System.out.println("Là số nguyên tố");
            else
                System.out.println("Không phải là SNT");                    
        }
        System.out.println("Tong so nguyen to la: "+tinhTong(n));
    }
}
