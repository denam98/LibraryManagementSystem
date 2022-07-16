/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LibMS.Frames;

import com.LibMS.Common.DBConnect;
import com.LibMS.Common.SystemLogger;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author B.M.D.C.Bandara
 */
public class PendingResubmissions extends javax.swing.JFrame {

    /**
     * Creates new form PendingResubmissions
     */
    public PendingResubmissions() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            SystemLogger.initLogger(PendingResubmissions.class).error("Exception from class constructor", ex);
        }
        initComponents();
        setLocationRelativeTo(null);
        setButtons();
        setImage(new File("pics/pendingReSub.jpg"), lab_image);
        setDataToPendingTable();
        layer_outdated.setVisible(false);
        layer_pending.setVisible(true);
        jButton3.grabFocus();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lab_image = new javax.swing.JLabel();
        layer_outdated = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        cb_searchCategory1 = new javax.swing.JComboBox<>();
        txt_search1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        layer_pending = new javax.swing.JLayeredPane();
        jButton3 = new javax.swing.JButton();
        cb_searchCategory = new javax.swing.JComboBox<>();
        txt_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jButton10 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setResizable(false);

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Re-submissions");
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 280, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Pending");
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 260, 40));
        jLayeredPane1.add(lab_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 768));

        layer_outdated.setBackground(new java.awt.Color(255, 255, 255));
        layer_outdated.setMaximumSize(new java.awt.Dimension(966, 768));
        layer_outdated.setMinimumSize(new java.awt.Dimension(966, 768));
        layer_outdated.setOpaque(true);
        layer_outdated.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "BOOK NAME", "MEMBER ID", "FIRST NAME", "LAST NAME", "GENDER", "MOBILE No.", "DUE DATE", "REMINDERS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable2.setRowHeight(20);
        jTable2.setShowHorizontalLines(false);
        jTable2.setShowVerticalLines(false);
        jScrollPane2.setViewportView(jTable2);

        layer_outdated.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 920, 390));

        cb_searchCategory1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Name", "Last Name", "ISBN", "Mobile No." }));
        layer_outdated.add(cb_searchCategory1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 80, 30));

        txt_search1.setText("Search");
        txt_search1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_search1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_search1FocusLost(evt);
            }
        });
        txt_search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search1ActionPerformed(evt);
            }
        });
        layer_outdated.add(txt_search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 180, 30));

        jButton7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 102, 255));
        jButton7.setText("Home");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        layer_outdated.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, -1));

        jButton8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(153, 153, 153));
        jButton8.setText("Resubmissions");
        jButton8.setEnabled(false);
        layer_outdated.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton4.setText("Pending Re-submissions");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        layer_outdated.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 200, 41));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        layer_outdated.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 10, 35));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton6.setText("Member Reminded");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        layer_outdated.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 640, 230, 42));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Press the button bellow after reminding the member about the outdated re-submission.");
        layer_outdated.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 620, 550, -1));

        jLayeredPane1.add(layer_outdated, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 966, 768));

        layer_pending.setBackground(new java.awt.Color(255, 255, 255));
        layer_pending.setMaximumSize(new java.awt.Dimension(966, 768));
        layer_pending.setMinimumSize(new java.awt.Dimension(966, 768));
        layer_pending.setOpaque(true);
        layer_pending.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton3.setText("Outdated Re-submissions");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        layer_pending.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 200, 41));

        cb_searchCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Name", "Last Name", "ISBN", "Mobile No." }));
        layer_pending.add(cb_searchCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 80, 30));

        txt_search.setText("Search");
        txt_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_searchFocusLost(evt);
            }
        });
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        layer_pending.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 180, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "BOOK NAME", "MEMBER ID", "FIRST NAME", "LAST NAME", "GENDER", "MOBILE No.", "DUE DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setRowHeight(20);
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);

        layer_pending.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 920, 390));

        jButton9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(153, 153, 153));
        jButton9.setText("Resubmissions");
        jButton9.setEnabled(false);
        layer_pending.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        layer_pending.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 10, 35));

        jButton10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 102, 255));
        jButton10.setText("Home");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        layer_pending.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton5.setText("Receive Book Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        layer_pending.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 640, 230, 42));

        jLayeredPane1.add(layer_pending, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 966, 768));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        layer_outdated.setVisible(true);
        layer_pending.setVisible(false);
        setDataToOutdatedTable();
        jLabel2.setText("Outdated");
        jButton4.grabFocus();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_searchFocusGained
        txt_search.setText(null);
    }//GEN-LAST:event_txt_searchFocusGained

    private void txt_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_searchFocusLost
        txt_search.setText("Search");
    }//GEN-LAST:event_txt_searchFocusLost

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        search(jTable1);
    }//GEN-LAST:event_txt_searchActionPerformed

    private void txt_search1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_search1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search1FocusGained

    private void txt_search1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_search1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search1FocusLost

    private void txt_search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search1ActionPerformed
        search(jTable2);
    }//GEN-LAST:event_txt_search1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        layer_outdated.setVisible(false);
        layer_pending.setVisible(true);
        setDataToPendingTable();
        jLabel2.setText("Pending");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (jTable1.getSelectedRow() != -1 && jTable1.getSelectedRowCount() == 1) {
            ReceiveBooksBack obj = new ReceiveBooksBack();
            obj.setVisible(true);
            String memId = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
            try {
                ResultSet search = DBConnect.search("select * from member where id='" + memId + "'");
                if (search.first()) {
                    obj.txt_ID.setText(search.getString("nic"));
                    obj.txt_ID.grabFocus();
                }
            } catch (ClassNotFoundException | SQLException ex) {
                SystemLogger.initLogger(PendingResubmissions.class).error("Exception from SELECT query", ex);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Select an item from the table first.");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (jTable2.getSelectedRow() != -1 && jTable2.getSelectedRowCount() == 1) {
            String message = "Are you sure to add a reminder for the selected outdated resubmission?";
            int showConfirmDialog = JOptionPane.showConfirmDialog(rootPane, message, "", JOptionPane.YES_NO_OPTION);
            if (showConfirmDialog == JOptionPane.YES_OPTION) {
                int reminders = Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 8).toString());
                String isbn = jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString();
                String memId = jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString();
                String dueDate = jTable2.getValueAt(jTable2.getSelectedRow(), 7).toString();
                try {
                    DBConnect.iud("update lendbook set reminders=reminders+1 where "
                            + "book_isbn='" + isbn + "' and member_id='" + memId + "' and due_date='" + dueDate + "'");
                } catch (ClassNotFoundException | SQLException ex) {
                    SystemLogger.initLogger(PendingResubmissions.class).error("Exception from UPDATE query", ex);
                }
                JOptionPane.showMessageDialog(rootPane, "Reminder added successfully!");
                setDataToOutdatedTable();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Select an item from the table first.");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            SystemLogger.initLogger(PendingResubmissions.class).error("Exception from main() method", ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PendingResubmissions().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_searchCategory;
    private javax.swing.JComboBox<String> cb_searchCategory1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lab_image;
    private javax.swing.JLayeredPane layer_outdated;
    private javax.swing.JLayeredPane layer_pending;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_search1;
    // End of variables declaration//GEN-END:variables

    private void search(JTable table) {
        String searchCategory = cb_searchCategory.getSelectedItem().toString();
        String searchString = txt_search.getText().toLowerCase();
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        table.clearSelection();

        switch (searchCategory) {
            case "First Name":
                for (int row = 0; row < dtm.getRowCount(); row++) {
                    if (dtm.getValueAt(row, 3).toString().contains(searchString)) {
                        table.getSelectionModel().addSelectionInterval(row, row);
                        
                    }
                }   break;
            case "Last Name":
                for (int row = 0; row < dtm.getRowCount(); row++) {
                    if (dtm.getValueAt(row, 4).toString().contains(searchString)) {
                        table.getSelectionModel().addSelectionInterval(row, row);
                        
                    }
                }   break;
            case "ISBN":
                for (int row = 0; row < dtm.getRowCount(); row++) {
                    if (dtm.getValueAt(row, 0).toString().contains(searchString)) {
                        table.getSelectionModel().addSelectionInterval(row, row);
                        
                    }
                }   break;
            default:
                for (int row = 0; row < dtm.getRowCount(); row++) {
                    if (dtm.getValueAt(row, 6).toString().contains(searchString)) {
                        table.getSelectionModel().addSelectionInterval(row, row);
                        
                    }
                }   break;
        }

        if (table.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "No match found!");
        }
    }

    private void setDataToOutdatedTable() {
        try {
            ResultSet search = DBConnect.search("select m.*,l.*,b.* from lendbook l inner join member m on m.id=l.member_id inner join book b on l.book_isbn=b.isbn where l.stat!=0");
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setRowCount(0);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            while (search.next()) {
                long today = new Date().getTime();
                long dueDate = sdf.parse(search.getString("due_date")).getTime();
                Vector v = new Vector();
                if (dueDate <= today) {
                    v.add(search.getString("l.book_isbn"));
                    v.add(search.getString("b.name"));
                    v.add(search.getString("l.member_id"));
                    v.add(search.getString("m.fname"));
                    v.add(search.getString("m.lname"));
                    String sex = (search.getString("m.gender").equals("M")) ? "Male" : "Female";
                    v.add(sex);
                    v.add(search.getString("m.phone"));
                    v.add(search.getString("l.due_date"));
                    v.add(search.getString("l.reminders"));
                    dtm.addRow(v);
                }
            }
        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            SystemLogger.initLogger(PendingResubmissions.class).error("", ex);
        }
    }

    private void setDataToPendingTable() {
        try {
            ResultSet search = DBConnect.search("select m.*,l.*,b.* from lendbook l inner join member m on m.id=l.member_id inner join book b on l.book_isbn=b.isbn where l.stat!=0");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (search.next()) {
                Vector v = new Vector();
                v.add(search.getString("l.book_isbn"));
                v.add(search.getString("b.name"));
                v.add(search.getString("l.member_id"));
                v.add(search.getString("m.fname"));
                v.add(search.getString("m.lname"));
                String sex = (search.getString("m.gender").equals("M")) ? "Male" : "Female";
                v.add(sex);
                v.add(search.getString("m.phone"));
                v.add(search.getString("l.due_date"));
                dtm.addRow(v);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            SystemLogger.initLogger(PendingResubmissions.class).error("", ex);
        }
    }

    void setButtons() {
        jButton7.setOpaque(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setBorderPainted(false);
        jButton8.setOpaque(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setBorderPainted(false);
        jButton9.setOpaque(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setBorderPainted(false);
        jButton10.setOpaque(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setBorderPainted(false);
    }

    private void setImage(File img, JLabel label) {
        try {
            Image image = ImageIO.read(new FileInputStream(img));
            image = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(image));
        } catch (IOException ex) {
            SystemLogger.initLogger(PendingResubmissions.class).error("Exception from setImage() method", ex);
        }
    }

}
