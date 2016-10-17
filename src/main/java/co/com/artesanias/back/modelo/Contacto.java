/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.artesanias.back.modelo;

/**
 * Clase para los contactos realizados desde la páginas web
 * @author Jorge Eliécer Gantiva Ochoa
 */
public class Contacto {
    /**
     * Nombre completo de contacto
     */
    private String nombreCompleto;
    /**
     * Email de contacto
     */
    private String email;
    /**
     * Comentarios realizados en el contacto
     */
    private String comentarios;

    /**
     * Constructor por parámetros del contacto de un contacto realizado
     * @param nombreCompleto Nombre completo de contacto
     * @param email Email de contacto
     * @param comentarios Comentarios realizados en el contacto
     */
    public Contacto(String nombreCompleto, String email, String comentarios) {
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.comentarios = comentarios;
    }

    /**
     * Obtiene el nombre completo de contacto
     * @return Nombre completo de contacto
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * Asigna el nombre completo de contacto
     * @param nombreCompleto Nombre completo de contacto
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * Obtiene el email de contacto
     * @return Email de contacto
     */
    public String getEmail() {
        return email;
    }

    /**
     * Asigna el email de contacto
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene los comentarios realizados en el contacto
     * @return Comentarios realizados en el contacto
     */
    public String getComentarios() {
        return comentarios;
    }

    /**
     * Asigna los comentarios realizados en el contacto
     * @param comentarios Comentarios realizados en el contacto
     */
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}