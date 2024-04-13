package objects;

import abstracts.Producto;
import interfaces.IntLibro;

import java.util.Date;

public class Libro extends Producto implements IntLibro {
    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }


    @Override
    public double getPrecioVenta() {
        // No sabia si calcular el precio de venta de otra manera
        // o que sea un atributo privado de cada clase, asi que
        // le hice un recargo de 20% del precio del producto.
        return getPrecio() * 1.20;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString(){
        return "Libro{\n\t" +
                "precio=" + getPrecio() + "\n\t" +
                "precioVenta=" + getPrecioVenta() + "\n\t" +
                "fechaPublicacion='" + getFechaPublicacion() + "'\n\t" +
                "autor='" + getAutor() + "'\n\t" +
                "titulo='" + getTitulo() + "'\n\t" +
                "editorial='" + getEditorial() + "'\n\t" +
                "}";
    }
}
