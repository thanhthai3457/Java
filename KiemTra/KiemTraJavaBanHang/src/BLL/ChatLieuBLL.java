/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.ChatLieuDAL;
import DTO.ChatLieuDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thanh
 */
public class ChatLieuBLL {
    ChatLieuDAL CLDAL = new ChatLieuDAL();
    
    public void Load_DS(JTable tbl) throws SQLException{
        Object[] Tieude = new Object[]{"Mã chất liệu","Tên chất liệu"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(Tieude);
        Vector tbRowdata;
        for (ChatLieuDTO CL : getAll()){
            tbRowdata = new Vector();
            tbRowdata.add(CL.getMachatlieu());
            tbRowdata.add(CL.getTenchatlieu());
            model.addRow(tbRowdata);
        }
        tbl.setModel(model);
        tbl.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
    }
    public ArrayList<ChatLieuDTO> getAll() throws SQLException{
        return CLDAL.getAll();
    }
    
    public void ThemCL(ChatLieuDTO CL) throws SQLException{
//        if(NV.getManhanvien().isEmpty() || NV.getTennhanvien().isEmpty() || NV.getDiachi().isEmpty()
//                || NV.getDienthoai().isEmpty() || NV.getNgaysinh().isEmpty())
//            JOptionPane.showMessageDialog(null, "Bạn chưa nhập đủ dữ liệu");
//        else if(new CheckTrungKhoa().CheckID("Nhanvien", "Manhanvien", NV.getManhanvien()))
//            JOptionPane.showConfirmDialog(null, "Trùng mã nhân viên", "Lỗi", JOptionPane.ERROR_MESSAGE);
//        else 
            CLDAL.ThemCLDTO(CL);
    }
    public void SuaCL(ChatLieuDTO CL) throws SQLException{
        CLDAL.SuaCLDTO(CL);
    }
    public void XoaCL(String ma) throws SQLException{
        CLDAL.XoaCLDTO(ma);
    }
    
    public boolean getTrungMa(String ma) {
        return CLDAL.getTrungMa(ma); //To change body of generated methods, choose Tools | Templates.
    }
}
