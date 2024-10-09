
package com.joseluis.ctest;

import com.joseluis.cnegocio.TipoDocumentoBO;
import com.joseluis.pe.cmodelo.TipoDocumento;
import java.sql.SQLException;
import java.text.ParseException;


public class Test {
    TipoDocumentoBO tdbo = new TipoDocumentoBO();
    TipoDocumento td = new TipoDocumento();
    
    public void insertar()  throws SQLException, ParseException{
        td.setNombre("Registro Nacional de Identidad");
        td.setEstado("1");
        td.setOrden(1);
        td.setSigla("DNI");
        td.setFechaActualiza("09-10-24");
        tdbo.agregarTipoDocumento(td);
    }
    
    public static void main(String[] args) throws SQLException, ParseException{
        Test t = new Test();
        t.insertar();
    }
}
