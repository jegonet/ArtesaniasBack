/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.artesanias.back.servicios;

import co.com.artesanias.back.dao.ContactoDao;
import co.com.artesanias.back.modelo.Contacto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Clase para el manejo de productos del ecommerce
 * @author Jorge Eliécer Gantiva Ochoa
 */
@Controller
@RequestMapping("wsContactos")
public class ManejadorContactos {
    
    @RequestMapping(value = "addContacto.rest", params = {"nombre", "email", "comentario"}, method = RequestMethod.POST)
    @ResponseBody 
    public boolean cargarProductos(@RequestParam("nombre") String nombre, 
        @RequestParam("email") String email, @RequestParam("comentario") String comentario) throws Exception {

        Contacto contacto = new Contacto(nombre, email, comentario);
        ContactoDao.insertarContacto(contacto);
        return true;
    }
}