/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapLab3;
import java.util.Scanner;

/**
 *
 * @author thanh
 */
public class Lab3_Bai4 {
    static int[] Diem;
    static String[] Ten, HL;
    public static void NhapMang()
    {       
        int i,n;       
        Scanner sc = new Scanner(System.in); 
        
        do{
            System.out.print("Nhập vào số sinh viên: ");
            n = Integer.valueOf(sc.nextLine());
        }while(n < 0);
        Diem = new int[n];
        Ten = new String[n];
        HL = new String[n];
        i=0;
        while(i<n){
            System.out.println("Sinh viên thứ "+ (i+1));
            Ten[i] = sc.nextLine();
            i++;
        }
        for(i=0;i<n;i++)
        {
            System.out.println("Điểm của sinh viên thứ: "+ (i+1));          
            Diem[i] = sc.nextInt();
            if(Diem[i]>=9)
                HL[i] = "Xuất sắc.";
            else if(Diem[i]<9 && Diem[i]>=7.5)
                HL[i] = "Giỏi.";
            else if(Diem[i]<7.5 && Diem[i]>=6.55)
                HL[i] = "Khá.";
            else if(Diem[i]<6.5 && Diem[i]>=5)
                HL[i] = "Trung bình.";
            else
                HL[i] = "Yếu.";
        } 
        
    }
    public static void XuatMang()
    {      
        System.out.println("\nDanh sách sinh viên: ");               
        for (int i=0; i<Ten.length; i++) {
            System.out.println(Ten[i] + "  " + Diem[i] + "  " + HL[i]);
        }   
        System.out.println("\nDanh sách sau khi sắp xếp: ");
        
       
    }
    public static void main(String args[]){
        NhapMang();
        XuatMang();
    }
}
