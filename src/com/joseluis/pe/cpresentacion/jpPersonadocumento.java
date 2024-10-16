/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.joseluis.pe.cpresentacion;

import com.joseluis.cnegocio.TipoDocumentoBO;
import com.joseluis.pe.cmodelo.TipoDocumento;

/**
 *
 * @author Soporte
 */
public class jpPersonadocumento extends javax.swing.JPanel {

    /**
     * Creates new form jpPersonadocumento
     */
    public jpPersonadocumento() {
        initComponents();
        listarTipoDocumentoCombo();
    }
    private void listarTipoDocumentoCombo(){
        TipoDocumentoBO tdbo = new TipoDocumentoBO();
        for(TipoDocumento item: tdbo.listarTipoDocumentoCombo()){
            jcTipoDocumento.addItem(item.getNombre());
            
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        txtPersona4 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPersona = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnLimpiar2 = new javax.swing.JButton();
        btnGuardar2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtPersona1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnLimpiar3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPersona2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNumeroDocumento2 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jcTipoDocumento = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtEstado2 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Numero");

        txtPersona4.setBackground(new java.awt.Color(255, 255, 255));
        txtPersona4.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        txtPersona4.setBorder(null);
        txtPersona4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersona4ActionPerformed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(102, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("Registro Persona documento");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Persona");

        txtPersona.setBackground(new java.awt.Color(255, 255, 255));
        txtPersona.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        txtPersona.setBorder(null);
        txtPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonaActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        btnLimpiar2.setBackground(new java.awt.Color(0, 204, 255));
        btnLimpiar2.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar2.setText("Limpiar");
        btnLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar2ActionPerformed(evt);
            }
        });

        btnGuardar2.setBackground(new java.awt.Color(0, 204, 255));
        btnGuardar2.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar2.setText("Guardar");
        btnGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtPersona1.setBackground(new java.awt.Color(255, 255, 255));
        txtPersona1.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        txtPersona1.setBorder(null);
        txtPersona1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersona1ActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        btnLimpiar3.setBackground(new java.awt.Color(0, 204, 255));
        btnLimpiar3.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar3.setText("Limpiar");
        btnLimpiar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar3ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tipo Documento");

        txtPersona2.setBackground(new java.awt.Color(255, 255, 255));
        txtPersona2.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        txtPersona2.setBorder(null);
        txtPersona2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersona2ActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("NumeroDocumento");

        txtNumeroDocumento2.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroDocumento2.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        txtNumeroDocumento2.setBorder(null);
        txtNumeroDocumento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroDocumento2ActionPerformed(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jcTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jcTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTipoDocumentoActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Estado");

        txtEstado2.setBackground(new java.awt.Color(255, 255, 255));
        txtEstado2.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        txtEstado2.setBorder(null);
        txtEstado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstado2ActionPerformed(evt);
            }
        });

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtPersona1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumeroDocumento2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(96, 96, 96)
                                    .addComponent(btnLimpiar3))
                                .addComponent(jcTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(90, 90, 90)
                            .addComponent(txtPersona2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtEstado2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(262, 262, 262)))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(txtPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPersona2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6)
                        .addGap(3, 3, 3)
                        .addComponent(txtNumeroDocumento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(3, 3, 3)
                .addComponent(txtEstado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnLimpiar3)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnLimpiar2)
                                .addGap(4, 4, 4)
                                .addComponent(btnGuardar2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1)))
                .addContainerGap(221, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(txtPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar2)
                    .addComponent(btnGuardar2))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonaActionPerformed

    private void btnLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar2ActionPerformed
       
    }//GEN-LAST:event_btnLimpiar2ActionPerformed

    private void btnGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar2ActionPerformed
    
        String tdSeleccionado = (String) jcTipoDocumento.getSelectedItem();
        String id = tdSeleccionado.split(" ")[0];
        
        System.out.println("Id: " + tdSeleccionado);
        

    }//GEN-LAST:event_btnGuardar2ActionPerformed

    private void txtNumeroDocumento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroDocumento2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroDocumento2ActionPerformed

    private void txtPersona2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersona2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersona2ActionPerformed

    private void btnLimpiar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiar3ActionPerformed

    private void txtPersona1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersona1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersona1ActionPerformed

    private void txtPersona4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersona4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersona4ActionPerformed

    private void txtEstado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstado2ActionPerformed

    private void jcTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcTipoDocumentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar2;
    private javax.swing.JButton btnLimpiar2;
    private javax.swing.JButton btnLimpiar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JComboBox<String> jcTipoDocumento;
    private javax.swing.JTextField txtEstado2;
    private javax.swing.JTextField txtNumeroDocumento2;
    private javax.swing.JTextField txtPersona;
    private javax.swing.JTextField txtPersona1;
    private javax.swing.JTextField txtPersona2;
    private javax.swing.JTextField txtPersona4;
    // End of variables declaration//GEN-END:variables
}
