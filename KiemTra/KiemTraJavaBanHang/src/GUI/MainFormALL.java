/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.HangGUI;
import GUI.CTHoaDonGUI;
import GUI.KhachHangGUI;
import GUI.NhanVienGUI;
import GUI.ChatLieuGUI;
import GUI.HDBanGUI;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thanh
 */
public class MainFormALL extends javax.swing.JFrame {

    /**
     * Creates new form MainFormALL
     */
    public MainFormALL() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        MnKhachHang = new javax.swing.JMenuItem();
        MnNhanVien = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        MnChatLieu = new javax.swing.JMenuItem();
        MnHangHoa = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        MnHoaDon = new javax.swing.JMenuItem();
        MnChiTietHoaDon = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Chủ thể");

        MnKhachHang.setMnemonic('o');
        MnKhachHang.setText("Khách hàng");
        MnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnKhachHangActionPerformed(evt);
            }
        });
        fileMenu.add(MnKhachHang);

        MnNhanVien.setMnemonic('s');
        MnNhanVien.setText("Nhân viên");
        MnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnNhanVienActionPerformed(evt);
            }
        });
        fileMenu.add(MnNhanVien);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Hàng hóa");

        MnChatLieu.setMnemonic('t');
        MnChatLieu.setText("Chất liệu");
        MnChatLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnChatLieuActionPerformed(evt);
            }
        });
        editMenu.add(MnChatLieu);

        MnHangHoa.setMnemonic('y');
        MnHangHoa.setText("Hàng hóa");
        MnHangHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnHangHoaActionPerformed(evt);
            }
        });
        editMenu.add(MnHangHoa);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Hóa đơn");

        MnHoaDon.setMnemonic('a');
        MnHoaDon.setText("Hóa đơn");
        MnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnHoaDonActionPerformed(evt);
            }
        });
        helpMenu.add(MnHoaDon);

        MnChiTietHoaDon.setText("Chi tiết hóa đơn");
        MnChiTietHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnChiTietHoaDonActionPerformed(evt);
            }
        });
        helpMenu.add(MnChiTietHoaDon);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnKhachHangActionPerformed

        try {
            // TODO add your handling code here:
            KhachHangGUI kh = new KhachHangGUI();
            kh.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainFormALL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnKhachHangActionPerformed

    private void MnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnNhanVienActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            NhanVienGUI NV = new NhanVienGUI();
            NV.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainFormALL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnNhanVienActionPerformed

    private void MnChatLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnChatLieuActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            ChatLieuGUI CL = new ChatLieuGUI();
            CL.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainFormALL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnChatLieuActionPerformed

    private void MnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnHoaDonActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            HDBanGUI HD = new HDBanGUI();
            HD.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainFormALL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnHoaDonActionPerformed

    private void MnChiTietHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnChiTietHoaDonActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            CTHoaDonGUI CT = new CTHoaDonGUI();
            CT.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainFormALL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnChiTietHoaDonActionPerformed

    private void MnHangHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnHangHoaActionPerformed
        // TODO add your handling code here:
       try {
            // TODO add your handling code here:
            HangGUI HH = new HangGUI();
            HH.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainFormALL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnHangHoaActionPerformed

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
            java.util.logging.Logger.getLogger(MainFormALL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFormALL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFormALL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFormALL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFormALL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MnChatLieu;
    private javax.swing.JMenuItem MnChiTietHoaDon;
    private javax.swing.JMenuItem MnHangHoa;
    private javax.swing.JMenuItem MnHoaDon;
    private javax.swing.JMenuItem MnKhachHang;
    private javax.swing.JMenuItem MnNhanVien;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
