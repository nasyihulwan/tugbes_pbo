/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tugbes_pbo;

import javax.swing.JInternalFrame;
import javax.swing.JFrame;

/**
 *
 * @author nasyihulwan
 */
public class DashboardAdmin extends javax.swing.JFrame {

    /**
     * Creates new form DashboardAdmin2
     */
    public DashboardAdmin() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(9,31,64));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Layar = new javax.swing.JDesktopPane();
        namaPetugas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dataAspirasi = new javax.swing.JButton();
        dataMahasiswa = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuDashboard = new javax.swing.JMenuItem();
        menuMahasiswa = new javax.swing.JMenuItem();
        menuAspirasi = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));

        namaPetugas.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        namaPetugas.setForeground(new java.awt.Color(255, 255, 255));
        namaPetugas.setText("Petugas");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hi. Selamat Datang,");

        dataAspirasi.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        dataAspirasi.setText("DATA ASPIRASI");
        dataAspirasi.setBorder(null);
        dataAspirasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataAspirasiActionPerformed(evt);
            }
        });

        dataMahasiswa.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        dataMahasiswa.setText("DATA MAHASISWA");
        dataMahasiswa.setBorder(null);
        dataMahasiswa.setBounds(new java.awt.Rectangle(10, 0, 0, 0));
        dataMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataMahasiswaActionPerformed(evt);
            }
        });

        Layar.setLayer(namaPetugas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Layar.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Layar.setLayer(dataAspirasi, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Layar.setLayer(dataMahasiswa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LayarLayout = new javax.swing.GroupLayout(Layar);
        Layar.setLayout(LayarLayout);
        LayarLayout.setHorizontalGroup(
            LayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayarLayout.createSequentialGroup()
                .addGroup(LayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LayarLayout.createSequentialGroup()
                        .addGap(613, 613, 613)
                        .addGroup(LayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaPetugas)
                            .addComponent(jLabel2)))
                    .addGroup(LayarLayout.createSequentialGroup()
                        .addGap(437, 437, 437)
                        .addGroup(LayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dataAspirasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dataMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(439, Short.MAX_VALUE))
        );
        LayarLayout.setVerticalGroup(
            LayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayarLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaPetugas)
                .addGap(71, 71, 71)
                .addComponent(dataAspirasi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(dataMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(200, 24));

        jMenu1.setText("Menu");

        menuDashboard.setText("Dashboard");
        menuDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDashboardActionPerformed(evt);
            }
        });
        jMenu1.add(menuDashboard);

        menuMahasiswa.setText("Data Mahasiswa");
        menuMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMahasiswaActionPerformed(evt);
            }
        });
        jMenu1.add(menuMahasiswa);

        menuAspirasi.setText("Data Aspirasi");
        menuAspirasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAspirasiActionPerformed(evt);
            }
        });
        jMenu1.add(menuAspirasi);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Logout");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Layar)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Layar)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void closeAllInternalFrames() {
        for (JInternalFrame frame : Layar.getAllFrames()) {
            try {
                frame.setClosed(true); // Close the internal frame
            } catch (java.beans.PropertyVetoException e) {
                e.printStackTrace(); // Handle any veto exceptions if necessary
            }
        }
    }
    
    private void menuAspirasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAspirasiActionPerformed
    closeAllInternalFrames(); // Close existing internal frames
        DataAspirasi DA = new DataAspirasi();
        Layar.add(DA);
        DA.setVisible(true);
        try {
            DA.setSelected(true); // Bring the new internal frame to the front
            DA.setMaximum(true); // Maximize the internal frame to fill the desktop pane
        } catch (java.beans.PropertyVetoException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_menuAspirasiActionPerformed

    private void menuMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMahasiswaActionPerformed
        closeAllInternalFrames(); // Close existing internal frames
        DataMahasiswa DM = new DataMahasiswa();
        Layar.add(DM);
        DM.setVisible(true);
        try {
            DM.setSelected(true); // Bring the new internal frame to the front
            DM.setMaximum(true); // Maximize the internal frame to fill the desktop pane
        } catch (java.beans.PropertyVetoException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_menuMahasiswaActionPerformed

    private void menuDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDashboardActionPerformed
        closeAllInternalFrames();
    }//GEN-LAST:event_menuDashboardActionPerformed

    private void dataAspirasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataAspirasiActionPerformed
        menuAspirasiActionPerformed(evt);
    }//GEN-LAST:event_dataAspirasiActionPerformed

    private void dataMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataMahasiswaActionPerformed
        menuMahasiswaActionPerformed(evt);
    }//GEN-LAST:event_dataMahasiswaActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Layar;
    private javax.swing.JButton dataAspirasi;
    private javax.swing.JButton dataMahasiswa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuAspirasi;
    private javax.swing.JMenuItem menuDashboard;
    private javax.swing.JMenuItem menuMahasiswa;
    private javax.swing.JLabel namaPetugas;
    // End of variables declaration//GEN-END:variables
}

