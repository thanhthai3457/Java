/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapLab1;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author thanh
 */
public class Lab1_Bai4 {
    public static void main(String args[]){
        Scanner imp = new Scanner(System.in);
        System.out.println("Nhập lần lượt a b c: ");
        Double a = imp.nextDouble();
        Double b = imp.nextDouble();
        Double c = imp.nextDouble();
        Double Delta = pow(b,2) - 4*a*c;
        System.out.println("Delta: "+ Delta);
        System.out.println("Căn bậc hai của Delta: "+ sqrt(Delta));
    }
}
