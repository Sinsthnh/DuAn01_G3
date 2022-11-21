/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.ebooks.main;

import com.ebooks.dao.TacGiaDAO;
import com.ebooks.dao.TheLoaiDAO;
import com.ebooks.model.Sach;
import com.ebooks.model.TheLoai;
import java.awt.Color;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Thinh
 */
public class BooksDiaLog extends javax.swing.JDialog {

    TacGiaDAO DAOTG = new TacGiaDAO();
    TheLoaiDAO DAOTL = new TheLoaiDAO();
    public BooksDiaLog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        fillComBoBox();
        setBackground(new Color(0,0,0,0));
    }
    
    public BooksDiaLog(java.awt.Frame parent, boolean modal, Sach sach) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0,0,0,0));
        txtDuongDan.setEditable(false);
        fillComBoBox();
        SetForm(sach);
    }
    
    
    public void fillComBoBox(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboTheLoai.getModel();
        model.removeAllElements();
        List<TheLoai> list = DAOTL.selectAll();
        for (TheLoai tl : list) {
            model.addElement(tl.getTenTheLoai());
        }     
    }
    
    
    public void SetForm(Sach sach){
        txtMaSach.setText(sach.getMaSach());
        txtTenSach.setText(sach.getTenSach());
        txtTacGia.setText(DAOTG.findById(sach.getMaTacGia()).getHoTen());
        txtDuongDan.setText(sach.getDuongDan());
        txtMoTa.setText(sach.getMoTa());
//        lblSachImg.setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelRadius2 = new com.ebooks.Compoment.PanelRadius();
        pnlExit1 = new com.ebooks.Compoment.PanelRound();
        lblExit1 = new javax.swing.JLabel();
        txtTenSach = new javax.swing.JTextField();
        txtMaSach = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnChonFile = new com.ebooks.Compoment.MyButton();
        jLabel19 = new javax.swing.JLabel();
        lblSachImg = new com.ebooks.Compoment.ImageBoder();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtDuongDan = new javax.swing.JTextField();
        cboTheLoai = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtTacGia = new javax.swing.JTextField();
        btnLuuThong = new com.ebooks.Compoment.MyButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRadius2.setBackground(new java.awt.Color(255, 255, 255));
        panelRadius2.setRadius(25);
        panelRadius2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlExit1.setBackground(new java.awt.Color(253, 127, 127));
        pnlExit1.setRoundBottomLeft(25);
        pnlExit1.setRoundTopRight(25);
        pnlExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlExit1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlExit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlExit1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlExit1MousePressed(evt);
            }
        });
        pnlExit1.setLayout(new java.awt.GridBagLayout());

        lblExit1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        lblExit1.setForeground(new java.awt.Color(255, 255, 255));
        lblExit1.setText("X");
        lblExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExit1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblExit1MousePressed(evt);
            }
        });
        pnlExit1.add(lblExit1, new java.awt.GridBagConstraints());

        panelRadius2.add(pnlExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 50, 50));

        txtTenSach.setBackground(new java.awt.Color(222, 247, 227));
        panelRadius2.add(txtTenSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 220, 40));

        txtMaSach.setBackground(new java.awt.Color(222, 247, 227));
        panelRadius2.add(txtMaSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 210, 40));

        jLabel6.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel6.setText("Mô Tả");
        panelRadius2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        jLabel2.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel2.setText("Tên Sách");
        panelRadius2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel3.setText("Thể Loại");
        panelRadius2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        btnChonFile.setBackground(new java.awt.Color(87, 190, 110));
        btnChonFile.setForeground(new java.awt.Color(255, 255, 255));
        btnChonFile.setText("File");
        btnChonFile.setBoderColor(new java.awt.Color(87, 190, 110));
        btnChonFile.setFont(new java.awt.Font("Inter SemiBold", 0, 14)); // NOI18N
        btnChonFile.setRadius(10);
        panelRadius2.add(btnChonFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 70, 40));

        jLabel19.setFont(new java.awt.Font("Inter ExtraBold", 0, 26)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(55, 149, 76));
        jLabel19.setText("Thông Tin Sách");
        panelRadius2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 210, -1));

        lblSachImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ebooks/Image/41b92ec3eab97e4c24b3f6e8fe75ddec.png"))); // NOI18N
        lblSachImg.setRadius(20);
        panelRadius2.add(lblSachImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 180, 180));

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane1.setViewportView(txtMoTa);

        panelRadius2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 384, 670, -1));

        jLabel7.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel7.setText("Mã Sách");
        panelRadius2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        txtDuongDan.setBackground(new java.awt.Color(222, 247, 227));
        panelRadius2.add(txtDuongDan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 370, 40));

        cboTheLoai.setBackground(new java.awt.Color(222, 247, 227));
        cboTheLoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelRadius2.add(cboTheLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 210, 40));

        jLabel5.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel5.setText("Tác Giả");
        panelRadius2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        txtTacGia.setBackground(new java.awt.Color(222, 247, 227));
        panelRadius2.add(txtTacGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 220, 40));

        btnLuuThong.setBackground(new java.awt.Color(87, 190, 110));
        btnLuuThong.setForeground(new java.awt.Color(255, 255, 255));
        btnLuuThong.setText("Lưu Thông Tin");
        btnLuuThong.setBoderColor(new java.awt.Color(87, 190, 110));
        btnLuuThong.setFont(new java.awt.Font("Inter SemiBold", 0, 14)); // NOI18N
        btnLuuThong.setRadius(10);
        panelRadius2.add(btnLuuThong, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 270, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ebooks/Image/nerds-removebg-preview.png"))); // NOI18N
        panelRadius2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(panelRadius2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblExit1MouseClicked

    private void pnlExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlExit1MouseClicked

    private void pnlExit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExit1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlExit1MouseEntered

    private void pnlExit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExit1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlExit1MouseExited

    private void pnlExit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExit1MousePressed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_pnlExit1MousePressed

    private void lblExit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExit1MousePressed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lblExit1MousePressed

    /*tbdSetting args the command line arguments
     */
   public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BooksDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BooksDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BooksDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BooksDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BooksDiaLog dialog = new BooksDiaLog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.ebooks.Compoment.MyButton btnChonFile;
    private com.ebooks.Compoment.MyButton btnLuuThong;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboTheLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblExit1;
    private com.ebooks.Compoment.ImageBoder lblSachImg;
    private com.ebooks.Compoment.PanelRadius panelRadius2;
    private com.ebooks.Compoment.PanelRound pnlExit1;
    private javax.swing.JTextField txtDuongDan;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtTacGia;
    private javax.swing.JTextField txtTenSach;
    // End of variables declaration//GEN-END:variables
}
