/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FORMULARIOS;

import javax.swing.SwingUtilities;
import principal.frmregistro;


public class panel_admin extends javax.swing.JFrame {

    /**
     * Creates new form panel_admin
     */
    public panel_admin() {
        initComponents();
         setLocationRelativeTo(null);
         

//SlidePaneFactory.getInstance();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_registro1 = new javax.swing.JButton();
        btn_registro3 = new javax.swing.JButton();
        btn_registro4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hand-drawn-fast-food-decorative-background-vector.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 350, 630));

        jLabel4.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("¿Que accion deseas realizar?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 320, 22));

        jLabel5.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("¡BIENVENIDO ADMINISTRADOR!");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 380, 22));

        btn_registro1.setBackground(new java.awt.Color(51, 51, 51));
        btn_registro1.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        btn_registro1.setForeground(new java.awt.Color(255, 255, 255));
        btn_registro1.setText("Registar Nuevo Usuario");
        btn_registro1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_registro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registro1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 290, 100));

        btn_registro3.setBackground(new java.awt.Color(51, 51, 51));
        btn_registro3.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        btn_registro3.setForeground(new java.awt.Color(255, 255, 255));
        btn_registro3.setText("PRODUCTOS");
        btn_registro3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_registro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registro3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 290, 100));

        btn_registro4.setBackground(new java.awt.Color(51, 51, 51));
        btn_registro4.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        btn_registro4.setForeground(new java.awt.Color(255, 255, 255));
        btn_registro4.setText("PERSONAL");
        btn_registro4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_registro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registro4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 290, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registro1ActionPerformed
       
        this.setVisible(false);

        SwingUtilities.invokeLater(() -> {
            frmregistro f2 = new frmregistro(null, true);
            f2.setVisible(true);
        });

    }//GEN-LAST:event_btn_registro1ActionPerformed

    private void btn_registro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registro3ActionPerformed
     
        this.setVisible(false);

        SwingUtilities.invokeLater(() -> {
            productos f3 = new productos();
            f3.setVisible(true);
        });
    }//GEN-LAST:event_btn_registro3ActionPerformed

    private void btn_registro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registro4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registro4ActionPerformed

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
            java.util.logging.Logger.getLogger(panel_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panel_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panel_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panel_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panel_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registro1;
    private javax.swing.JButton btn_registro3;
    private javax.swing.JButton btn_registro4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
