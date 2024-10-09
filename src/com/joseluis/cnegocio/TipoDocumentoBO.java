
package com.joseluis.cnegocio;

import java.sql.Connection;
import com.joseluis.cdatosdao.TipoDocumentoDao;
import com.joseluis.pe.cmodelo.TipoDocumento;
import com.joseluis.pe.db.Conexion;
import java.sql.SQLException;


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
}
