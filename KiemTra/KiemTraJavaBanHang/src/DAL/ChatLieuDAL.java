/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.ChatLieuDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author thanh
 */
public class ChatLieuDAL {
    Connection conn = new Connect().getConnect();
    public ArrayList<ChatLieuDTO> getAll() throws SQLException {
        ArrayList<ChatLieuDTO> lstChatlieu = new ArrayList<>();
        String sql = "{call Chatlieu_DS}";
//      String sql = "Select * from Khach"; Cau lenh thuong.  
        CallableStatement cs = conn.prepareCall(sql);
        ResultSet rs = cs.executeQuery();
        if (!rs.next()) {
            System.out.println("Không có chất liệu nào");
        } else {
            do {
                ChatLieuDTO CL = new ChatLieuDTO();
                CL.setMachatlieu(rs.getString("Machatlieu"));
                CL.setTenchatlieu(rs.getString("Tenchatlieu"));
                lstChatlieu.add(CL);
            } while (rs.next());
        }
        return lstChatlieu;
    }
    
    public void ThemCLDTO(ChatLieuDTO CL) throws SQLException {
        String sql = "{call Chatlieu_Them(?,?)}";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString("Machatlieu", CL.getMachatlieu());
        cs.setString("Tenchatlieu", CL.getTenchatlieu());
        cs.execute();
    }

    public void SuaCLDTO(ChatLieuDTO CL) throws SQLException {
        String sql = "{call Chatlieu_Sua(?,?)}";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString("Machatlieu", CL.getMachatlieu());
        cs.setString("Tenchatlieu", CL.getTenchatlieu());
        cs.execute();
    }

    public void XoaCLDTO(String ma) throws SQLException {
        String sql = "{call Chatlieu_Xoa(?)}";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString("Machatlieu", ma);
        cs.execute();
    }
    
    public boolean getTrungMa(String ma) {
        Boolean ktra = true;
        try {
            String sql = "SELECT Machatlieu FROM Chatlieu";
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while (rs.next()) {
                if (ma.equals(rs.getString("Machatlieu"))) {
                    ktra = true;
                } else {
                    ktra = false;
                }
                break;

            }
        } catch (Exception e) {
        }
        return ktra;
    }
}
