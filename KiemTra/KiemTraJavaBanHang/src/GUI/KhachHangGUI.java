/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.KhachHangBLL;
import DTO.KhachHangDTO;
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
public class KhachHangGUI extends javax.swing.JFrame {

    KhachHangBLL KHBLL = new KhachHangBLL();

    /**
     * Creates new form NhanVienGUI
     */
    public KhachHangGUI() throws SQLException {
        initComponents();
        KHBLL.Load_DS(TableKH);
    }

    public void Clear_ALL() {
        txtMaKH.setText("");
        txtTenKH.setText("");
        txtDiachi.setText("");
        txtDienthoai.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gioitinh = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JTextField();
        txtDienthoai = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();
        tblKH = new javax.swing.JScrollPane();
        TableKH = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Mã khách hàng:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Tên khách hàng:");

        txtTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKHActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Địa chỉ:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Điện thoại:");

        txtDiachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiachiActionPerformed(evt);
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                        .addComponent(btnDong))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(txtTenKH))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDiachi, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(txtDienthoai))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnDong))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        TableKH.setModel(new javax.swing.table.DefaultTableModel(
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
        TableKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableKHMouseClicked(evt);
            }
        });
        tblKH.setViewportView(TableKH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tblKH, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tblKH, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKHActionPerformed

    private void txtDiachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiachiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiachiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        KhachHangDTO KH = new KhachHangDTO();
        if (txtMaKH.getText().equals("") || txtTenKH.getText().equals("") || txtDiachi.getText().equals("") || txtDienthoai.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Có chỗ bạn chưa nhập dữ liệu.");
        } else {
            try {
                if (KHBLL.getTrungMa(txtMaKH.getText())) {
                    JOptionPane.showMessageDialog(null, "Mã khách hàng bị trùng.");
                } else {
                    int dt = Integer.parseInt(txtDienthoai.getText());
                    KH.setMakhach(txtMaKH.getText());
                    KH.setTenkhach(txtTenKH.getText());
                    KH.setDiachi(txtDiachi.getText());
                    KH.setDienthoai(txtDienthoai.getText());
                    try {
                        KHBLL.ThemKH(KH);
                        KHBLL.Load_DS(TableKH);
                        //   Load();
                    } catch (SQLException ex) {
                        Logger.getLogger(KhachHangGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Clear_ALL();
                    JOptionPane.showMessageDialog(null, "Thêm khách hàng thành công.");
                }

            } catch (Exception e) {
                if (KHBLL.checkDT(txtDienthoai.getText()) == false) {
                    JOptionPane.showMessageDialog(null, "Điện thoại phải là số.");
                }
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        KhachHangDTO KH = new KhachHangDTO();
        int SelectRow = TableKH.getSelectedRow();
        if (SelectRow == -1) {
            JOptionPane.showMessageDialog(null, "Mời chọn một khách hàng.");
        } else {
            if (txtMaKH.getText().equals("") || txtTenKH.getText().equals("") || txtDiachi.getText().equals("") || txtDienthoai.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Có chỗ bạn chưa nhập dữ liệu.");
            } else {
                try {
                    int dt = Integer.parseInt(txtDienthoai.getText());
                    KH.setMakhach(txtMaKH.getText());
                    KH.setTenkhach(txtTenKH.getText());
                    KH.setDiachi(txtDiachi.getText());
                    KH.setDienthoai(txtDienthoai.getText());
                    try {
                        KHBLL.SuaKH(KH);
                        KHBLL.Load_DS(TableKH);
                        //   Load();
                    } catch (SQLException ex) {
                        Logger.getLogger(KhachHangGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Clear_ALL();
                    JOptionPane.showMessageDialog(null, "Sửa khách hàng thành công.");
                } catch (Exception e) {
                    if (KHBLL.checkDT(txtDienthoai.getText()) == false) {
                        JOptionPane.showMessageDialog(null, "Điện thoại phải là số.");
                    }
                }     
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int Selectrow = TableKH.getSelectedRow();
        if (Selectrow == -1) {
            JOptionPane.showMessageDialog(null, "Mời chọn 1 khách hàng.");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa khách hàng: \"" + txtMaKH.getText().toUpperCase() + "\" không?", "Thông Báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    // TODO add your handling code here:
                    String ma = txtMaKH.getText();
                    KHBLL.XoaKH(ma);
                    KHBLL.Load_DS(TableKH);
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

    private void TableKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableKHMouseClicked
        // TODO add your handling code here:
        int SelectRow = TableKH.getSelectedRow();
        TableModel model = TableKH.getModel();

        txtMaKH.setText(model.getValueAt(SelectRow, 0).toString());
        txtTenKH.setText(model.getValueAt(SelectRow, 1).toString());
        txtDiachi.setText(model.getValueAt(SelectRow, 2).toString());
        txtDienthoai.setText(model.getValueAt(SelectRow, 3).toString());
    }//GEN-LAST:event_TableKHMouseClicked

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
            java.util.logging.Logger.getLogger(KhachHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhachHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhachHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhachHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KhachHangGUI kh = null;
                try {
                    kh = new KhachHangGUI();
                } catch (SQLException ex) {
                    Logger.getLogger(KhachHangGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                kh.setLocationRelativeTo(null);
                kh.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Gioitinh;
    private javax.swing.JTable TableKH;
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane tblKH;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtDienthoai;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables

}
