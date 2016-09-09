/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Jcervant23
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        cmdMix.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumerador1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtDenominador1 = new javax.swing.JTextField();
        cmbOperacion = new javax.swing.JComboBox<>();
        txtNumerador2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtDenominador2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumerador3 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtDenominador3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cmdCalcular = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdMix = new javax.swing.JButton();
        txtPe = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("OPERACIÓN CON FRACCIONAROS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 44, 210, 20));
        jPanel1.add(txtNumerador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, 10));
        jPanel1.add(txtDenominador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, -1));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicación", "División" }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 80, -1));
        jPanel1.add(txtNumerador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 60, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 60, 10));
        jPanel1.add(txtDenominador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 60, -1));

        jLabel2.setText("=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        txtNumerador3.setEditable(false);
        jPanel1.add(txtNumerador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 60, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 60, 10));

        txtDenominador3.setEditable(false);
        jPanel1.add(txtDenominador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 60, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });

        cmdMix.setText("Convertir Mixto");
        cmdMix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMixActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cmdCalcular)
                .addGap(18, 18, 18)
                .addComponent(cmdLimpiar)
                .addGap(18, 18, 18)
                .addComponent(cmdMix)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCalcular)
                    .addComponent(cmdLimpiar)
                    .addComponent(cmdMix)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 330, 60));

        txtPe.setEditable(false);
        jPanel1.add(txtPe, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 30, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        int op, n1, n2, n3, d1, d2, d3;
        Fraccionario f1, f2, f3 = null;
        int sw = 1;
        txtNumerador3.setText("");
        txtDenominador3.setText("");
        txtPe.setText("");

        if (txtNumerador1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite el primer numerador", "Error", 2);
            txtNumerador1.requestFocusInWindow();
            sw = 0;
        } else if (txtDenominador1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite el primer denominador", "Error", 2);
            txtDenominador1.requestFocusInWindow();
            sw = 0;
        } else if (txtNumerador2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite numerador de la segunda fraccion", "Error", 2);
            txtNumerador2.requestFocusInWindow();
            sw = 0;
        } else if (txtDenominador2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite denominador de la segunda fraccion", "Error", 2);
            txtDenominador2.requestFocusInWindow();
            sw = 0;
        } else {
            try {
                n1 = Integer.parseInt(txtNumerador1.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese el primer numerador correctamente", "Error", 2);
                txtNumerador1.requestFocusInWindow();
                txtNumerador1.selectAll();
                sw = 0;
            }
            try {
                d1 = Integer.parseInt(txtDenominador1.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese el primer denominador correctamente", "Error", 2);
                txtDenominador1.requestFocusInWindow();
                txtDenominador1.selectAll();
                sw = 0;
            }
            try {
                n2 = Integer.parseInt(txtNumerador2.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese numerador de la segunda fraccion correctamente", "Error", 2);
                txtNumerador2.requestFocusInWindow();
                txtNumerador2.selectAll();
                sw = 0;
            }
            try {
                d2 = Integer.parseInt(txtDenominador2.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese denominador de la segunda fraccion", "Error", 2);
                txtDenominador2.requestFocusInWindow();
                txtDenominador2.selectAll();
                sw = 0;
            }
        }
        if (sw == 1) {
            n1 = Integer.parseInt(txtNumerador1.getText());
            d1 = Integer.parseInt(txtDenominador1.getText());
            n2 = Integer.parseInt(txtNumerador2.getText());
            d2 = Integer.parseInt(txtDenominador2.getText());
            op = cmbOperacion.getSelectedIndex();
            try {
                f1 = new Fraccionario(n1, d1);
                f2 = new Fraccionario(n2, d2);

                switch (op) {
                    case 0:
                        f3 = f1.suma(f2);
                        break;
                    case 1:
                        f3 = f1.resta(f2);
                        break;
                    case 2:
                        f3 = f1.multiplicacion(f2);
                        break;
                    case 3:
                        f3 = f1.division(f2);
                        break;
                }
                txtNumerador3.setText("" + f3.getNumerador());
                txtDenominador3.setText("" + f3.getDenominador());
                cmdMix.setEnabled(true);
            } catch (DenominadorCeroException e) {
                Helper.mensaje(null, "No puede digitar cero de denominador", "Error", 2);
            }
        }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtNumerador1.setText("");
        txtNumerador2.setText("");
        txtNumerador3.setText("");
        txtDenominador1.setText("");
        txtDenominador2.setText("");
        txtDenominador3.setText("");
        txtNumerador1.requestFocusInWindow();
        txtPe.setText("");
        cmbOperacion.setSelectedIndex(0);
        cmdMix.setEnabled(false);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdMixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMixActionPerformed
        // TODO add your handling code here:
        int Pe, Mixnum, Mixden, n3, d3, sw =1;
        
        n3 = Integer.parseInt(txtNumerador3.getText());
        d3 = Integer.parseInt(txtDenominador3.getText());
        Pe = n3 / d3;
        Mixden = d3;
        Mixnum = n3 % d3;
        txtPe.setText("" + Pe);
        txtNumerador3.setText("" + Mixnum);
        txtDenominador3.setText("" + Mixden);
        cmdMix.setEnabled(false);
    }//GEN-LAST:event_cmdMixActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdMix;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtDenominador1;
    private javax.swing.JTextField txtDenominador2;
    private javax.swing.JTextField txtDenominador3;
    private javax.swing.JTextField txtNumerador1;
    private javax.swing.JTextField txtNumerador2;
    private javax.swing.JTextField txtNumerador3;
    private javax.swing.JTextField txtPe;
    // End of variables declaration//GEN-END:variables
}
