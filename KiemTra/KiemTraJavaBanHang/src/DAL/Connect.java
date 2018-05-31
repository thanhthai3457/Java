/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author thanh
 */
public class Connect {
//    private String StrConn = "jdbc:sqlserver://localhost:1433; databaseName=BANHANG; user=sa; password=thanhthai3457";
//    private Connection Conn;
//    public Connect(){
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            Conn = DriverManager.getConnection(StrConn);
//            if(Conn != null)
//                System.out.println("Success");
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Connection failed");
//        }
//    }
    
//    public class DBConnect {
    private String StrConn = "jdbc:sqlserver://localhost:59004; databaseName=BANHANG; user=sa; password=thanhthai3457";
    private Connection conn;
    public Connect(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(StrConn);
            if (conn != null)
                System.out.println("Connected!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không");
        }
 
    }
    public Connection getConnect(){
        return conn;
    }
//    public static void main(String[] args){
//        new Connect();
//    }
}
