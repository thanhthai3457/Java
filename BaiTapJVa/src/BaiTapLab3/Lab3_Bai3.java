/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapLab3;
import java.util.Scanner;
import static BaiTapLab3.Lab3_Bai3.NhapMang;
import static BaiTapLab3.Lab3_Bai3.XuatMang;
import java.util.Arrays;
/**
 *
 * @author thanh
 */
public class Lab3_Bai3 {
    static int[] A;
    public static void NhapMang()
    {       
        int i,n;       
        Scanner sc = new Scanner(System.in); 
        do{
            System.out.print("Nhập vào số phần tử của mảng: ");
            n = sc.nextInt();
        }while(n < 0);
        
        A = new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("A["+i+"]: ");
            A[i] = sc.nextInt();
        } 
    }
    public static void XuatMang()
    {
        
        System.out.println("Mảng đã nhập: ");               
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+ " ");
        }   
        System.out.println("\nMảng đã nhập sau khi sắp xếp: ");
        Arrays.sort(A);
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+ " ");
        }
    }
    public static int DuyetMang(){
        int res = 0, dem = 0;
        for(int i=0;i<A.length;i++)
            if(A[i]%3 == 0){
                res+= A[i];
                dem+= 1;
            }
        return res/dem;
    }
    public static void main(String args[]){
        NhapMang();
        XuatMang();
        System.out.println("\n\nTrung bình cộng các số chia hết cho 3 trong mảng: " + DuyetMang());
    }
}
