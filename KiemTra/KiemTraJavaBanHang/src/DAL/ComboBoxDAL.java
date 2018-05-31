/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;

/**
 *
 * @author thanh
 */
public class ComboBoxDAL {
    public void LoadComboBox(JComboBox cbb, String sql, String b){
        try {
            Connect s = new Connect();
            Connection conn = s.getConnect();
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while(rs.next()){
                cbb.addItem(rs.getString(b));
            }
        } catch (Exception e) {
        }
    }
    public void LoadComboBoxMachatlieu(JComboBox cbb){
        cbb.removeAllItems();
        String sql = "SELECT * FROM Chatlieu";
        String b = "Machatlieu";
        LoadComboBox(cbb, sql, b);
    }
}
