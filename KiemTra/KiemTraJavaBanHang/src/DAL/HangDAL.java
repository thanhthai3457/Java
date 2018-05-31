/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.HangDTO;
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
public class HangDAL {

    Connection conn = new Connect().getConnect();

    public ArrayList<HangDTO> getAll() throws SQLException {
        ArrayList<HangDTO> lstHang = new ArrayList<>();
        String sql = "{call Hang_DS}";
//      String sql = "Select * from Khach"; Cau lenh thuong.  
        CallableStatement cs = conn.prepareCall(sql);
        ResultSet rs = cs.executeQuery();
        if (!rs.next()) {
            System.out.println("Không có hàng hóa nào");
        } else {
            do {
                HangDTO HH = new HangDTO();
                HH.setMahang(rs.getString("Mahang"));
                HH.setTenhang(rs.getString("Tenhang"));
                HH.setSoluong(rs.getInt("Soluong"));
                HH.setDongianhap(rs.getDouble("Dongianhap"));
                HH.setDongiaban(rs.getDouble("Dongiaban"));
                HH.setAnh(rs.getString("Anh"));
                HH.setGhichu(rs.getString("Ghichu"));
                HH.setMachatlieu(rs.getString("Machatlieu"));
                lstHang.add(HH);
            } while (rs.next());
        }
        return lstHang;
    }

    public void ThemHHDTO(HangDTO HH) throws SQLException {
        String sql = "{call Hang_Them(?,?,?,?,?,?,?,?)}";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString("Mahang", HH.getMahang());
        cs.setString("Tenhang", HH.getTenhang());
        cs.setInt("Soluong", HH.getSoluong());
        cs.setDouble("Dongianhap", HH.getDongianhap());
        cs.setDouble("Dongiaban", HH.getDongiaban());
        cs.setString("Anh", HH.getAnh());
        cs.setString("Ghichu", HH.getGhichu());
        cs.setString("Machatlieu", HH.getMachatlieu());
        cs.execute();
    }

    public void SuaHHDTO(HangDTO HH) throws SQLException {
        String sql = "{call Hang_Sua(?,?,?,?,?,?,?,?)}";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString("Mahang", HH.getMahang());
        cs.setString("Tenhang", HH.getTenhang());
        cs.setInt("Soluong", HH.getSoluong());
        cs.setDouble("Dongianhap", HH.getDongianhap());
        cs.setDouble("Dongiaban", HH.getDongiaban());
        cs.setString("Anh", HH.getAnh());
        cs.setString("Ghichu", HH.getGhichu());
        cs.setString("Machatlieu", HH.getMachatlieu());
        cs.execute();
    }

    public void XoaHHDTO(String ma) throws SQLException {
        String sql = "{call Hang_Xoa(?)}";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString("Mahang", ma);
        cs.execute();
    }

    public boolean getTrungMa(String ma) {
        Boolean ktra = true;
        try {
            String sql = "SELECT Mahang FROM Hang";
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while (rs.next()) {
                if (ma.equals(rs.getString("Mahang"))) {
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
