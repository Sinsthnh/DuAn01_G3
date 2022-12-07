/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.ebooks.main;

import com.ebooks.helper.ShareHelper;
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
public class TimeNotifyDialog extends javax.swing.JDialog {

    /**
     * Creates new form TimeNotifyDialog
     */
    public TimeNotifyDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        runTimer();
        setLbl();
    }
    
    public TimeNotifyDialog() {
//        super(parent, modal);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        runTimer();
        setLbl();
    }
    
//    public void parent(java.awt.Frame parent, boolean modal){
////        super(parent, modal);   
//    }
    
    
    public void setLbl(){
        if(ShareHelper.USER != null){
            lblMaNguoiDung.setText(ShareHelper.USER.getMaNguoiDung());
            lblTenDangNhap.setText(ShareHelper.USER.getTenDangNhap());
            lblThoiLuong.setText(String.valueOf(ShareHelper.USER.getThoiLuong()));
        }
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

    public void runTimer() {

        Thread t = new Thread() {
            int tic = -1;
            int sec = 0;
            int min = 0;
            int hour = 0;

            @Override
            public void run() {
                while (true) {
                    try {
                        tic++;
                        if (tic == 100) {
                            sec += 1;
                            tic = 0;
                        }
                        if (sec == 60) {
                            min += 1;
                            sec = 0;
                        }
                        if (min == 60) {
                            hour += 1;
                            min = 0;
                        }
                        lblTic.setText(String.valueOf(tic));
                        lblSec.setText(String.valueOf(sec + " :"));
                        lblMin.setText(String.valueOf(": " + min + " :"));
                        lblHour.setText(String.valueOf(hour));
                        Thread.sleep(10);   //thread tạm dừng hoạt động trong 10 ms
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        t.start();       //thread bắt đầu hoạt động

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRadius1 = new com.ebooks.Compoment.PanelRadius();
        pnlExit1 = new com.ebooks.Compoment.PanelRound();
        lblExit1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblMaNguoiDung = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTenDangNhap = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblThoiLuong = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblHour = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        lblSec = new javax.swing.JLabel();
        lblTic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRadius1.setBackground(new java.awt.Color(242, 255, 245));
        panelRadius1.setRadius(10);
        panelRadius1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRadius1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRadius1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelRadius1MousePressed(evt);
            }
        });
        panelRadius1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlExit1.setBackground(new java.awt.Color(253, 127, 127));
        pnlExit1.setRoundBottomLeft(10);
        pnlExit1.setRoundTopRight(10);
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

        panelRadius1.add(pnlExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 50, 50));

        jLabel7.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel7.setText("Mã Người Dùng        :");
        panelRadius1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        lblMaNguoiDung.setFont(new java.awt.Font("Inter SemiBold", 0, 14)); // NOI18N
        lblMaNguoiDung.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMaNguoiDung.setText("ND002");
        panelRadius1.add(lblMaNguoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 160, -1));

        jLabel2.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel2.setText("Tên Đăng Nhập        :");
        panelRadius1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        lblTenDangNhap.setFont(new java.awt.Font("Inter SemiBold", 0, 14)); // NOI18N
        lblTenDangNhap.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTenDangNhap.setText("LuNT123");
        panelRadius1.add(lblTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 150, -1));

        jLabel5.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel5.setText("Thời Gian Thuê         :");
        panelRadius1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        lblThoiLuong.setFont(new java.awt.Font("Inter SemiBold", 0, 14)); // NOI18N
        lblThoiLuong.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblThoiLuong.setText("02:00:00");
        panelRadius1.add(lblThoiLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 140, -1));

        jLabel3.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel3.setText(" Thời Gian Đã Dùng   :");
        panelRadius1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 210, 150, -1));

        jLabel19.setFont(new java.awt.Font("Inter ExtraBold", 0, 26)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(55, 149, 76));
        jLabel19.setText("Thông Tin Thuê");
        panelRadius1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 210, -1));

        lblHour.setFont(new java.awt.Font("Inter SemiBold", 0, 12)); // NOI18N
        lblHour.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHour.setText("0 ");
        panelRadius1.add(lblHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 20, 20));

        lblMin.setFont(new java.awt.Font("Inter SemiBold", 0, 12)); // NOI18N
        lblMin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMin.setText("0 ");
        panelRadius1.add(lblMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 20, 20));

        lblSec.setFont(new java.awt.Font("Inter SemiBold", 0, 12)); // NOI18N
        lblSec.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSec.setText("0 ");
        panelRadius1.add(lblSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 30, 20));

        lblTic.setFont(new java.awt.Font("Inter SemiBold", 0, 12)); // NOI18N
        lblTic.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTic.setText("0");
        panelRadius1.add(lblTic, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 20, 20));

        getContentPane().add(panelRadius1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 250));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblExit1MouseClicked

    private void lblExit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExit1MousePressed
        // TODO add your handling code here:
         setVisible(false);
    }//GEN-LAST:event_lblExit1MousePressed

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
        setVisible(false);
    }//GEN-LAST:event_pnlExit1MousePressed

    private void panelRadius1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRadius1MouseEntered
        panelRadius1.setBackground(new Color(202, 248, 213));
    }//GEN-LAST:event_panelRadius1MouseEntered

    private void panelRadius1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRadius1MouseExited
        panelRadius1.setBackground(new Color(242, 255, 245));
    }//GEN-LAST:event_panelRadius1MouseExited

    private void panelRadius1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRadius1MousePressed
           initMoving(this, panelRadius1);
    }//GEN-LAST:event_panelRadius1MousePressed

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
            java.util.logging.Logger.getLogger(TimeNotifyDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimeNotifyDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimeNotifyDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimeNotifyDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TimeNotifyDialog dialog = new TimeNotifyDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblExit1;
    private javax.swing.JLabel lblHour;
    private javax.swing.JLabel lblMaNguoiDung;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblSec;
    private javax.swing.JLabel lblTenDangNhap;
    private javax.swing.JLabel lblThoiLuong;
    private javax.swing.JLabel lblTic;
    private com.ebooks.Compoment.PanelRadius panelRadius1;
    private com.ebooks.Compoment.PanelRound pnlExit1;
    // End of variables declaration//GEN-END:variables
}
