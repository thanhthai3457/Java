/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.ComboBoxDAL;
import DAL.HangDAL;
import DTO.HangDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thanh
 */
public class HangBLL {
    HangDAL HHDAL = new HangDAL();
    
    public void Load_DS(JTable tbl) throws SQLException{
        Object[] Tieude = new Object[]{"Mã hàng","Tên hàng","Số lượng","Đơn giá nhập","Đơn giá bán","Ảnh","Ghi chú","Mã chất liệu"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(Tieude);
        Vector tbRowdata;
        for (HangDTO NV : getAll()){
            tbRowdata = new Vector();
            tbRowdata.add(NV.getMahang());
            tbRowdata.add(NV.getTenhang());
            tbRowdata.add(NV.getSoluong());
            tbRowdata.add(NV.getDongianhap());
            tbRowdata.add(NV.getDongiaban());
            tbRowdata.add(NV.getAnh());
            tbRowdata.add(NV.getGhichu());
            tbRowdata.add(NV.getMachatlieu());
            model.addRow(tbRowdata);
        }
        tbl.setModel(model);
        tbl.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
    }
    
    public ArrayList<HangDTO> getAll() throws SQLException{
        return HHDAL.getAll();
    }
    
    public void ThemHH(HangDTO HH) throws SQLException{
            HHDAL.ThemHHDTO(HH);
    }
    public void SuaHH(HangDTO HH) throws SQLException{
         HHDAL.SuaHHDTO(HH);
    }
    public void XoaHH(String ma) throws SQLException{
        HHDAL.XoaHHDTO(ma);
    }
    public boolean checkDG(String DG) {
        boolean kt = true;
        try {
            int d = Integer.parseInt(DG);
            kt = true;
        } catch (Exception e) {
            kt = false;
        }
        return kt; //To change body of generated methods, choose Tools | Templates.
    }
    public boolean getTrungMa(String ma) {
        return HHDAL.getTrungMa(ma); //To change body of generated methods, choose Tools | Templates.
    }

    public void LoadComboBoxMachatlieu(JComboBox cbb) {
        ComboBoxDAL cb = new ComboBoxDAL();
        cb.LoadComboBoxMachatlieu(cbb);
    } //To change body of generated methods, choose Tools | Templates.
    
}
