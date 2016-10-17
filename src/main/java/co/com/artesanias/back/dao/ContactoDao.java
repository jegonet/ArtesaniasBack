package co.com.artesanias.back.dao;

import co.com.artesanias.back.modelo.Contacto;

/**
 * Clase para el manejo de persistencia de datos de contactos
 * @author Jorge Eliecer Gantiva Ochoa
 */
public class ContactoDao {
    
    /**
     * Inserta un contacto en la base de datos
     * @param contacto Contacto a guardar
     * @throws Exception Error al tratar de insertar contactos en la base de datos
     */
    public static void insertarContacto(Contacto contacto) throws Exception{
        
        BaseDatosDao.ejecutarSQL("insert into contacto(nombreCompleto, email, comentarios) values('" +
                BaseDatosDao.limpiarParametro(contacto.getNombreCompleto()) + "', '" +
                BaseDatosDao.limpiarParametro(contacto.getEmail()) + "', '" +
                BaseDatosDao.limpiarParametro(contacto.getComentarios()) + "')"
        );
    }
}