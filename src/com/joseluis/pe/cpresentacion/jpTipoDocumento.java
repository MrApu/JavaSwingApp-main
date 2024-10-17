package com.joseluis.pe.cpresentacion;

import com.joseluis.cnegocio.TipoDocumentoBO;
import com.joseluis.pe.cmodelo.TipoDocumento;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author Soporte
 */
public class jpTipoDocumento extends javax.swing.JPanel {

     // Crear un objeto de negocio y llamar al método para agregar datos
    TipoDocumentoBO tdbo = new TipoDocumentoBO();
    TipoDocumento td = new TipoDocumento();
    String idTipoDocumento;

    public jpTipoDocumento() throws SQLException {
        initComponents();
        listarTipoDocumento();
    }
    public void listarTipoDocumento()throws SQLException{
        tdbo.listarTipoDocumento(tablaTipoDocumento);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTipoDocumento = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jlabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtOrden = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jlabel4 = new javax.swing.JLabel();
        jlabel7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txtSigla = new javax.swing.JTextField();
        txtFechaActualizacion2 = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("CRUD  Tipo Documento");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 0, 319, -1));

        tablaTipoDocumento.setBackground(new java.awt.Color(204, 204, 204));
        tablaTipoDocumento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaTipoDocumento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaTipoDocumentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaTipoDocumento);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 370, 238));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(0, 204, 255));
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 92, 170, 10));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 69, 170, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Estado");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 60, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 170, 10));

        jlabel3.setForeground(new java.awt.Color(0, 0, 0));
        jlabel3.setText("Orden");
        jPanel1.add(jlabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 60, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 170, 10));

        txtOrden.setBackground(new java.awt.Color(255, 255, 255));
        txtOrden.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        txtOrden.setBorder(null);
        txtOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrdenActionPerformed(evt);
            }
        });
        jPanel1.add(txtOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 170, -1));

        txtEstado.setBackground(new java.awt.Color(255, 255, 255));
        txtEstado.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        txtEstado.setBorder(null);
        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 170, 10));

        jlabel4.setForeground(new java.awt.Color(0, 0, 0));
        jlabel4.setText("Sigla");
        jPanel1.add(jlabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 60, -1));

        jlabel7.setForeground(new java.awt.Color(0, 0, 0));
        jlabel7.setText("Fecha Actualizacion");
        jPanel1.add(jlabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 110, -1));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 170, 10));

        txtSigla.setBackground(new java.awt.Color(255, 255, 255));
        txtSigla.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        txtSigla.setBorder(null);
        txtSigla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSiglaActionPerformed(evt);
            }
        });
        jPanel1.add(txtSigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 170, -1));

        txtFechaActualizacion2.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaActualizacion2.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        txtFechaActualizacion2.setBorder(null);
        txtFechaActualizacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActualizacion2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtFechaActualizacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 170, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 204, 255));
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoActionPerformed

    private void txtOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrdenActionPerformed

    private void txtSiglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSiglaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSiglaActionPerformed

    private void txtFechaActualizacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActualizacion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActualizacion2ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
         txtNombre.setText("");
    txtEstado.setText("");
    txtOrden.setText("");
    txtSigla.setText("");
    txtFechaActualizacion2.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            System.out.println(txtFechaActualizacion2.getText());
         
        
            if(valida()){
            td.setNombre(txtNombre.getText());
        td.setEstado(txtEstado.getText());
        td.setOrden(Integer.parseInt(txtEstado.getText()));
        td.setSigla(txtSigla.getText());
        td.setFechaActualiza(txtFechaActualizacion2.getText());
        tdbo.agregarTipoDocumento(td);
        JOptionPane.showMessageDialog(null, " Se guardo Correctamente: ");
            }
        } catch (SQLException | ParseException e) {
        // Manejo de excepciones
        JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage());
        }
    
    
        
         
    }//GEN-LAST:event_btnGuardarActionPerformed

    public boolean valida(){
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nombre es requerido");
            return false;
        }else if(txtSigla.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Sigla es requerida");
            return false;
        }else if(txtEstado.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Estado es requerido");
            return false;    
        }else if(txtEstado.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Estado es requerido");
            return false;
        }else if(txtFechaActualizacion2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Fecha de actualizacion es requerida");
            return false;
        }
        return true;
    }
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            if(valida()){
                    
            
            td.setIdTipoDocumento(Integer.parseInt(idTipoDocumento));
            td.setNombre(txtNombre.getText());
            td.setEstado(txtEstado.getText());
            td.setOrden(Integer.parseInt(txtEstado.getText()));
            td.setSigla(txtSigla.getText());
            td.setFechaActualiza(txtFechaActualizacion2.getText());
            tdbo.agregarTipoDocumento(td);
            listarTipoDocumento();
            JOptionPane.showMessageDialog(null, "Se guardo correctamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: al actualizar Tipo Documento");
        }
 {
            
            
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tablaTipoDocumentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTipoDocumentoMouseClicked
        int seleccion = tablaTipoDocumento.rowAtPoint(evt.getPoint());

    idTipoDocumento = tablaTipoDocumento.getValueAt(seleccion, 0)+"";

    txtNombre.setText(tablaTipoDocumento.getValueAt(seleccion, 1)+"");
    txtEstado.setText(tablaTipoDocumento.getValueAt(seleccion, 2)+"");
    txtOrden.setText(tablaTipoDocumento.getValueAt(seleccion, 3)+"");
    txtSigla.setText(tablaTipoDocumento.getValueAt(seleccion, 4)+"");
    txtFechaActualizacion2.setText(tablaTipoDocumento.getValueAt(seleccion, 5)+"");
    

    

     

     

    System.out.println(seleccion);
    }//GEN-LAST:event_tablaTipoDocumentoMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{

      TipoDocumento tdf = new TipoDocumento();

    tdf.setIdTipoDocumento(Integer.parseInt(idTipoDocumento));

    tdbo.eliminarTipoDocumento(tdf);
    listarTipoDocumento();
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(null, "error"+ ex.getMessage());

    }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JLabel jlabel4;
    private javax.swing.JLabel jlabel7;
    private javax.swing.JTable tablaTipoDocumento;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFechaActualizacion2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOrden;
    private javax.swing.JTextField txtSigla;
    // End of variables declaration//GEN-END:variables
}
