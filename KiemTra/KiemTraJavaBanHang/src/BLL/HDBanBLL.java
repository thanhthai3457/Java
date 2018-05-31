/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.HDBanDAL;
import DTO.HDBanDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thanh
 */
public class HDBanBLL {
     HDBanDAL HDDAL = new HDBanDAL();
    
    public void Load_DS(JTable tbl) throws SQLException{
        Object[] Tieude = new Object[]{"Mã hóa đơn","Ngày bán","Tổng tiền","Mã kháchi","Mã nhân viên"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(Tieude);
        Vector tbRowdata;
        for (HDBanDTO HD : getAll()){
            tbRowdata = new Vector();
            tbRowdata.add(HD.getMaHDBan());
            tbRowdata.add(HD.getNgayban());
            tbRowdata.add(HD.getTongtien());
            tbRowdata.add(HD.getMakhach());
            tbRowdata.add(HD.getManhanvien());
            model.addRow(tbRowdata);
        }
        tbl.setModel(model);
        tbl.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
    }
    
    public ArrayList<HDBanDTO> getAll() throws SQLException{
        return HDDAL.getAll();
    }
    
    public void ThemHD(HDBanDTO HD) throws SQLException{
            HDDAL.ThemHDDTO(HD);
    }
    public void SuaHD(HDBanDTO HD) throws SQLException{
            HDDAL.SuaHDDTO(HD);
    }
    public void XoaHD(String ma) throws SQLException{
        HDDAL.XoaHDDTO(ma);
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
        return HDDAL.getTrungMa(ma); //To change body of generated methods, choose Tools | Templates.
    }
}
