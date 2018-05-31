/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.NhanVienBLL;
import DTO.NhanVienDTO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import DAL.CheckTrungKhoa;
import javax.swing.table.TableModel;

/**
 *
 * @author thanh
 */
public class NhanVienGUI extends javax.swing.JFrame {

    NhanVienBLL NVBLL = new NhanVienBLL();

    /**
     * Creates new form NhanVienGUI
     */
    public NhanVienGUI() throws SQLException {
        initComponents();
        NVBLL.Load_DS(TableNV);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gioitinh = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        raNam = new javax.swing.JRadioButton();
        raNu = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JTextField();
        txtDienthoai = new javax.swing.JTextField();
        txtNgaysinh = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();
        tblNV = new javax.swing.JScrollPane();
        TableNV = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Mã nhân viên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Tên nhân viên:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Giới tính:");

        txtTenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenNVActionPerformed(evt);
            }
        });

        Gioitinh.add(raNam);
        raNam.setText("Nam");
        raNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raNamActionPerformed(evt);
            }
        });

        Gioitinh.add(raNu);
        raNu.setText("Nữ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Địa chỉ:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Điện thoại:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Ngày sinh:");

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
                    .addComponent(jLabel3)
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(raNam, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(raNu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMaNV, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenNV))
                                .addGap(81, 81, 81)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDiachi)
                            .addComponent(txtDienthoai)
                            .addComponent(txtNgaysinh, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(raNam)
                    .addComponent(raNu)
                    .addComponent(jLabel6)
                    .addComponent(txtNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnDong))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TableNV.setModel(new javax.swing.table.DefaultTableModel(
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
        TableNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableNVMouseClicked(evt);
            }
        });
        tblNV.setViewportView(TableNV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tblNV, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tblNV, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void raNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raNamActionPerformed

    private void txtTenNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenNVActionPerformed

    private void txtDiachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiachiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiachiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        NhanVienDTO NV = new NhanVienDTO();
        if (txtMaNV.getText().equals("") || txtMaNV.getText().equals("") || txtTenNV.getText().equals("") || txtDiachi.getText().equals("") || txtDienthoai.getText().equals("") || txtNgaysinh.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Có chỗ bạn chưa nhập dữ liệu.");
        } else {
            try {
                if (NVBLL.getTrungMa(txtMaNV.getText())) {
                    JOptionPane.showMessageDialog(null, "Mã nhân viên bị trùng.");
                } else {
                    int dt = Integer.parseInt(txtDienthoai.getText());
                    NV.setManhanvien(txtMaNV.getText());
                    NV.setTennhanvien(txtTenNV.getText());
                    boolean gt = true;
                    if (!raNam.isSelected()) {
                        gt = false;
                    }
                    NV.setGioitinh(gt);
                    NV.setDiachi(txtDiachi.getText());
                    NV.setDienthoai(txtDienthoai.getText());
                    NV.setNgaysinh(txtNgaysinh.getText());
                    try {
                        NVBLL.ThemNV(NV);
                        NVBLL.Load_DS(TableNV);
                    } catch (SQLException ex) {
                        Logger.getLogger(NhanVienGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Clear_ALL();
                    JOptionPane.showMessageDialog(null, "Thêm nhân viên thành công.");
                }
            } catch (Exception e) {
                if (NVBLL.checkDT(txtDienthoai.getText()) == false) {
                    JOptionPane.showMessageDialog(null, "Điện thoại phải là số.");
                }
            }

        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        NhanVienDTO NV = new NhanVienDTO();
        int SelectRow = TableNV.getSelectedRow();
        if (SelectRow == -1) {
            JOptionPane.showMessageDialog(null, "Mời chọn một nhân viên.");
        } else {
            if (txtMaNV.getText().equals("") || txtMaNV.getText().equals("") || txtTenNV.getText().equals("") || txtDiachi.getText().equals("") || txtDienthoai.getText().equals("") || txtNgaysinh.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Có chỗ bạn chưa nhập dữ liệu.");
            } else {
                try {
                    NV.setManhanvien(txtMaNV.getText());
                    NV.setTennhanvien(txtTenNV.getText());
                    boolean gt = true;
                    if (!raNam.isSelected()) {
                        gt = false;
                    }
                    NV.setGioitinh(gt);
                    NV.setDiachi(txtDiachi.getText());
                    NV.setDienthoai(txtDienthoai.getText());
                    NV.setNgaysinh(txtNgaysinh.getText());
                    try {
                        NVBLL.SuaNV(NV);
                        NVBLL.Load_DS(TableNV);
                    } catch (SQLException ex) {
                        Logger.getLogger(NhanVienGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Clear_ALL();
                    JOptionPane.showMessageDialog(null, "Sửa nhân viên thành công.");
                } catch (Exception e) {
                    if (NVBLL.checkDT(txtDienthoai.getText()) == false) {
                        JOptionPane.showMessageDialog(null, "Điện thoại phải là số.");
                    }
                }

            }
        }

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int Selectrow = TableNV.getSelectedRow();
        if (Selectrow == -1) {
            JOptionPane.showMessageDialog(null, "Mời chọn một nhân viên.");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa nhân viên: \"" + txtMaNV.getText().toUpperCase() + "\" không?", "Thông Báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    // TODO add your handling code here:
                    String ma = txtMaNV.getText();
                    NVBLL.XoaNV(ma);
                    NVBLL.Load_DS(TableNV);
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

    private void TableNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableNVMouseClicked
        // TODO add your handling code here:
        int SelectRow = TableNV.getSelectedRow();
        TableModel model = TableNV.getModel();

        txtMaNV.setText(model.getValueAt(SelectRow, 0).toString());
        txtTenNV.setText(model.getValueAt(SelectRow, 1).toString());
        String GT = (model.getValueAt(SelectRow, 2).toString());
        if (GT == "Nam") {
            raNam.doClick();
        } else {
            raNu.doClick();
        }
        txtDiachi.setText(model.getValueAt(SelectRow, 3).toString());
        txtDienthoai.setText(model.getValueAt(SelectRow, 4).toString());
        txtNgaysinh.setText(model.getValueAt(SelectRow, 5).toString());
    }//GEN-LAST:event_TableNVMouseClicked

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
            java.util.logging.Logger.getLogger(NhanVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NhanVienGUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Gioitinh;
    private javax.swing.JTable TableNV;
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton raNam;
    private javax.swing.JRadioButton raNu;
    private javax.swing.JScrollPane tblNV;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtDienthoai;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgaysinh;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables

    private void Clear_ALL() {

        txtMaNV.setText("");
        txtTenNV.setText("");
        txtDiachi.setText("");
        txtDienthoai.setText("");
        txtNgaysinh.setText("");//To change body of generated methods, choose Tools | Templates.
    }

}