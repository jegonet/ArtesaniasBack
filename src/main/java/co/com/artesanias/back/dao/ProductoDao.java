package co.com.artesanias.back.dao;

import java.util.ArrayList;
import co.com.artesanias.back.modelo.Producto;
import java.sql.*;

/**
 * Clase para el manejo de persistencia de datos de usuarios
 * @author Jorge Eliecer Gantiva Ochoa
 */
public class ProductoDao {
    
    /**
     * Consulta todos los productos del ecommerce
     * @throws Exception Error al tratar de consultar todos los productos de la base de datos
     */
    public static ArrayList<Producto> consultarProductos() throws Exception{
        
        ArrayList<Producto> productos = new ArrayList<Producto>();
	
	ResultSet resultado = null;
	
	try {
		resultado = BaseDatosDao.extraerDatos("select id, nombre, descripcion, precio, descuento, codigo from producto where habilitado = true order by id desc;");
		while(resultado.next()) {
                    Producto producto = new Producto(
                       resultado.getInt("id"),
                       resultado.getString("nombre"),
                       resultado.getString("descripcion"),
                       resultado.getLong("precio"),
                       resultado.getInt("descuento"),
                       resultado.getString("codigo")
                    );
                    productos.add(producto);
		}
		resultado.close();
	}
	catch(SQLException sqlEx){
		resultado.close();
		throw new Exception("Error SQL: " +  sqlEx.getMessage());
	}
	return productos;
    }
}