


package com.joseluis.cdatosdao;
//TipoDocumentoDao
import com.joseluis.pe.cmodelo.TipoDocumento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TipoDocumentoDao {
    private String mensaje;
    
    //Primer metodo - INSERTAR TIPO DOCUMENTOS A LA DB
    
    public String agregarTipoDocumento(Connection conn, TipoDocumento tipoDocumento){
        PreparedStatement ps = null;
        String sql = "INSERT INTO TIPO_DOCUMENTO(NOMBRE,SIGLA,ESTADO,ORDEN,FECHA_ACTUALIZA) "
        + "VALUES(?,?,?,?,?)";
        System.out.println(tipoDocumento.getFechaActualiza());
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, tipoDocumento.getNombre());
            ps.setString(2, tipoDocumento.getSigla());
            ps.setString(3, tipoDocumento.getEstado());
            ps.setInt(4, tipoDocumento.getOrden());
            ps.setString(5, tipoDocumento.getFechaActualiza());
            
            ps.execute();
            ps.close();
            mensaje = "El tipo documento fue creado correctamente";
        } catch (SQLException e) {
            mensaje = "Alto error al crear tipo documento. " + e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje;
    }
    //Segundo metodo Eliminar
    
    public String eliminarTipoDocumento(Connection conn, TipoDocumento tipoDocumento){
        PreparedStatement ps = null;
        String sql = "DELETE FROM TIPO_DOCUMENTO WHERE ID_TIPO_DOCUMENTO = ?";
        
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, tipoDocumento.getIdTipoDocumento());
            
            ps.execute();
            ps.close();
            mensaje = "El tipo documento fue eliminado correctamente";
        } catch (SQLException e) {
            mensaje = "Alto error al eliminar tipo documento. " + e.getMessage();
            System.out.println(e.getMessage());
        }
            
        
        return mensaje;
    }

    public String modificarTipoDocumento(Connection conn, TipoDocumento tipoDocumento){
        PreparedStatement ps = null;
        String sql = "UPDATE TIPO_DOCUMENTO" + " SET NOMBRE = ?, SIGLA = ?, ESTADO = ?, ORDEN = ?, FECHA = ?"
        + " WHERE ID_TIPO_DOCUMENTO = ?";
        
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, tipoDocumento.getNombre());
            ps.setString(2, tipoDocumento.getSigla());
            ps.setString(3, tipoDocumento.getEstado());
            ps.setInt(4, tipoDocumento.getOrden());
            ps.setString(5, tipoDocumento.getFechaActualiza());
            ps.setInt(6, tipoDocumento.getIdTipoDocumento());
            
            ps.execute();
            ps.close();
            mensaje = "El tipo documento fue creado correctamente";
        } catch (SQLException e) {
            mensaje = "Alto error al crear tipo documento. " + e.getMessage();
            System.out.println(e.getMessage());
        }
        
        
        return mensaje;
        
        
    }
    
    public void ListarTipoDocumento(Connection conn, JTable table){
            DefaultTableModel model;
            Statement statement = null;
            ResultSet resultSet = null;
            
            String[] columnas = {"ID", "NOMBRE","ESTADO", "ORDEN", "SIGLA", "FECHA" };
            model = new DefaultTableModel (null,columnas);
            
            String sql = "SELECT * FROM TIPO_DOCUMENTO";
            String[] datosTP = new String[6];
            
            try {
                statement = conn.createStatement();
                resultSet = statement.executeQuery(sql);
                while(resultSet.next()){
                    TipoDocumento td = new TipoDocumento();
                    td.setIdTipoDocumento(resultSet.getInt("ID_TIPO_DOCUMENTO"));
                    td.setNombre(resultSet.getString("NOMBRE"));;
                    td.setEstado(resultSet.getString("ESTADO"));
                    td.setOrden(resultSet.getInt("ORDEN"));
                    td.setSigla(resultSet.getString("SIGLA"));
                    td.setFechaActualiza(resultSet.getString("FECHA_ACTUALIZA"));
                    
                    datosTP[0] = td.getIdTipoDocumento() + "";
                    datosTP[1] = td.getNombre()+ "";
                    datosTP[2] = td.getEstado()+ "";
                    datosTP[3] = td.getOrden()+ "";
                    datosTP[4] = td.getSigla()+ "";
                    datosTP[5] = td.getFechaActualiza()+ "";
                    
                    model.addRow(datosTP);
                    
                }
                table.setModel(model);
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
                System.out.println(e.getMessage());
        } finally  {
        }
        }
    
   
    public ArrayList<TipoDocumento> listarTipoDocumentoCombo(Connection conn){
    ArrayList<TipoDocumento> listaTipoDocumento = new ArrayList<>();
    Statement statement = null;
    ResultSet resultSet = null;
    
    String sql = " SELECT ID_TIPO_DOCUMENTO, NOMBRE  FROM TIPO_DOCUMENTO " +
                " ORDER BY ORDEN";
               
       try {
                statement = conn.createStatement();
                resultSet = statement.executeQuery(sql);
                while(resultSet.next()){
                    TipoDocumento td = new TipoDocumento();
                    td.setIdTipoDocumento(resultSet.getInt("ID_TIPO_DOCUMENTO"));
                    td.setNombre(resultSet.getString("NOMBRE"));
                    listaTipoDocumento.add(td);
                    
                }
                
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
                System.out.println(e.getMessage());
        } finally  {
        }
        return listaTipoDocumento;
}

}

    