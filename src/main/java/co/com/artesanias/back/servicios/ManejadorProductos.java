/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.artesanias.back.servicios;

import co.com.artesanias.back.dao.ProductoDao;
import co.com.artesanias.back.modelo.Producto;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Clase para el manejo de productos del ecommerce
 * @author Jorge Eliécer Gantiva Ochoa
 */
@Controller
@RequestMapping("wsProductos")
public class ManejadorProductos {
    
    @RequestMapping(value = "getProductos.rest", method = RequestMethod.GET)
    @ResponseBody 
    public ArrayList<Producto> cargarProductos() throws Exception {
        ArrayList<Producto> productos = ProductoDao.consultarProductos();
        return productos;
    }
}