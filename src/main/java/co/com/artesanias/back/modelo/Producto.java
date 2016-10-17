package co.com.artesanias.back.modelo;

/**
 * Clase para manejar el modelo de los productos del ecommerce
 * @author Jorge Eliécer Gantiva Ochoa
 */
public class Producto {
    
    /**
     * Id del producto
     */
    private int id;
    /**
     * Nombre del producto
     */
    private String nombre;
    /**
     * Descripción del producto
     */
    private String descripcion;
    /**
     * Precio del producto
     */
    private long precio;
    /**
     * Descuento aplicado al producto
     */
    private int descuento;
    /**
     * Código de manejo interno del producto
     */
    private String codigo;

    /**
     * Constructor por parámetros del producto
     * @param id Id del producto
     * @param nombre Nombre del producto
     * @param descripcion Descripción del producto
     * @param precio Precio del producto
     * @param descuento Descuento del producto
     * @param codigo Código del producto
     */
    public Producto(int id, String nombre, String descripcion, long precio, int descuento, String codigo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.descuento = descuento;
        this.codigo = codigo;
    }

    /**
     * Obtiene el Id del producto
     * @return Id del producto
     */
    public int getId() {
        return id;
    }

    /**
     * Asigna el Id del producto
     * @param id Id del producto
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del producto
     * @return Nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre del producto
     * @param nombre Nombre del producto 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción del producto
     * @return Descripción del producto
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Asigna la descripción del producto
     * @param descripcion Descripción del producto 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el precio del producto
     * @return Precio del producto
     */
    public long getPrecio() {
        return precio;
    }

    /**
     * Asigna el precio del producto
     * @param precio Precio del producto
     */
    public void setPrecio(long precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el valor del descuento del producto
     * @return Valor del descuento del producto
     */
    public int getDescuento() {
        return descuento;
    }

    /**
     * Asigna el valor del descuento del producto
     * @param descuento Valor del descuento del producto
     */
    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    /**
     * Obtiene el código de manejo interno del producto
     * @return Código de manejo interno del producto
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Asigna el código de manejo interno del producto
     * @param codigo Código de manejo interno del producto
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}