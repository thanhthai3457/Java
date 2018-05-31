/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapLab1;
import static java.lang.Math.pow;
import java.util.Scanner;
/**
 *
 * @author thanh
 */
public class Lab1_Bai3 {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        Double canh = a.nextDouble();
        System.out.println("Thể tích của khối lập phương: " + pow(canh,3));
    }
}
