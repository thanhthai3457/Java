/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.KhachHangDAL;
import DTO.KhachHangDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thanh
 */
public class KhachHangBLL {
    KhachHangDAL KHDAL = new KhachHangDAL();
    
    public void Load_DS(JTable tbl) throws SQLException{
        Object[] Tieude = new Object[]{"Mã khách hàng","Tên khách hàng","Địa chỉ","Điện thoại"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(Tieude);
        
        Vector tbRowdata;
        for (KhachHangDTO KH : getAll()){
            tbRowdata = new Vector();
            tbRowdata.add(KH.getMakhach());
            tbRowdata.add(KH.getTenkhach());
            tbRowdata.add(KH.getDiachi());
            tbRowdata.add(KH.getDienthoai());
            model.addRow(tbRowdata);
        }
        tbl.setModel(model);
        
    }
    
    public ArrayList<KhachHangDTO> getAll() throws SQLException{
        return KHDAL.getAll();
    }
    
    public void ThemKH(KhachHangDTO KH) throws SQLException{
        KHDAL.ThemKHDTO(KH);
    }
    public void SuaKH(KhachHangDTO KH) throws SQLException{
        KHDAL.SuaKHDTO(KH);
    }
    public void XoaKH(String ma) throws SQLException{
        KHDAL.XoaKHDTO(ma);
    }

    public boolean getTrungMa(String ma) {
        return KHDAL.getTrungMa(ma); //To change body of generated methods, choose Tools | Templates.
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
}
