/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapLab2;

import java.util.Scanner;

/**
 *
 * @author thanh
 */
public class Lab2 {
    /**
     * @param args the command line arguments
     */
    public static void GiaiPTB1(float a, float b)
    {
        if(a==0)
        {
            if(b==0)
                System.out.println("Phương trình có vô số nghiệm");
            else
                System.out.println("Phương trình vô nghiệm");
        }
        else
             System.out.println("Phương trình có 1 nghiệm duy nhất x= " +(-b)/a);
    }
    //--------------------------------------------------------------------------
    public static void GiaiPTB2( float a, float b, float c)
    {
        double delta = b*b - 4*a*c;
        if(a==0)
            GiaiPTB1(b,c);
        else
            if(delta < 0 )
                System.out.println("Phương trình vô nghiệm");
            else
                if(delta == 0)
                    System.out.println("Phương trình có nghiệm kép x = "+(-b)/2*a);
                else
                    {
                        System.out.println("Nghiệm 1: x= "+ ((-b)+ Math.sqrt(delta))/(2*a));
                        System.out.println("Nghiệm 2: x= "+ ((-b)- Math.sqrt(delta))/(2*a));
                    }
    }
    //--------------------------------------------------------------------------               
    public static int TinhTienDien(int kwhs)
    {
        if(kwhs >= 0 && kwhs <= 50 )
           return kwhs*1000;
        else
            return 50*1000+(kwhs - 50)*1200;
        
    }
    //--------------------------------------------------------------------------
    //Hàm main
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập lựa chọn:\nGiải phương trình bậc nhất - 1."
                + "\nGiải phương trình bậc hai - 2."
                + "\nTính tiền điện - 3."
                + "\nKết thúc - 4.");
        int f;
        f = scanner.nextInt();
        switch(f)
        {
            case(1):
            {
                System.out.print("Nhap a = ");
                Float a = scanner.nextFloat();
                System.out.print("Nhap b = ");
                Float b = scanner.nextFloat();
                System.out.println("Giải phương trình bậc 1: ");
                GiaiPTB1(a,b);
                break;
            }
            case(2):
            {
                System.out.print("Nhap a= ");
                Float a = scanner.nextFloat();
                System.out.print("Nhap b= ");
                Float b = scanner.nextFloat();
                System.out.print("Nhap c= ");
                Float c = scanner.nextFloat();
                System.out.println("Giải phương trình bậc 2: ");
                GiaiPTB2(a,b,c);
                break;
            }
            case(3):
            {
                System.out.print("Nhap số điện tiền thu: ");
                int kwhs = scanner.nextInt();
                System.out.println(TinhTienDien(kwhs));
                break;
            }
            case(4):
            {
                System.out.println("Cảm ơn.");
                break;
            }
        } 
    }
}
