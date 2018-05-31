/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapLab3;

/**
 *
 * @author thanh
 */
public class Lab3_Bai2 {
    public static void main(String[] args) {
        // TODO code application logic here
        int i;         
        for (  i = 1 ; i <= 9 ; i ++)              
        {
            System.out.println("Bảng cửu chương: "+i);
            for ( int j = 1; j<= 10 ; j ++) {              
                System.out.println(i  + " x " + j + " = " + i * j + "\t");
            }           
            System.out.println("");       
        }
    }
}
