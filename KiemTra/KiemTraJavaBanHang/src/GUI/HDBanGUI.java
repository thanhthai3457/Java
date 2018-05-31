/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.HDBanBLL;
import DTO.HDBanDTO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author thanh
 */
public class HDBanGUI extends javax.swing.JFrame {

    HDBanBLL HDBLL = new HDBanBLL();

    /**
     * Creates new form NhanVienGUI
     */
    public HDBanGUI() throws SQLException {
        initComponents();
        HDBLL.Load_DS(TableHD);
    }

    public void Clear_ALL() {
        txtMaHD.setText("");
        txtNgayban.setText("");
        txtTongtien.setText("");
        txtMaKH.setText("");
        txtMaNV.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gioitinh = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        txtNgayban = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTongtien = new javax.swing.JTextField();
        txtMaKH = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        tblKH = new javax.swing.JScrollPane();
        TableHD = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Mã hóa đơn:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Ngày bán:");

        txtNgayban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaybanActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Tổng tiền:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Mã khách:");

        txtTongtien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongtienActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnDong.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Mã nhân viên:");

        txtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(btnThem))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMaHD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(txtNgayban))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTongtien, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMaNV))))
                            .addComponent(btnDong, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNgayban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnDong))
                .addGap(31, 31, 31))
        );

        TableHD.setModel(new javax.swing.table.DefaultTableModel(
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
        TableHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableHDMouseClicked(evt);
            }
        });
        tblKH.setViewportView(TableHD);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tblKH, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(tblKH, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNgaybanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaybanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaybanActionPerformed

    private void txtTongtienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongtienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongtienActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        HDBanDTO HD = new HDBanDTO();
        if (txtMaHD.getText().equals("") || txtNgayban.getText().equals("") || txtTongtien.getText().equals("") || txtMaKH.getText().equals("") || txtMaNV.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Có chỗ bạn chưa nhập dữ liệu.");
        } else {
            try {
//                if (HDBLL.getTrungMa(txtMaHD.getText())) {
//                    JOptionPane.showMessageDialog(null, "Mã hóa đơn bị trùng.");
//                } else {
                    int tt = Integer.parseInt(txtTongtien.getText());
                    HD.setMaHDBan(txtMaHD.getText());
                    HD.setNgayban(txtNgayban.getText());
                    HD.setTongtien(Double.valueOf(txtTongtien.getText()));
                    HD.setMakhach(txtMaKH.getText());
                    HD.setManhanvien(txtMaNV.getText());
                    try {
                        HDBLL.ThemHD(HD);
                        HDBLL.Load_DS(TableHD);
                        //   Load();
                    } catch (SQLException ex) {
                        Logger.getLogger(HDBanGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Clear_ALL();
                    JOptionPane.showMessageDialog(null, "Thêm hóa đơn thành công.");
                

            } catch (Exception e) {
                if (HDBLL.checkDT(txtTongtien.getText()) == false) {
                    JOptionPane.showMessageDialog(null, "Tổng tiền phải là số.");
                }
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        HDBanDTO HD = new HDBanDTO();
        int SelectRow = TableHD.getSelectedRow();
        if (SelectRow == -1) {
            JOptionPane.showMessageDialog(null, "Mời chọn một hóa đơn.");
        } else {
            if (txtMaHD.getText().equals("") || txtNgayban.getText().equals("") || txtTongtien.getText().equals("") || txtMaKH.getText().equals("") || txtMaNV.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Có chỗ bạn chưa nhập dữ liệu.");
            } else {
                try {
                    int tt = Integer.parseInt(txtTongtien.getText());
                    HD.setMaHDBan(txtMaHD.getText());
                    HD.setNgayban(txtNgayban.getText());
                    HD.setTongtien(Double.valueOf(txtTongtien.getText()));
                    HD.setMakhach(txtMaKH.getText());
                    HD.setManhanvien(txtMaNV.getText());
                    try {
                        HDBLL.SuaHD(HD);
                        HDBLL.Load_DS(TableHD);
                        //   Load();
                    } catch (SQLException ex) {
                        Logger.getLogger(HDBanGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Clear_ALL();
                    JOptionPane.showMessageDialog(null, "Sửa hóa đơn thành công.");
                } catch (Exception e) {
                    if (HDBLL.checkDT(txtTongtien.getText()) == false) {
                        JOptionPane.showMessageDialog(null, "Tổng tiền phải là số.");
                    }
                }     
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int Selectrow = TableHD.getSelectedRow();
        if (Selectrow == -1) {
            JOptionPane.showMessageDialog(null, "Mời chọn một hóa đơn.");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa hóa đơn: \"" + txtMaHD.getText().toUpperCase() + "\" không?", "Thông Báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    // TODO add your handling code here:
                    String ma = txtMaHD.getText();
                    HDBLL.XoaHD(ma);
                    HDBLL.Load_DS(TableHD);
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
//            System.exit(0);
        }

    }//GEN-LAST:event_btnDongActionPerformed

    private void TableHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableHDMouseClicked
        // TODO add your handling code here:
        int SelectRow = TableHD.getSelectedRow();
        TableModel model = TableHD.getModel();

        txtMaHD.setText(model.getValueAt(SelectRow, 0).toString());
        txtNgayban.setText(model.getValueAt(SelectRow, 1).toString());
        txtTongtien.setText(model.getValueAt(SelectRow, 2).toString());
        txtMaKH.setText(model.getValueAt(SelectRow, 3).toString());
        txtMaNV.setText(model.getValueAt(SelectRow, 4).toString());
    }//GEN-LAST:event_TableHDMouseClicked

    private void txtMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNVActionPerformed

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
            java.util.logging.Logger.getLogger(HDBanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HDBanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HDBanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HDBanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HDBanGUI kh = null;
                try {
                    kh = new HDBanGUI();
                } catch (SQLException ex) {
                    Logger.getLogger(HDBanGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                kh.setLocationRelativeTo(null);
                kh.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Gioitinh;
    private javax.swing.JTable TableHD;
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane tblKH;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgayban;
    private javax.swing.JTextField txtTongtien;
    // End of variables declaration//GEN-END:variables

}
