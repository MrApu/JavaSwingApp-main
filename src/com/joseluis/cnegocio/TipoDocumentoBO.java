
package com.joseluis.cnegocio;
//TipoDocumentoBO.java
import java.sql.Connection;
import com.joseluis.cdatosdao.TipoDocumentoDao;
import com.joseluis.pe.cmodelo.TipoDocumento;
import com.joseluis.pe.db.Conexion;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;


public class TipoDocumentoBO {
    private String mensaje;
    TipoDocumentoDao tdd = new TipoDocumentoDao();
    
    public String agregarTipoDocumento(TipoDocumento tipoDocumento) throws SQLException{
        Connection c = Conexion.getConnection();
        try {
            mensaje = tdd.agregarTipoDocumento(c, tipoDocumento);
            c.commit();
        } catch (Exception e) {
            c.rollback();
        } finally {
            c.close();
        }
        return mensaje;
    }


public String eliminarTipoDocumento(TipoDocumento tipoDocumento) throws SQLException{
        Connection c = Conexion.getConnection();
        try {
            mensaje = tdd.eliminarTipoDocumento(c, tipoDocumento);
            System.out.println(mensaje);
            c.commit();
        } catch (Exception e) {
            c.rollback();
        } finally {
            c.close();
        }
        return mensaje;
    }

public String modificarTipoDocumento(TipoDocumento tipoDocumento) throws SQLException{
        Connection c = Conexion.getConnection();
        try {
            mensaje = tdd.modificarTipoDocumento(c, tipoDocumento);
            System.out.println(mensaje);
            c.commit();
        } catch (Exception e) {
            c.rollback();
        } finally {
            c.close();
        }
        return mensaje;
    }

public void listarTipoDocumento(JTable table){
    Connection c = Conexion.getConnection();
        try {
            tdd.ListarTipoDocumento(c, table);          
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            
        } finally {
         
        }
    
}
public ArrayList<TipoDocumento> listarTipoDocumentoCombo(){
    ArrayList<TipoDocumento> listaTipoDocumento = new ArrayList<>();
    Connection c = Conexion.getConnection();
    listaTipoDocumento = tdd.listarTipoDocumentoCombo(c);
    try {
        
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    return listaTipoDocumento;
}
}
