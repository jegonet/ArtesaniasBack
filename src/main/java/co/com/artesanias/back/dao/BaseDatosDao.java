package co.com.artesanias.back.dao;

import co.com.artesanias.back.utilidades.*;
import java.sql.*;
import java.util.Properties;
import org.json.JSONObject;

/**
 * Clase general para el manejo de la base de datos
 * @author Jorge Eliecer Gantiva Ochoa
 */
public class BaseDatosDao {
    /** 
     * Ruta de driver (Postgresql) de base datos con servidor y nombre de base datos
     */
    private static String baseDatosUrl;
    /**
     * Porpiedades de la conexión a la base datos. Usuario, password y compatibilidad con SSL
     */
    private static Properties baseDatosPropiedades;
    /**
     * Objetvo interno de conexión a la base de datos
     */
    private static Connection conexion;
    
    /**
     * Obtiene la conexión actual, comprobando que esté abierta y disponible, de los contrario 
     * vuelve abrir la conexión
     * @return Conexión abierta lista para ejecutarse
     * @throws SQLException Error de conexión a la base datos
     */
    private static Connection getSingletonConexion() throws Exception{
        if(conexion == null) {
            JSONObject json = LectorArchivo.leerArchivoJson(Constante.RUTA_ARCHIVO_CONFIGURACION);
            baseDatosUrl = "jdbc:postgresql:" +  json.getString("db_hostPath");
            baseDatosPropiedades = new Properties();
            baseDatosPropiedades.setProperty("user", json.getString("db_user"));
            baseDatosPropiedades.setProperty("password", json.getString("db_password"));
            if(json.getString("db_ssl").equals("true"))
                baseDatosPropiedades.setProperty("ssl", "true");
            conexion = DriverManager.getConnection(baseDatosUrl, baseDatosPropiedades);
        }
        
        try {
            Statement st = conexion.createStatement();
            st.executeQuery("SELECT 1;");
        }
        catch(SQLException ex){
            conexion = DriverManager.getConnection(baseDatosUrl, baseDatosPropiedades);
        }
        
        return conexion;
    }
    
    /**
     * Ejecuta sentencias SQL que retornan información
     * @param consulta SQL de consulta a ejecutar (debe ser una sentencia con proposito de retonor de datos)
     * @return ResulSet con las filas retonadas de la consulta realizada
     * @throws SQLException Error de ejecución del SQL de consulta
     */
    protected static ResultSet extraerDatos(String consulta) throws Exception {
        Statement st = getSingletonConexion().createStatement();
        ResultSet rs = st.executeQuery(consulta);
        return rs;
    }

    /**
     * Ejecuta en la base de datos una sentencia diferente a SELECT, ya que no debe retornar datos 
     * @param sentencia Sentencia SQL a ejecutar en la base de datos
     * @throws SQLException Error de ejecución de la sentencia SQL
     */
    protected static void ejecutarSQL(String sentencia) throws Exception {
        Statement st = getSingletonConexion().createStatement();
        st.executeUpdate(sentencia);
    }
    
    /**
     * Cierra la conexión a la base de datos
     */
    protected static void cerrarConexion() {
        try{
            conexion.close();
        }
        catch(Exception e){
            //Es posible que la conexion ya este cerrada
        }    
    }
    
    /**
     * Limpia parámetros para ser concatenados en una sentencia SQL
     * @param valor Valor de parámetro a limpiar
     * @return Valor del parámetro limpio listo para concatenar con SQL
     */
    protected static String limpiarParametro(String valor) {
        return valor.replace('\'', '"').replace(';', ',');
    }
}