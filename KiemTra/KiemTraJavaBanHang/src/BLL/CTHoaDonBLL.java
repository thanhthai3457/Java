/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.CTHoaDonDAL;
import DTO.CTHoaDonDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thanh
 */
public class CTHoaDonBLL {
    CTHoaDonDAL CTDAL = new CTHoaDonDAL();
    
    public void Load_DS(JTable tbl) throws SQLException{
        Object[] Tieude = new Object[]{"Mã hàng","Tên hàng","Số lượng","Đơn giá nhập","Đơn giá bán","Ảnh","Ghi chú","Mã chất liệu"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(Tieude);
        Vector tbRowdata;
        for (CTHoaDonDTO CT : getAll()){
            tbRowdata = new Vector();
            tbRowdata.add(CT.getMaHDBan());
            tbRowdata.add(CT.getMahang());
            tbRowdata.add(CT.getSoluong());
            tbRowdata.add(CT.getDongia());
            tbRowdata.add(CT.getGiamgia());
            tbRowdata.add(CT.getThanhtien());
            model.addRow(tbRowdata);
        }
        tbl.setModel(model);
        tbl.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
    }
    
    public ArrayList<CTHoaDonDTO> getAll() throws SQLException{
        return CTDAL.getAll();
    }
    
    public void ThemCT(CTHoaDonDTO CT) throws SQLException{
            CTDAL.ThemCTDTO(CT);
    }
    public void SuaCT(CTHoaDonDTO CT) throws SQLException{
         CTDAL.SuaCTDTO(CT);
    }
    public void XoaCT(String ma1, String ma2) throws SQLException{
        CTDAL.XoaCTDTO(ma1, ma2);
    }
    public boolean checkSo(String So) {
        boolean kt = true;
        try {
            int d = Integer.parseInt(So);
            kt = true;
        } catch (Exception e) {
            kt = false;
        }
        return kt; //To change body of generated methods, choose Tools | Templates.
    }
    public boolean getTrungMa(String ma1, String ma2) {
        return CTDAL.getTrungMa(ma1, ma2); //To change body of generated methods, choose Tools | Templates.
    }
}
