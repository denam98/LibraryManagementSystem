/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LibMS.Frames;

import com.LibMS.Common.DBConnect;
import com.LibMS.Common.SystemData;
import com.LibMS.Common.SystemLogger;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author B.M.D.C.Bandara
 */
public class viewEditProfile extends javax.swing.JFrame {

    private String password;
    private String username;
    MainInterface currentMain;
    boolean unameCheck;
    boolean passCheck;

    /**
     * Creates new form viewEditProfile
     */
    public viewEditProfile(MainInterface currentInterface) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            SystemLogger.initLogger(viewEditProfile.class).error("Exception from class constructor", ex);
        }
        initComponents();
        setLocationRelativeTo(null);
        setImage(new File("pics/profile.png"), lab_image);
        setImage(new File("pics/profile.png"), lab_image1);
        setData();
        currentMain = currentInterface;
        setImage(new File("pics/backW.png"), lab_img_back1);
        setImage(new File("pics/backW.png"), lab_img_back);
        jLayeredPane2.setVisible(false);
        //pass_pass1.setEchoChar((char)0);
        jCheckBox1.setSelected(true);
        pass_pass2.setEchoChar((char) 0);
        view.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        lab_image = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        lab_img_back = new javax.swing.JLabel();
        but_edit = new javax.swing.JButton();
        lab_name = new javax.swing.JLabel();
        lab_img_name = new javax.swing.JLabel();
        lab_nic = new javax.swing.JLabel();
        lab_img_nic = new javax.swing.JLabel();
        lab_img_dob = new javax.swing.JLabel();
        lab_dob = new javax.swing.JLabel();
        lab_img_tel = new javax.swing.JLabel();
        lab_tel = new javax.swing.JLabel();
        lab_role = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        lab_img_uname = new javax.swing.JLabel();
        lab_uname = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        lab_image1 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        lab_img_back1 = new javax.swing.JLabel();
        but_save = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        lab_img_pass = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lab_img_checkpass = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        lab_img_uname1 = new javax.swing.JLabel();
        txt_uname = new javax.swing.JTextField();
        lab_nameerror = new javax.swing.JLabel();
        lab_passerror = new javax.swing.JLabel();
        lab_passerror1 = new javax.swing.JLabel();
        pass_pass2 = new javax.swing.JPasswordField();
        pass_pass1 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(410, 610));

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255), 2));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLayeredPane1.add(lab_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 100, 116, 119));

        kGradientPanel1.setkStartColor(new java.awt.Color(102, 204, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLayeredPane1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 190));

        but_edit.setBackground(new java.awt.Color(51, 123, 255));
        but_edit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        but_edit.setText("Edit Profile");
        but_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        but_edit.setOpaque(false);
        but_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_editActionPerformed(evt);
            }
        });
        but_edit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                but_editKeyPressed(evt);
            }
        });
        jLayeredPane1.add(but_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 150, 40));

        lab_name.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lab_name.setText("jLabel1");
        jLayeredPane1.add(lab_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 240, 25));
        jLayeredPane1.add(lab_img_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 20, 20));

        lab_nic.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lab_nic.setText("jLabel1");
        jLayeredPane1.add(lab_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 240, 25));
        jLayeredPane1.add(lab_img_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 20, 20));
        jLayeredPane1.add(lab_img_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 20, 20));

        lab_dob.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lab_dob.setText("jLabel1");
        jLayeredPane1.add(lab_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 240, 25));
        jLayeredPane1.add(lab_img_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 20, 20));

        lab_tel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lab_tel.setText("jLabel1");
        jLayeredPane1.add(lab_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 240, 25));

        lab_role.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lab_role.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_role.setText("jLabel1");
        jLayeredPane1.add(lab_role, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 130, 30));
        jLayeredPane1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 310, 10));
        jLayeredPane1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 310, 10));
        jLayeredPane1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 310, 10));
        jLayeredPane1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 310, 10));
        jLayeredPane1.add(lab_img_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 20, 20));

        lab_uname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lab_uname.setText("jLabel1");
        jLayeredPane1.add(lab_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 240, 25));
        jLayeredPane1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 310, 10));

        jLayeredPane2.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255), 2));
        jLayeredPane2.setOpaque(true);
        jLayeredPane2.setPreferredSize(new java.awt.Dimension(410, 590));
        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLayeredPane2.add(lab_image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 100, 116, 119));

        kGradientPanel2.setkStartColor(new java.awt.Color(102, 204, 255));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_img_back1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lab_img_back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_img_back1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_img_back1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_img_back1MouseExited(evt);
            }
        });
        kGradientPanel2.add(lab_img_back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLayeredPane2.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 190));

        but_save.setBackground(new java.awt.Color(51, 123, 255));
        but_save.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        but_save.setText("Save Changes");
        but_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        but_save.setOpaque(false);
        but_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_saveActionPerformed(evt);
            }
        });
        but_save.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                but_saveKeyPressed(evt);
            }
        });
        jLayeredPane2.add(but_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 150, 40));
        jLayeredPane2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 310, 10));
        jLayeredPane2.add(lab_img_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 20, 20));
        jLayeredPane2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 310, 10));
        jLayeredPane2.add(lab_img_checkpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 15, 15));
        jLayeredPane2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 310, 10));
        jLayeredPane2.add(lab_img_uname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 20, 20));

        txt_uname.setBackground(new java.awt.Color(255, 255, 255));
        txt_uname.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_uname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_uname.setText("jTextField1");
        txt_uname.setBorder(null);
        txt_uname.setOpaque(false);
        txt_uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_unameActionPerformed(evt);
            }
        });
        txt_uname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_unameKeyTyped(evt);
            }
        });
        jLayeredPane2.add(txt_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 240, 25));

        lab_nameerror.setBackground(new java.awt.Color(255, 255, 255));
        lab_nameerror.setForeground(new java.awt.Color(255, 102, 102));
        jLayeredPane2.add(lab_nameerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 240, 20));

        lab_passerror.setBackground(new java.awt.Color(255, 255, 255));
        lab_passerror.setForeground(new java.awt.Color(255, 102, 102));
        jLayeredPane2.add(lab_passerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 220, 20));

        lab_passerror1.setBackground(new java.awt.Color(255, 255, 255));
        lab_passerror1.setForeground(new java.awt.Color(255, 102, 102));
        jLayeredPane2.add(lab_passerror1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 240, 20));

        pass_pass2.setBackground(new java.awt.Color(255, 255, 255));
        pass_pass2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        pass_pass2.setText("Re-type Password");
        pass_pass2.setBorder(null);
        pass_pass2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pass_pass2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pass_pass2FocusLost(evt);
            }
        });
        pass_pass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_pass2ActionPerformed(evt);
            }
        });
        pass_pass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pass_pass2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pass_pass2KeyReleased(evt);
            }
        });
        jLayeredPane2.add(pass_pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 220, 25));

        pass_pass1.setBackground(new java.awt.Color(255, 255, 255));
        pass_pass1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        pass_pass1.setText("Enter New Password");
        pass_pass1.setBorder(null);
        pass_pass1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pass_pass1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pass_pass1FocusLost(evt);
            }
        });
        pass_pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_pass1ActionPerformed(evt);
            }
        });
        pass_pass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pass_pass1KeyPressed(evt);
            }
        });
        jLayeredPane2.add(pass_pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 220, 25));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setForeground(new java.awt.Color(51, 204, 0));
        jLayeredPane2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_editActionPerformed
        jLayeredPane1.setVisible(false);
        jLayeredPane2.setVisible(true);
    }//GEN-LAST:event_but_editActionPerformed

    private void but_editKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_but_editKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.dispose();
        }
    }//GEN-LAST:event_but_editKeyPressed

    private void lab_img_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_img_backMouseEntered
        setImage(new File("pics/backB.png"), lab_img_back);
    }//GEN-LAST:event_lab_img_backMouseEntered

    private void lab_img_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_img_backMouseExited
        setImage(new File("pics/backW.png"), lab_img_back);
    }//GEN-LAST:event_lab_img_backMouseExited

    private void lab_img_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_img_backMouseClicked
        currentMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lab_img_backMouseClicked

    private void lab_img_back1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_img_back1MouseClicked
        new viewEditProfile(currentMain).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lab_img_back1MouseClicked

    private void lab_img_back1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_img_back1MouseEntered
        setImage(new File("pics/backB.png"), lab_img_back1);
    }//GEN-LAST:event_lab_img_back1MouseEntered

    private void lab_img_back1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_img_back1MouseExited
        setImage(new File("pics/backW.png"), lab_img_back1);
    }//GEN-LAST:event_lab_img_back1MouseExited

    private void but_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_saveActionPerformed
        if (checkUsername() && checkPass2()) {
            updateSysUser();
            lab_nameerror.setText(null);
        }
    }//GEN-LAST:event_but_saveActionPerformed

    private void but_saveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_but_saveKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_but_saveKeyPressed

    private void txt_unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_unameActionPerformed
        checkUsername();
    }//GEN-LAST:event_txt_unameActionPerformed

    private void pass_pass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_pass2ActionPerformed
        checkPass2();
    }//GEN-LAST:event_pass_pass2ActionPerformed

    private void pass_pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_pass1ActionPerformed
        checkPass1();
    }//GEN-LAST:event_pass_pass1ActionPerformed

    private void pass_pass1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass_pass1FocusGained
        jCheckBox1.setSelected(false);
        if (pass_pass1.getPassword().length == 0 || Arrays.equals(pass_pass1.getPassword(), "Enter New Password".toCharArray())) {
            pass_pass1.setText(null);
        }
    }//GEN-LAST:event_pass_pass1FocusGained

    private void pass_pass1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass_pass1FocusLost
        if (pass_pass1.getPassword().length == 0 || Arrays.equals(pass_pass1.getPassword(), "Enter New Password".toCharArray())) {
            jCheckBox1.setSelected(true);
            pass_pass1.setText("Enter New Password");
        } else {
            pass_pass1.setText(String.valueOf(pass_pass1.getPassword()));
        }
    }//GEN-LAST:event_pass_pass1FocusLost

    private void pass_pass2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass_pass2FocusGained
        pass_pass2.setEchoChar('*');
        if (pass_pass2.getPassword().length == 0 || Arrays.equals(pass_pass2.getPassword(), "Re-type Password".toCharArray())) {
            pass_pass2.setText(null);
        }
    }//GEN-LAST:event_pass_pass2FocusGained

    private void pass_pass2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass_pass2FocusLost
        if (pass_pass2.getPassword().length == 0 || Arrays.equals(pass_pass2.getPassword(), "Re-type Password".toCharArray())) {
            pass_pass2.setEchoChar((char) 0);
            pass_pass2.setText("Re-type Password");
        } else {
            pass_pass2.setText(String.valueOf(pass_pass2.getPassword()));
        }
    }//GEN-LAST:event_pass_pass2FocusLost

    private void pass_pass2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass_pass2KeyReleased
        if (Arrays.equals(pass_pass2.getPassword(), pass_pass1.getPassword())) {
            setImage(new File("pics/check.png"), lab_img_checkpass);
        } else {
            setImage(new File("pics/close.png"), lab_img_checkpass);
        }
    }//GEN-LAST:event_pass_pass2KeyReleased

    private void txt_unameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_unameKeyTyped
        if (Character.isSpaceChar(evt.getKeyChar())) {
            txt_uname.setEditable(false);
        } else {
            txt_uname.setEditable(true);
        }
    }//GEN-LAST:event_txt_unameKeyTyped

    private void pass_pass1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass_pass1KeyPressed
        if (Character.getType(evt.getKeyCode()) == 12) {
            pass_pass1.setEditable(false);
        } else {
            pass_pass1.setEditable(true);
        }
    }//GEN-LAST:event_pass_pass1KeyPressed

    private void pass_pass2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass_pass2KeyPressed
        if (Character.getType(evt.getKeyCode()) == 12) {
            pass_pass2.setEditable(false);
        } else {
            pass_pass2.setEditable(true);
        }
    }//GEN-LAST:event_pass_pass2KeyPressed

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
            SystemLogger.initLogger(viewEditProfile.class).error("Exception from main() method", ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new viewEditProfile(null).setVisible(true);
        });
    }

    private void setImage(File imgFile, JLabel labelName) {
        try {
            Image image = ImageIO.read(new FileInputStream(imgFile));
            image = image.getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_SMOOTH);
            labelName.setIcon(new ImageIcon(image));
        } catch (IOException ex) {
            System.out.println(ex);
        }
//        try {
//            ResultSet search = DBConnect.search("select s.employee_id,e.fname from employee e left join systemuser s on s.employee_id=e.id where s.id='" + SystemData.getSysUserId() + "'");
//            if (search.first()) {
//                label_name.setText("Hello " + search.getString("fname") + " !");
//            }
//            label_role.setText(SystemData.getRole());
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton but_edit;
    private javax.swing.JButton but_save;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lab_dob;
    private javax.swing.JLabel lab_image;
    private javax.swing.JLabel lab_image1;
    private javax.swing.JLabel lab_img_back;
    private javax.swing.JLabel lab_img_back1;
    private javax.swing.JLabel lab_img_checkpass;
    private javax.swing.JLabel lab_img_dob;
    private javax.swing.JLabel lab_img_name;
    private javax.swing.JLabel lab_img_nic;
    private javax.swing.JLabel lab_img_pass;
    private javax.swing.JLabel lab_img_tel;
    private javax.swing.JLabel lab_img_uname;
    private javax.swing.JLabel lab_img_uname1;
    private javax.swing.JLabel lab_name;
    private javax.swing.JLabel lab_nameerror;
    private javax.swing.JLabel lab_nic;
    private javax.swing.JLabel lab_passerror;
    private javax.swing.JLabel lab_passerror1;
    private javax.swing.JLabel lab_role;
    private javax.swing.JLabel lab_tel;
    private javax.swing.JLabel lab_uname;
    private javax.swing.JPasswordField pass_pass1;
    private javax.swing.JPasswordField pass_pass2;
    private javax.swing.JTextField txt_uname;
    // End of variables declaration//GEN-END:variables

    private void setData() {
        // Set images to the view layer
        setImage(new File("pics/uName.png"), lab_img_name);
        setImage(new File("pics/username.png"), lab_img_uname);
        setImage(new File("pics/id.png"), lab_img_nic);
        setImage(new File("pics/bDay.png"), lab_img_dob);
        setImage(new File("pics/tell.png"), lab_img_tel);
        // Set image to the update layer
        setImage(new File("pics/username.png"), lab_img_uname1);
        setImage(new File("pics/pass.png"), lab_img_pass);
        lab_role.setText(SystemData.getRole());
        ResultSet search;
        try {
            search = DBConnect.search("select e.*,s.username,s.password from employee e inner join systemuser s "
                    + "on e.id = s.employee_id where s.id='" + SystemData.getSysUserId() + "'");
            if (search.first()) {
                username = search.getString("username");
                password = search.getString("password");
                lab_name.setText(search.getString("fname") + " " + search.getString("lname"));
                lab_uname.setText(search.getString("username"));
                txt_uname.setText(search.getString("username"));
                lab_nic.setText(search.getString("nic"));
                lab_dob.setText(search.getString("dob"));
                lab_tel.setText(search.getString("phone"));
            } else {
                System.out.println("Empty ResultSet!");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            SystemLogger.initLogger(viewEditProfile.class).error("Exception from SELECT query", ex);
        }
    }

    private void checkPass1() {
        if (!Arrays.equals(pass_pass1.getPassword(), password.toCharArray())) {
            if (pass_pass1.getPassword().length == 0) {
                pass_pass1.grabFocus();
                lab_passerror.setText("* Can not be Empty");
            } else {
                if (pass_pass1.getPassword().length < 8) {
                    pass_pass1.grabFocus();
                    lab_passerror.setText("* Must be at least 8 charachters long");
                } else {
                    lab_passerror.setText(null);
                    pass_pass2.grabFocus();
                }
            }
        } else {
            lab_passerror.setText("* Too much similar to the current password");
        }
    }

    private boolean checkUsername() {
        ResultSet search;
        unameCheck = false;
        try {
            search = DBConnect.search("select username from systemuser");
            while (search.next()) {
                if (!txt_uname.getText().trim().equals(username)) {
                    if (txt_uname.getText().equals(search.getString("username"))) {
                        if (!search.getString("username").equals(username)) {
                            txt_uname.grabFocus();
                            lab_nameerror.setForeground(Color.red);
                            lab_nameerror.setText("* Username already exists");
                            unameCheck = false;
                            break;
                        }
                    } else {
                        lab_nameerror.setText(null);
                        pass_pass1.grabFocus();
                        unameCheck = true;
                    }
                } else {
                    lab_nameerror.setForeground(Color.BLUE);
                    lab_nameerror.setText("- Continue using the current username");
                    pass_pass1.grabFocus();
                    unameCheck = true;
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            SystemLogger.initLogger(viewEditProfile.class).error("Exception from SELECT query", ex);
        }
        return unameCheck;
    }
    Thread view = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                if (jCheckBox1.isSelected()) {
                    pass_pass1.setEchoChar((char) 0);
                } else {
                    pass_pass1.setEchoChar('*');
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    SystemLogger.initLogger(viewEditProfile.class).error("Exception from Thread view", ex);
                }
            }
        }

    });

    private void updateSysUser() {
        try {
            DBConnect.iud("update systemuser set username='" + txt_uname.getText() + "', password='" + String.valueOf(pass_pass2.getPassword()) + "' where id='" + SystemData.getSysUserId() + "'");
            JOptionPane.showMessageDialog(rootPane,"System user update successful!");
            jCheckBox1.setSelected(true);
            pass_pass2.setEchoChar((char)0);
            pass_pass1.setText("Enter New Password");
            pass_pass2.setText("Re-type Password");
            lab_img_checkpass.setIcon(null);
        } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
            SystemLogger.initLogger(viewEditProfile.class).error("Exception from UPDATE query", ex);
        }
    }

    private boolean checkPass2() {
        passCheck = false;
        if (Arrays.equals(pass_pass2.getPassword(), pass_pass1.getPassword())) {
            lab_passerror1.setText(null);
            but_save.grabFocus();
            passCheck = true;
        } else {
            lab_passerror1.setText("*Passwords does not match");
            pass_pass2.grabFocus();
            pass_pass2.setText(null);
            passCheck = false;
        }
        return passCheck;
    }

}