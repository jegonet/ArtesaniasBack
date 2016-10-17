package co.com.artesanias.back.utilidades;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Clase utilitaria para la lectura de archivos
 * @author Jorge Eliecer Gantiva Ochoa
 */
public class LectorArchivo {
    
    /**
     * Lee un archivo JSON retornando como de dicho tipo
     * @param rutaArchivo Ruta/URL del archivo JSON a leer
     * @return Objeto JSON que representa el archivo leido
     * @throws Exception Error en la lectura del archivo JSON
     */
    public static JSONObject leerArchivoJson(URL rutaArchivo) throws Exception {
        
        JSONObject jsonObject;
        
        try {
            File file = new File(rutaArchivo.toURI());
            file.setReadable(true);
            //file.setReadOnly();
            FileInputStream fileInput = new FileInputStream(file);

            byte[] data = new byte[(int) file.length()];
            fileInput.read(data);
            fileInput.close();

            String strFile = new String(data, "UTF-8");
            jsonObject = new JSONObject(strFile);
        }
        catch (IOException e) {
            throw new Exception("Error de lectura de archivo JSON: " + e.getMessage());
        }
        catch (JSONException e) {
            throw new Exception("Error convirtiendo archivo JSON: " + e.getMessage());
        }
        return jsonObject;  
    }
}