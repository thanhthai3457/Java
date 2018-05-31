/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author thanh
 */
public class CheckTrungKhoa {
    Connection conn = new Connect().getConnect();
    public boolean CheckID(String tblName, String ID_Sql, String ma) throws SQLException{
        String sqlCmd = "SELECT * FROM " + tblName + " WHERE " + ID_Sql + " = " + "'"+ ma +"'";
        Statement ss = conn.createStatement();
        ResultSet rs = ss.executeQuery(sqlCmd);
        return rs.next();
    }
}
