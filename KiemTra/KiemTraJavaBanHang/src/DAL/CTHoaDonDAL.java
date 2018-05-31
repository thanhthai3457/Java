/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.CTHoaDonDTO;
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
public class CTHoaDonDAL {
    Connection conn = new Connect().getConnect();

    public ArrayList<CTHoaDonDTO> getAll() throws SQLException {
        ArrayList<CTHoaDonDTO> lstCT = new ArrayList<>();
        String sql = "{call CTHoaDon_DS}";
//      String sql = "Select * from Khach"; Cau lenh thuong.  
        CallableStatement cs = conn.prepareCall(sql);
        ResultSet rs = cs.executeQuery();
        if (!rs.next()) {
            System.out.println("Không có hóa đơn nào");
        } else {
            do {
                CTHoaDonDTO CT = new CTHoaDonDTO();
                CT.setMaHDBan(rs.getString("MaHDBan"));
                CT.setMahang(rs.getString("Mahang"));
                CT.setSoluong(rs.getInt("Soluong"));
                CT.setDongia(rs.getDouble("Dongia"));
                CT.setGiamgia(rs.getInt("Giamgia"));
                CT.setThanhtien(rs.getDouble("Thanhtien"));
                lstCT.add(CT);
            } while (rs.next());
        }
        return lstCT;
    }

    public void ThemCTDTO(CTHoaDonDTO CT) throws SQLException {
        String sql = "{call CTHoaDon_Them(?,?,?,?,?,?)}";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString("MaHDBan", CT.getMaHDBan());
        cs.setString("Mahang", CT.getMahang());
        cs.setInt("Soluong", CT.getSoluong());
        cs.setDouble("Dongia", CT.getDongia());
        cs.setInt("Giamgia", CT.getGiamgia());
        cs.setDouble("Thanhtien", CT.getThanhtien());
        cs.execute();
    }

    public void SuaCTDTO(CTHoaDonDTO CT) throws SQLException {
        String sql = "{call CTHoaDon_Sua(?,?,?,?,?,?)}";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString("MaHDBan", CT.getMaHDBan());
        cs.setString("Mahang", CT.getMahang());
        cs.setInt("Soluong", CT.getSoluong());
        cs.setDouble("Dongia", CT.getDongia());
        cs.setInt("Giamgia", CT.getGiamgia());
        cs.setDouble("Thanhtien", CT.getThanhtien());
        cs.execute();
    }

    public void XoaCTDTO(String ma1, String ma2) throws SQLException {
        String sql = "{call CTHoaDon_Xoa(?,?)}";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString("MaHDBan", ma1);
        cs.setString("Mahang", ma2);
        cs.execute();
    }

    public boolean getTrungMa(String ma1, String ma2) {
        Boolean ktra = true;
        try {
            String sql = "SELECT MaHDBan, Mahang FROM ChitietHDBan";
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while (rs.next()) {
                if (ma1.equals(rs.getString("MaHDBan")) && ma2.equals(rs.getString("Mahang"))) {
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
