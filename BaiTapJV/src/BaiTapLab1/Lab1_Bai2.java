/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapLab1;
import java.util.Scanner;
/**
 *
 * @author thanh
 */
public class Lab1_Bai2 {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        Double dai = a.nextDouble();       
        Double rong = a.nextDouble();
        Double Chuvi = dai + rong + dai + rong;
        Double Dientich = dai*rong;
    //    System.out.print("Chu vi HCN: ");
            System.out.println("Chu vi HCN: " +Chuvi);
        System.out.print("Diện tích HCN: ");
            System.out.println(Dientich);
        Double minmin;
        minmin = (dai < rong)?dai:rong;
        System.out.print("Cạnh nhỏ nhất: " +minmin);
    }
}
