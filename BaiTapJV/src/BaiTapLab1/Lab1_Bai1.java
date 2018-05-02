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
public class Lab1_Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ Tên: ");
        String hoTen = scanner.nextLine();
        System.out.println("Điểm TB: ");
        Double diemTB = scanner.nextDouble();
        System.out.printf("%s %f ",hoTen, diemTB);
        
    }
    

}
