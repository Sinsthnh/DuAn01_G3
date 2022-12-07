/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.ebooks.main;

import com.ebooks.dao.LoaiSSDAO;
import com.ebooks.dao.TacGiaDAO;
import com.ebooks.dao.TheLoaiDAO;
import com.ebooks.model.Sach;
import com.ebooks.model.TheLoai;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author Thinh
 */
public class BooksDisplayDiaLog extends javax.swing.JDialog {
    
    TacGiaDAO DAOTG = new TacGiaDAO();
    TheLoaiDAO DAOTL = new TheLoaiDAO();
    LoaiSSDAO DAOLSS = new LoaiSSDAO();
    static String maSach;
    public BooksDisplayDiaLog(java.awt.Frame parent, boolean modal, Sach sach) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0,0,0,0));
        initMoving(this, pnlMainDialog);
        setLbl(sach);
    }
    
    
    public BooksDisplayDiaLog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0,0,0,0));
        initMoving(this, pnlMainDialog);
        
    }
    
    
    public void setLbl(Sach sach){
        lblMaSach.setText(sach.getMaSach());
        lblTenSach.setText(sach.getTenSach());
        lblTacGia.setText(DAOTG.findById(sach.getMaTacGia()).getHoTen());
        TheLoai theLoai = DAOTL.findById(DAOLSS.findByBook(sach.getMaSach()).getMaTheLoai());
        lblTheLoai.setText(theLoai.getTenTheLoai());
        txtMoTa.setText(sach.getMoTa());
    }
    
    private int x;
    private int y;
    
    public void initMoving(JDialog DiaLog, JPanel panel) {
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
                System.out.println("");
            }

        });
        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                DiaLog.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
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
        pnlMainDialog = new com.ebooks.Compoment.PanelRadius();
        pnlExit1 = new com.ebooks.Compoment.PanelRound();
        lblExit1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        imageBoder1 = new com.ebooks.Compoment.ImageBoder();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnDocNgay = new com.ebooks.Compoment.MyButton();
        lblTheLoai = new javax.swing.JLabel();
        lblMaSach = new javax.swing.JLabel();
        lblTenSach = new javax.swing.JLabel();
        lblTacGia = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMainDialog.setBackground(new java.awt.Color(255, 255, 255));
        pnlMainDialog.setRadius(25);
        pnlMainDialog.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        pnlMainDialog.add(pnlExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 50, 50));

        jLabel6.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel6.setText("Mô Tả");
        pnlMainDialog.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        jLabel2.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel2.setText("Tên Sách  :");
        pnlMainDialog.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel3.setText("Thể Loại   :");
        pnlMainDialog.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        jLabel19.setFont(new java.awt.Font("Inter ExtraBold", 0, 26)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(55, 149, 76));
        jLabel19.setText("Thông Tin Sách");
        pnlMainDialog.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 210, -1));

        imageBoder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ebooks/Image/41b92ec3eab97e4c24b3f6e8fe75ddec.png"))); // NOI18N
        imageBoder1.setRadius(20);
        pnlMainDialog.add(imageBoder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 180, 180));

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane1.setViewportView(txtMoTa);

        pnlMainDialog.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 670, 120));

        jLabel7.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel7.setText("Mã Sách   :");
        pnlMainDialog.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel5.setText("Tác Giả     :");
        pnlMainDialog.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        btnDocNgay.setBackground(new java.awt.Color(87, 190, 110));
        btnDocNgay.setForeground(new java.awt.Color(255, 255, 255));
        btnDocNgay.setText("Đọc Ngay");
        btnDocNgay.setBoderColor(new java.awt.Color(87, 190, 110));
        btnDocNgay.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        btnDocNgay.setRadius(10);
        btnDocNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocNgayActionPerformed(evt);
            }
        });
        pnlMainDialog.add(btnDocNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 270, 50));

        lblTheLoai.setFont(new java.awt.Font("Inter SemiBold", 0, 14)); // NOI18N
        lblTheLoai.setText("Bảo Mật - An Ninh Mạng");
        pnlMainDialog.add(lblTheLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 370, -1));

        lblMaSach.setFont(new java.awt.Font("Inter SemiBold", 0, 14)); // NOI18N
        lblMaSach.setText("Books001");
        pnlMainDialog.add(lblMaSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 370, -1));

        lblTenSach.setFont(new java.awt.Font("Inter SemiBold", 0, 14)); // NOI18N
        lblTenSach.setText("Hacker Lược Sử");
        pnlMainDialog.add(lblTenSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 360, -1));

        lblTacGia.setFont(new java.awt.Font("Inter SemiBold", 0, 14)); // NOI18N
        lblTacGia.setText("Steven Levy");
        pnlMainDialog.add(lblTacGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 140, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ebooks/Image/nerds-removebg-preview.png"))); // NOI18N
        pnlMainDialog.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(pnlMainDialog, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

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

    private void lblExit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExit1MousePressed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lblExit1MousePressed

    private void pnlExit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExit1MousePressed
        // TODO add your handling code here:
       this.dispose();
    }//GEN-LAST:event_pnlExit1MousePressed

    private void btnDocNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocNgayActionPerformed
        if(maSach != null){
            maSach = null;
        }
        maSach = lblMaSach.getText();
        this.dispose();
    }//GEN-LAST:event_btnDocNgayActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BooksDisplayDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BooksDisplayDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BooksDisplayDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BooksDisplayDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                BooksDisplayDiaLog dialog = new BooksDisplayDiaLog(new javax.swing.JFrame(), true);
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
    private com.ebooks.Compoment.MyButton btnDocNgay;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.ebooks.Compoment.ImageBoder imageBoder1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblExit1;
    private javax.swing.JLabel lblMaSach;
    private javax.swing.JLabel lblTacGia;
    private javax.swing.JLabel lblTenSach;
    private javax.swing.JLabel lblTheLoai;
    private com.ebooks.Compoment.PanelRound pnlExit1;
    private com.ebooks.Compoment.PanelRadius pnlMainDialog;
    private javax.swing.JTextArea txtMoTa;
    // End of variables declaration//GEN-END:variables
    
}
