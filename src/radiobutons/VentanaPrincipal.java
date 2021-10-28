/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiobutons;

import javax.swing.JOptionPane;

/**
 *
 * @author xp
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    public void confirmacion(){
        if(radioAC.isSelected()){
           int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Que quieres hacer?","hola", JOptionPane.OK_CANCEL_OPTION);
           if(confirmacion == 0){
               JOptionPane.showMessageDialog(rootPane, "Has pulsado aceptar");
           }else{
               JOptionPane.showMessageDialog(rootPane, "Has pulsado cancelar");
           }
        }else if(radioA.isSelected()){
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Que quieres hacer?", "hola", JOptionPane.DEFAULT_OPTION);
            if(confirmacion == 0){
               JOptionPane.showMessageDialog(rootPane, "Has pulsado aceptar");
           }
        }else if(radioSON.isSelected()){
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Que quieres hacer?", "hola", JOptionPane.OK_OPTION);
            if(confirmacion == 0){
                JOptionPane.showMessageDialog(rootPane, "Has pulsado si");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Has pulsado no");
            }
        }else if(radioSNC.isSelected()){
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Que quieres hacer?", "hola", JOptionPane.YES_NO_CANCEL_OPTION);
            System.out.println(confirmacion);
            switch(confirmacion){
                case 0:
                    JOptionPane.showMessageDialog(rootPane, "Has pulsado si");
                break;
                case 1:
                    JOptionPane.showMessageDialog(rootPane, "Has pulsado no");
                break;
                case 2:
                    JOptionPane.showMessageDialog(rootPane, "Has pulsado cancelar");
            }
        }
    }
    
    public void mensaje(){
        if (radioMensajeI.isSelected()) {
            JOptionPane.showMessageDialog(null, "Esto es un mensaje de informacion", "Mensaje informacion", JOptionPane.INFORMATION_MESSAGE);
        }else if(radioMensajeA.isSelected()){
            JOptionPane.showMessageDialog(null, "Esto es un mensaje de alerta", "Mensaje alerta", JOptionPane.WARNING_MESSAGE);
        }else if(radioMensajeE.isSelected()){
            JOptionPane.showMessageDialog(null, "Esto es un mensaje de error", "Mensaje error", JOptionPane.ERROR_MESSAGE);
        }else if(radioMensajeCP.isSelected()){
            JOptionPane.showMessageDialog(null, "Esto es un mensaje con pregunta", "Mensaje pregunta", JOptionPane.QUESTION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Esto es un mensaje sin icono", "Mensaje sin icono", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton3 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        radioSNC = new javax.swing.JRadioButton();
        radioA = new javax.swing.JRadioButton();
        radioAC = new javax.swing.JRadioButton();
        radioSON = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        radioMensajeI = new javax.swing.JRadioButton();
        radioMensajeA = new javax.swing.JRadioButton();
        radioMensajeCP = new javax.swing.JRadioButton();
        radioMensajeE = new javax.swing.JRadioButton();
        radioMensajeSI = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(radioSNC);
        radioSNC.setText("Mensaje con botones SI, NO y CANCELAR");

        buttonGroup1.add(radioA);
        radioA.setText("Mensaje con botón ACEPTAR");
        radioA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioAC);
        radioAC.setText("Mensaje con botones ACEPTAR Y CANCELAR");

        buttonGroup1.add(radioSON);
        radioSON.setText("Mensaje con botones SI o NO");

        jButton1.setText("MOSTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(radioAC)
                    .addComponent(radioA, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioSON, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioSNC, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(53, 53, 53))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(radioAC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioSON)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioSNC)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Confirmación", jPanel2);

        buttonGroup2.add(radioMensajeI);
        radioMensajeI.setText("Mensaje de información");
        radioMensajeI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMensajeIActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioMensajeA);
        radioMensajeA.setText("Mensaje de alerta");
        radioMensajeA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMensajeAActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioMensajeCP);
        radioMensajeCP.setText("Mensaje con pregunta");
        radioMensajeCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMensajeCPActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioMensajeE);
        radioMensajeE.setText("Mensaje de error");
        radioMensajeE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMensajeEActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioMensajeSI);
        radioMensajeSI.setText("Mensaje sin icono");
        radioMensajeSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMensajeSIActionPerformed(evt);
            }
        });

        jButton4.setText("Mostrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioMensajeI)
                            .addComponent(radioMensajeCP)
                            .addComponent(radioMensajeSI)
                            .addComponent(radioMensajeA))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radioMensajeE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(78, 78, 78))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(radioMensajeI)
                .addGap(18, 18, 18)
                .addComponent(radioMensajeA)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(radioMensajeE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton4)))
                .addGap(18, 18, 18)
                .addComponent(radioMensajeCP)
                .addGap(18, 18, 18)
                .addComponent(radioMensajeSI)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mensajes", jPanel1);

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jButton2)
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jButton2)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Salir", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        confirmacion();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void radioAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioAActionPerformed

    private void radioMensajeIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMensajeIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMensajeIActionPerformed

    private void radioMensajeAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMensajeAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMensajeAActionPerformed

    private void radioMensajeCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMensajeCPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMensajeCPActionPerformed

    private void radioMensajeEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMensajeEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMensajeEActionPerformed

    private void radioMensajeSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMensajeSIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMensajeSIActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        mensaje();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton radioA;
    private javax.swing.JRadioButton radioAC;
    private javax.swing.JRadioButton radioMensajeA;
    private javax.swing.JRadioButton radioMensajeCP;
    private javax.swing.JRadioButton radioMensajeE;
    private javax.swing.JRadioButton radioMensajeI;
    private javax.swing.JRadioButton radioMensajeSI;
    private javax.swing.JRadioButton radioSNC;
    private javax.swing.JRadioButton radioSON;
    // End of variables declaration//GEN-END:variables
}
