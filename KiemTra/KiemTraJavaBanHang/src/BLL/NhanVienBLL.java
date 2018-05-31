/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.CheckTrungKhoa;
import DAL.NhanVienDAL;
import DTO.NhanVienDTO;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author thanh
 */
public class NhanVienBLL {
    NhanVienDAL NVDAL = new NhanVienDAL();
    
    public void Load_DS(JTable tbl) throws SQLException{
        Object[] Tieude = new Object[]{"Mã nhân viên","Tên nhân viên","Giới tính","Địa chỉ","Điện thoại","Ngày sinh"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(Tieude);
        Vector tbRowdata;
        for (NhanVienDTO NV : getAll()){
            tbRowdata = new Vector();
            tbRowdata.add(NV.getManhanvien());
            tbRowdata.add(NV.getTennhanvien());
            tbRowdata.add(NV.isGioitinh()? "Nam" : "Nữ");
            tbRowdata.add(NV.getDiachi());
            tbRowdata.add(NV.getDienthoai());
            tbRowdata.add(NV.getNgaysinh());
            model.addRow(tbRowdata);
        }
        tbl.setModel(model);
        tbl.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
    }
    
    public ArrayList<NhanVienDTO> getAll() throws SQLException{
        return NVDAL.getAll();
    }
    
    public void ThemNV(NhanVienDTO NV) throws SQLException{
        if(NV.getManhanvien().isEmpty() || NV.getTennhanvien().isEmpty() || NV.getDiachi().isEmpty()
                || NV.getDienthoai().isEmpty() || NV.getNgaysinh().isEmpty())
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập đủ dữ liệu");
        else if(new CheckTrungKhoa().CheckID("Nhanvien", "Manhanvien", NV.getManhanvien()))
            JOptionPane.showConfirmDialog(null, "Trùng mã nhân viên", "Lỗi", JOptionPane.ERROR_MESSAGE);
        else 
            NVDAL.ThemNVDTO(NV);
    }
    public void SuaNV(NhanVienDTO NV) throws SQLException{
        NVDAL.SuaNVDTO(NV);
    }
    public void XoaNV(String ma) throws SQLException{
        NVDAL.XoaNVDTO(ma);
    }
    public boolean checkDT(String dt) {
        boolean kt = true;
        try {
            int d = Integer.parseInt(dt);
            kt = true;
        } catch (Exception e) {
            kt = false;
        }
        return kt; //To change body of generated methods, choose Tools | Templates.
    }
    public boolean getTrungMa(String ma) {
        return NVDAL.getTrungMa(ma); //To change body of generated methods, choose Tools | Templates.
    }
}
