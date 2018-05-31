package DAL;

import DTO.KhachHangDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thanh
 */
public class KhachHangDAL {

    Connection conn = new Connect().getConnect();

    public ArrayList<KhachHangDTO> getAll() throws SQLException {
        ArrayList<KhachHangDTO> lstKhachHang = new ArrayList<>();
        String sql = "{call Khach_Ds}";
//      String sql = "Select * from Khach"; Cau lenh thuong.  
        CallableStatement cs = conn.prepareCall(sql);
        ResultSet rs = cs.executeQuery();
        if (!rs.next()) {
            System.out.println("Không có khách hàng nào");
        } else {
            do {
                KhachHangDTO KH = new KhachHangDTO();
                KH.setMakhach(rs.getString("Makhach"));
                KH.setTenkhach(rs.getString("Tenkhach"));
                KH.setDiachi(rs.getString("Diachi"));
                KH.setDienthoai(rs.getString("Dienthoai"));
                lstKhachHang.add(KH);
            } while (rs.next());
        }
        return lstKhachHang;
    }

    public void ThemKHDTO(KhachHangDTO KH) throws SQLException {
        String sql = "{call Khach_Them(?,?,?,?)}";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString(1, KH.getMakhach());
        cs.setString(2, KH.getTenkhach());
        cs.setString(3, KH.getDiachi());
        cs.setString(4, KH.getDienthoai());
        cs.execute();
    }

    public void SuaKHDTO(KhachHangDTO KH) throws SQLException {
        String sql = "{call Khach_Sua(?,?,?,?)}";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString(1, KH.getMakhach());
        cs.setString(2, KH.getTenkhach());
        cs.setString(3, KH.getDiachi());
        cs.setString(4, KH.getDienthoai());
        cs.execute();
    }

    public void XoaKHDTO(String ma) throws SQLException {
        try {
            String sql = "{call Khach_Xoa(?)}";
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1, ma);
            cs.execute();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean getTrungMa(String ma){
        Boolean ktra = true;
        try {
            String sql = "SELECT Makhach FROM Khach";
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while (rs.next()){
                if (ma.equals(rs.getString("Makhach")))
                    ktra = true;
                else
                    ktra = false;
                break;
                    
            }
        } catch (Exception e) {
        }
        return ktra;
    }
}
