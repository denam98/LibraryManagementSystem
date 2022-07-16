/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LibMS.Frames;

import com.LibMS.Common.DBConnect;
import com.LibMS.Common.SystemData;
import com.LibMS.Common.SystemLogger;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author B.M.D.C.Bandara
 */
public class MemberManagement extends javax.swing.JFrame {

    /**
     * Creates new form MemberManagement
     */
    public MemberManagement() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            SystemLogger.initLogger(MemberManagement.class).error("Exception from class constructor.", ex);
            System.out.println(ex);
        }
        initComponents();
        setLocationRelativeTo(null);
        setImage(new File("pics/backW.png"), lab_img_back);
        setUserName();
        moveImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        label_name = new javax.swing.JLabel();
        lab_img_back = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLayeredPane10 = new javax.swing.JLayeredPane();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLayeredPane11 = new javax.swing.JLayeredPane();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLayeredPane9 = new javax.swing.JLayeredPane();
        jLabel19 = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLayeredPane8 = new javax.swing.JLayeredPane();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(17, 184, 218));
        kGradientPanel1.setkStartColor(new java.awt.Color(17, 184, 218));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_name.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        label_name.setForeground(new java.awt.Color(255, 255, 255));
        label_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_name.setText("Hello!");
        kGradientPanel1.add(label_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 250, 250, 41));

        lab_img_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lab_img_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_img_backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_img_backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_img_backMouseExited(evt);
            }
        });
        kGradientPanel1.add(lab_img_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Member");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 420, 90));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Management");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 360, 420, 90));

        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane10.setBackground(new Color(1.0f,1.0f,1.0f,0.6f));
        jLayeredPane10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jLayeredPane10.setForeground(new java.awt.Color(255, 255, 255));
        jLayeredPane10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLayeredPane10.setPreferredSize(new java.awt.Dimension(320, 135));
        jLayeredPane10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLayeredPane10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLayeredPane10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLayeredPane10MouseExited(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Accept");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Member Fee");

        jLayeredPane10.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane10Layout = new javax.swing.GroupLayout(jLayeredPane10);
        jLayeredPane10.setLayout(jLayeredPane10Layout);
        jLayeredPane10Layout.setHorizontalGroup(
            jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jLayeredPane10Layout.setVerticalGroup(
            jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane10Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLayeredPane2.add(jLayeredPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 320, 150));

        jLayeredPane11.setBackground(new Color(1.0f,1.0f,1.0f,0.6f));
        jLayeredPane11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jLayeredPane11.setForeground(new java.awt.Color(255, 255, 255));
        jLayeredPane11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLayeredPane11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLayeredPane11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLayeredPane11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLayeredPane11MouseExited(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("View /");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Update");

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Member");

        jLayeredPane11.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane11Layout = new javax.swing.GroupLayout(jLayeredPane11);
        jLayeredPane11.setLayout(jLayeredPane11Layout);
        jLayeredPane11Layout.setHorizontalGroup(
            jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane11Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jLayeredPane11Layout.setVerticalGroup(
            jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane11Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLayeredPane2.add(jLayeredPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 320, 150));

        jLayeredPane9.setBackground(new Color(1.0f,1.0f,1.0f,0.6f));
        jLayeredPane9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jLayeredPane9.setForeground(new java.awt.Color(255, 255, 255));
        jLayeredPane9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLayeredPane9.setPreferredSize(new java.awt.Dimension(320, 135));
        jLayeredPane9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLayeredPane9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLayeredPane9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLayeredPane9MouseExited(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Add New Member");

        jLayeredPane9.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane9Layout = new javax.swing.GroupLayout(jLayeredPane9);
        jLayeredPane9.setLayout(jLayeredPane9Layout);
        jLayeredPane9Layout.setHorizontalGroup(
            jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane9Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel19)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jLayeredPane9Layout.setVerticalGroup(
            jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane9Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jLayeredPane2.add(jLayeredPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 150));

        jLayeredPane3.setBackground(new Color(1.0f,1.0f,1.0f,0.6f));
        jLayeredPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jLayeredPane3.setForeground(new java.awt.Color(255, 255, 255));
        jLayeredPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLayeredPane3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLayeredPane3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLayeredPane3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLayeredPane3MouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Payment");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("History");

        jLayeredPane3.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jLayeredPane2.add(jLayeredPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 180, 310));

        jLayeredPane8.setBackground(new Color(1.0f,1.0f,1.0f,0.6f));
        jLayeredPane8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jLayeredPane8.setForeground(new java.awt.Color(255, 255, 255));
        jLayeredPane8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLayeredPane8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLayeredPane8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLayeredPane8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLayeredPane8MouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Outdated");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Fee");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Payments");

        jLayeredPane8.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane8Layout = new javax.swing.GroupLayout(jLayeredPane8);
        jLayeredPane8.setLayout(jLayeredPane8Layout);
        jLayeredPane8Layout.setHorizontalGroup(
            jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jLayeredPane8Layout.setVerticalGroup(
            jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane2.add(jLayeredPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 180, 150));

        kGradientPanel1.add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 590, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lab_img_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_img_backMouseClicked
        this.dispose();
    }//GEN-LAST:event_lab_img_backMouseClicked

    private void lab_img_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_img_backMouseEntered
        setImage(new File("pics/backB.png"), lab_img_back);
    }//GEN-LAST:event_lab_img_backMouseEntered

    private void lab_img_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_img_backMouseExited
        setImage(new File("pics/backW.png"), lab_img_back);
    }//GEN-LAST:event_lab_img_backMouseExited

    private void jLayeredPane10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane10MouseClicked
        new MemberFee().setVisible(true);
    }//GEN-LAST:event_jLayeredPane10MouseClicked

    private void jLayeredPane10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane10MouseEntered
        jLayeredPane10.setOpaque(true);
        jLayeredPane10.setBackground(new Color(1.0f, 1.0f, 1.0f, 1.0f));
        jLabel20.setForeground(new Color(64, 64, 64));
        jLabel21.setForeground(new Color(64, 64, 64));
    }//GEN-LAST:event_jLayeredPane10MouseEntered

    private void jLayeredPane10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane10MouseExited
        jLayeredPane10.setOpaque(false);
        jLayeredPane10.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
        jLabel20.setForeground(Color.WHITE);
        jLabel21.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLayeredPane10MouseExited

    private void jLayeredPane11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane11MouseClicked
        new AddViewMember().setVisible(true);
    }//GEN-LAST:event_jLayeredPane11MouseClicked

    private void jLayeredPane11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane11MouseEntered
        jLayeredPane11.setOpaque(true);
        jLayeredPane11.setBackground(new Color(1.0f, 1.0f, 1.0f, 1.0f));
        jLabel22.setForeground(new Color(64, 64, 64));
        jLabel23.setForeground(new Color(64, 64, 64));
        jLabel24.setForeground(new Color(64, 64, 64));
    }//GEN-LAST:event_jLayeredPane11MouseEntered

    private void jLayeredPane11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane11MouseExited
        jLayeredPane11.setOpaque(false);
        jLayeredPane11.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
        jLabel22.setForeground(Color.WHITE);
        jLabel23.setForeground(Color.WHITE);
        jLabel24.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLayeredPane11MouseExited

    private void jLayeredPane9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane9MouseClicked
        AddViewMember instance = new AddViewMember();
        instance.setVisible(true);
        instance.layer_addMem.setVisible(true);
        instance.jLabel1.setText("Add Members");
        instance.layer_viewMem.setVisible(false);
    }//GEN-LAST:event_jLayeredPane9MouseClicked

    private void jLayeredPane9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane9MouseEntered
        jLayeredPane9.setOpaque(true);
        jLayeredPane9.setBackground(new Color(1.0f, 1.0f, 1.0f, 1.0f));
        jLabel19.setForeground(new Color(64, 64, 64));
    }//GEN-LAST:event_jLayeredPane9MouseEntered

    private void jLayeredPane9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane9MouseExited
        jLayeredPane9.setOpaque(false);
        jLayeredPane9.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
        jLabel19.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLayeredPane9MouseExited

    private void jLayeredPane3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane3MouseClicked
        new MemFeePaymentHistory().setVisible(true);
    }//GEN-LAST:event_jLayeredPane3MouseClicked

    private void jLayeredPane3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane3MouseEntered
        jLayeredPane3.setOpaque(true);
        jLayeredPane3.setBackground(new Color(1.0f, 1.0f, 1.0f, 1.0f));
        jLabel3.setForeground(new Color(64, 64, 64));
        jLabel4.setForeground(new Color(64, 64, 64));
    }//GEN-LAST:event_jLayeredPane3MouseEntered

    private void jLayeredPane3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane3MouseExited
        jLayeredPane3.setOpaque(false);
        jLayeredPane3.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
        jLabel3.setForeground(Color.WHITE);
        jLabel4.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLayeredPane3MouseExited

    private void jLayeredPane8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane8MouseClicked
        new OutdatedMemFee().setVisible(true);
    }//GEN-LAST:event_jLayeredPane8MouseClicked

    private void jLayeredPane8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane8MouseEntered
        jLayeredPane8.setOpaque(true);
        jLayeredPane8.setBackground(new Color(1.0f, 1.0f, 1.0f, 1.0f));
        jLabel15.setForeground(new Color(64, 64, 64));
        jLabel16.setForeground(new Color(64, 64, 64));
        jLabel17.setForeground(new Color(64, 64, 64));
    }//GEN-LAST:event_jLayeredPane8MouseEntered

    private void jLayeredPane8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane8MouseExited
        jLayeredPane8.setOpaque(false);
        jLayeredPane8.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
        jLabel15.setForeground(Color.WHITE);
        jLabel16.setForeground(Color.WHITE);
        jLabel17.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLayeredPane8MouseExited

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            SystemLogger.initLogger(MemberManagement.class).error("Exception from main method.", ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MemberManagement().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane10;
    private javax.swing.JLayeredPane jLayeredPane11;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane8;
    private javax.swing.JLayeredPane jLayeredPane9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lab_img_back;
    private javax.swing.JLabel label_name;
    // End of variables declaration//GEN-END:variables

    private void setImage(File imgFile, JLabel labelName) {
        try {
            Image image = ImageIO.read(new FileInputStream(imgFile));
            image = image.getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_SMOOTH);
            labelName.setIcon(new ImageIcon(image));
        } catch (IOException ex) {
            SystemLogger.initLogger(MemberManagement.class).error("IOException from setImage().", ex);
            System.out.println(ex);
        }
    }

    public void moveImage() {
        Timer anim = new Timer(true);
        anim.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                label_name.setLocation(label_name.getLocation().x, label_name.getLocation().y - 5);
                if (label_name.getLocation().y == 20) {
                    anim.cancel();
                }
            }
        }, 0, 10);
    }
    
    public void setUserName(){
        try {
            ResultSet search = DBConnect.search("select s.employee_id,e.fname from employee e left join systemuser s on s.employee_id=e.id where s.id='" + SystemData.getSysUserId() + "'");
            if (search.first()) {
                label_name.setText("Hello " + search.getString("fname") + " !");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            SystemLogger.initLogger(MemberManagement.class).error("Exception from setUsername() method.", ex);
        }
    }
}