/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.NhanVienDTO;
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
public class NhanVienDAL {

    Connection conn = new Connect().getConnect();

    public ArrayList<NhanVienDTO> getAll() throws SQLException {
        ArrayList<NhanVienDTO> lstNhanVien = new ArrayList<>();
        String sql = "{call Nhanvien_DS}";
//      String sql = "Select * from Khach"; Cau lenh thuong.  
        CallableStatement cs = conn.prepareCall(sql);
        ResultSet rs = cs.executeQuery();
        if (!rs.next()) {
            System.out.println("Không có nhân viên nào");
        } else {
            do {
                NhanVienDTO NV = new NhanVienDTO();
                NV.setManhanvien(rs.getString("Manhanvien"));
                NV.setTennhanvien(rs.getString("Tennhanvien"));
                NV.setGioitinh(rs.getBoolean("Gioitinh"));
                NV.setDiachi(rs.getString("Diachi"));
                NV.setDienthoai(rs.getString("Dienthoai"));
                NV.setNgaysinh(rs.getString("Ngaysinh"));
                lstNhanVien.add(NV);
            } while (rs.next());
        }
        return lstNhanVien;
    }

    public void ThemNVDTO(NhanVienDTO NV) throws SQLException {
        String sql = "{call Nhanvien_Them(?,?,?,?,?,?)}";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString("Manhanvien", NV.getManhanvien());
        cs.setString("Tennhanvien", NV.getTennhanvien());
        cs.setBoolean("Gioitinh", NV.isGioitinh());
        cs.setString("Diachi", NV.getDiachi());
        cs.setString("Dienthoai", NV.getDienthoai());
        cs.setString("Ngaysinh", NV.getNgaysinh());
        cs.execute();
    }

    public void SuaNVDTO(NhanVienDTO NV) throws SQLException {
        String sql = "{call Nhanvien_Sua(?,?,?,?,?,?)}";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString("Manhanvien", NV.getManhanvien());
        cs.setString("Tennhanvien", NV.getTennhanvien());
        cs.setBoolean("Gioitinh", NV.isGioitinh());
        cs.setString("Diachi", NV.getDiachi());
        cs.setString("Dienthoai", NV.getDienthoai());
        cs.setString("Ngaysinh", NV.getNgaysinh());
        cs.execute();
    }

    public void XoaNVDTO(String ma) throws SQLException {
        String sql = "{call Nhanvien_Xoa(?)}";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString("Manhanvien", ma);
        cs.execute();
    }

    public boolean getTrungMa(String ma) {
        Boolean ktra = true;
        try {
            String sql = "SELECT Manhanvien FROM Nhanvien";
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while (rs.next()) {
                if (ma.equals(rs.getString("Manhanvien"))) {
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
