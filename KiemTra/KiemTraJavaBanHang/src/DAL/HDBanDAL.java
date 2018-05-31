/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.HDBanDTO;
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
public class HDBanDAL {
     Connection conn = new Connect().getConnect();

    public ArrayList<HDBanDTO> getAll() throws SQLException {
        ArrayList<HDBanDTO> lstHoadon = new ArrayList<>();
        String sql = "{call HDBan_DS}";
//      String sql = "Select * from Khach"; Cau lenh thuong.  
        CallableStatement cs = conn.prepareCall(sql);
        ResultSet rs = cs.executeQuery();
        if (!rs.next()) {
            System.out.println("Không có hóa đơn nào");
        } else {
            do {
                HDBanDTO HD = new HDBanDTO();
                HD.setMaHDBan(rs.getString("MaHDBan"));
                HD.setNgayban(rs.getString("Ngayban"));
                HD.setTongtien(rs.getDouble("Tongtien"));                 
                HD.setMakhach(rs.getString("Makhach"));
                HD.setManhanvien(rs.getString("Manhanvien"));              
                lstHoadon.add(HD);
            } while (rs.next());
        }
        return lstHoadon;
    }

    public void ThemHDDTO(HDBanDTO CL) throws SQLException {
        String sql = "{call HDBan_Them(?,?,?,?,?)}";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString("MaHDBan", CL.getMaHDBan());
        cs.setString("Ngayban", CL.getNgayban());
        cs.setDouble("Tongtien", CL.getTongtien());
        cs.setString("Makhach", CL.getMakhach());
        cs.setString("Manhanvien", CL.getManhanvien());
        cs.execute();
    }

    public void SuaHDDTO(HDBanDTO CL) throws SQLException {
        String sql = "{call HDBan_Sua(?,?,?,?,?)}";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString("MaHDBan", CL.getMaHDBan());
        cs.setString("Ngayban", CL.getNgayban());
        cs.setDouble("Tongtien", CL.getTongtien());
        cs.setString("Makhach", CL.getMakhach());
        cs.setString("Manhanvien", CL.getManhanvien());
        cs.execute();
    }

    public void XoaHDDTO(String ma) throws SQLException {
        String sql = "{call HDBan_Xoa(?)}";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString("MaHDBan", ma);
        cs.execute();
    }

    public boolean getTrungMa(String ma) {
        Boolean ktra = true;
        try {
            String sql = "SELECT MaHDBan FROM HDBan";
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while (rs.next()) {
                if (ma.equals(rs.getString("MaHDBan"))) {
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
