
package com.joseluis.ctest;
//Test.java
import com.joseluis.cnegocio.TipoDocumentoBO;
import com.joseluis.pe.cmodelo.TipoDocumento;
import java.sql.SQLException;
import java.text.ParseException;


public class Test {
    TipoDocumentoBO tdbo = new TipoDocumentoBO();
    TipoDocumento td = new TipoDocumento();
    
    public void insertar()  throws SQLException, ParseException{
        td.setNombre("jose luis");
        td.setEstado("1");
        td.setOrden(4);
        td.setSigla("DNI");
        td.setFechaActualiza("10-10-24");
        tdbo.agregarTipoDocumento(td);
    }
    
    public void eliminar() throws SQLException, ParseException{
         td.setIdTipoDocumento(22);
        tdbo.eliminarTipoDocumento(td);
    }

    public void modificar() throws SQLException, ParseException{
         
        
        td.setNombre("jose luis");
        td.setEstado("1");
        td.setOrden(4);
        td.setSigla("DNI");
        td.setFechaActualiza("10-10-24");
        td.setIdTipoDocumento(23);
        tdbo.modificarTipoDocumento(td);
    }
    
    public static void main(String[] args) throws SQLException, ParseException{
        Test t = new Test();
        //t.insertar();
       // t.eliminar();
       t.modificar();
    }
}
