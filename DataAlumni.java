/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package IpemarohilJakarta;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.Color;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import koneksi.Konfig;
/**
 *
 * @author Me
 */
public class DataAlumni extends javax.swing.JInternalFrame {

    /**
     * Creates new form DataPesertaPKH
     */
    public DataAlumni() {
        initComponents();
        tampilkan_data();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

    public void tampilkan_data(){
     DefaultTableModel model = new DefaultTableModel();
       
       model.addColumn("No.");
       model.addColumn("ID");
       model.addColumn("Nama");
       model.addColumn("Angkatan");
       model.addColumn("No Telepon");
       try{
           int no = 1;
           String sql = "Select * From data_alumni";
           java.sql.Connection conn=(Connection)Konfig.configDB();
           java.sql.Statement stm = conn.createStatement();
           java.sql.ResultSet res = stm.executeQuery(sql);
           
           while (res.next()){
               model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4)});
               
               jTable_Display_Users.setModel(model);
               
           }
       }catch(SQLException e){
           System.out.println("ERROR :" +e.getMessage());
           
       }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_Users = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Reload = new javax.swing.JButton();
        print1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Display_Users.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_Display_Users.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable_Display_UsersFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_Users);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 969, 335));

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus.PNG"))); // NOI18N
        jButton1.setText("Tambahkan Data ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 180, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Data Alumni");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 280, 40));

        Reload.setBackground(new java.awt.Color(0, 0, 255));
        Reload.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Reload.setForeground(new java.awt.Color(255, 255, 255));
        Reload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reload.PNG"))); // NOI18N
        Reload.setText("Reload");
        Reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReloadActionPerformed(evt);
            }
        });
        jPanel1.add(Reload, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 100, 40));

        print1.setBackground(new java.awt.Color(0, 0, 255));
        print1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        print1.setForeground(new java.awt.Color(255, 255, 255));
        print1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/print4.PNG"))); // NOI18N
        print1.setText("  Print");
        print1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        print1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print1ActionPerformed(evt);
            }
        });
        jPanel1.add(print1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_Display_UsersFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable_Display_UsersFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_Display_UsersFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FormDataAlumni backpage = new FormDataAlumni();
        backpage.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReloadActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable_Display_Users.getModel();
        model.setRowCount(0);
        tampilkan_data();
    }//GEN-LAST:event_ReloadActionPerformed

    private void print1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print1ActionPerformed
        // TODO add your handling code here:
        try {
            File namafile = new File("src/report/report_data_alumni.jasper");
            JasperPrint jp = JasperFillManager.fillReport(namafile.getPath(), null, koneksiprint.getConnection());
            JasperViewer.viewReport(jp, false);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_print1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reload;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_Users;
    private javax.swing.JButton print1;
    // End of variables declaration//GEN-END:variables

    private void EXIT_ON_CLOSE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
