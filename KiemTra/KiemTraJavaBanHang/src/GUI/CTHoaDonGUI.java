/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.CTHoaDonBLL;
import DTO.CTHoaDonDTO;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author thanh
 */
public class CTHoaDonGUI extends javax.swing.JFrame {

    CTHoaDonBLL CTBLL = new CTHoaDonBLL();

    /**
     * Creates new form HangGUI
     */
    public CTHoaDonGUI() throws SQLException {
        initComponents();
        CTBLL.Load_DS(TableCT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choice1 = new java.awt.Choice();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaHDBan = new javax.swing.JTextField();
        txtMahang = new javax.swing.JTextField();
        txtSoluong = new javax.swing.JTextField();
        txtDongia = new javax.swing.JTextField();
        txtGiamgia = new javax.swing.JTextField();
        txtThanhtien = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableCT = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 102), 3));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Mã hóa đơn:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Mã hàng:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Số lượng:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Đơn giá:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Giảm giá:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Thành tiền:");

        txtMahang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMahangActionPerformed(evt);
            }
        });

        txtSoluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoluongActionPerformed(evt);
            }
        });

        txtDongia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDongiaActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtSoluong)
                        .addComponent(txtMahang)
                        .addComponent(txtMaHDBan, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDong, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDongia, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(txtGiamgia)
                            .addComponent(txtThanhtien))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaHDBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtDongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMahang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtGiamgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtThanhtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnDong))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TableCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableCTMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableCT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMahangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMahangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMahangActionPerformed

    private void txtDongiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDongiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDongiaActionPerformed

    private void txtSoluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoluongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoluongActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        CTHoaDonDTO CT = new CTHoaDonDTO();
        if (txtMaHDBan.getText().equals("") || txtMahang.getText().equals("") || txtSoluong.getText().equals("") || txtDongia.getText().equals("") || txtGiamgia.getText().equals("") || txtThanhtien.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Có chỗ bạn chưa nhập dữ liệu.");
        } else {
            try {
                int sl = Integer.parseInt(txtSoluong.getText());
                int dgn = Integer.parseInt(txtDongia.getText());
                int dgb = Integer.parseInt(txtGiamgia.getText());
                CT.setMaHDBan(txtMaHDBan.getText());
                CT.setMahang(txtMahang.getText());
                CT.setSoluong(Integer.valueOf(txtSoluong.getText()));
                CT.setDongia(Double.valueOf(txtDongia.getText()));
                CT.setGiamgia(Integer.valueOf(txtGiamgia.getText()));
                CT.setThanhtien(Double.valueOf(txtThanhtien.getText()));
                try {
                    CTBLL.ThemCT(CT);
                    CTBLL.Load_DS(TableCT);
                    //   Load();
                } catch (SQLException ex) {
                    Logger.getLogger(KhachHangGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                Clear_ALL();
                JOptionPane.showMessageDialog(null, "Thêm chi tiết thành công.");
            } catch (Exception e) {
                if (CTBLL.checkSo(txtSoluong.getText()) == false || CTBLL.checkSo(txtDongia.getText()) == false || CTBLL.checkSo(txtGiamgia.getText()) == false || CTBLL.checkSo(txtThanhtien.getText()) == false) {
                    JOptionPane.showMessageDialog(null, "Số lượng, đơn giá, mức giảm giá và thành tiền phải là số.");
                }
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        CTHoaDonDTO CT = new CTHoaDonDTO();
        int SelectRow = TableCT.getSelectedRow();
        if (SelectRow == -1) {
            JOptionPane.showMessageDialog(null, "Mời chọn một chi tiết.");
        } else {
            if (txtMaHDBan.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Có chỗ bạn chưa nhập dữ liệu.");
            } else {
                try {
                    int sl = Integer.parseInt(txtSoluong.getText());
                    int dgn = Integer.parseInt(txtDongia.getText());
                    int dgb = Integer.parseInt(txtGiamgia.getText());
                    CT.setMaHDBan(txtMaHDBan.getText());
                    CT.setMahang(txtMahang.getText());
                    CT.setSoluong(Integer.valueOf(txtSoluong.getText()));
                    CT.setDongia(Double.valueOf(txtDongia.getText()));
                    CT.setGiamgia(Integer.valueOf(txtGiamgia.getText()));
                    CT.setThanhtien(Double.valueOf(txtThanhtien.getText()));
                    try {
                        CTBLL.SuaCT(CT);
                        CTBLL.Load_DS(TableCT);
                        //   Load();
                    } catch (SQLException ex) {
                        Logger.getLogger(KhachHangGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Clear_ALL();
                    JOptionPane.showMessageDialog(null, "Sửa hàng hóa thành công.");
                } catch (Exception e) {
                    if (CTBLL.checkSo(txtSoluong.getText()) == false || CTBLL.checkSo(txtDongia.getText()) == false || CTBLL.checkSo(txtGiamgia.getText()) == false || CTBLL.checkSo(txtThanhtien.getText()) == false) {
                        JOptionPane.showMessageDialog(null, "Số lượng, đơn giá, mức giảm giá và thành tiền phải là số.");
                    }
                }
            }
        }
    }

    /*   private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
    }//GEN-LAST:event_btnSuaActionPerformed
//*/
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int Selectrow = TableCT.getSelectedRow();
        if (Selectrow == -1) {
            JOptionPane.showMessageDialog(null, "Mời chọn một chi tiết.");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa chi tiết: \"" + txtMaHDBan.getText().toUpperCase() + "\" không?", "Thông Báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    // TODO add your handling code here:
                    String ma1 = txtMaHDBan.getText();
                    String ma2 = txtMahang.getText();
                    CTBLL.XoaCT(ma1, ma2);
                    CTBLL.Load_DS(TableCT);
                    JOptionPane.showMessageDialog(null, "Xóa thành công.");
                    //  Load();
                } catch (SQLException ex) {
//            Logger.getLogger(KhachHangGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            } // TODO add your handling code here:
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        // TODO add your handling code here:
        int hoi = JOptionPane.showConfirmDialog(null, "Bạn có muốn đóng cửa sổ này không?",
                null, JOptionPane.YES_NO_OPTION);
        if (hoi == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btnDongActionPerformed

    private void TableCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCTMouseClicked
        // TODO add your handling code here:
        int SelectRow = TableCT.getSelectedRow();
        TableModel model = TableCT.getModel();

        txtMaHDBan.setText(model.getValueAt(SelectRow, 0).toString());
        txtMahang.setText(model.getValueAt(SelectRow, 1).toString());
        txtSoluong.setText(model.getValueAt(SelectRow, 2).toString());
        txtDongia.setText(model.getValueAt(SelectRow, 3).toString());
        txtGiamgia.setText(model.getValueAt(SelectRow, 4).toString());
        txtThanhtien.setText(model.getValueAt(SelectRow, 5).toString());
    }//GEN-LAST:event_TableCTMouseClicked

    public void Clear_ALL() {
        txtMaHDBan.setText("");
        txtMahang.setText("");
        txtSoluong.setText("");
        txtDongia.setText("");
        txtGiamgia.setText("");
        txtThanhtien.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CTHoaDonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CTHoaDonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CTHoaDonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CTHoaDonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CTHoaDonGUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CTHoaDonGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableCT;
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private java.awt.Choice choice1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDongia;
    private javax.swing.JTextField txtGiamgia;
    private javax.swing.JTextField txtMaHDBan;
    private javax.swing.JTextField txtMahang;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtThanhtien;
    // End of variables declaration//GEN-END:variables
}
