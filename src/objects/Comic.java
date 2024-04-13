package objects;

import java.util.Date;

public class Comic extends Libro{
    private String personaje;

    public Comic(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    @Override
    public String toString() {
        return "Comic{\n\t" +
                "precio=" + getPrecio() + "\n\t" +
                "precioVenta=" + getPrecioVenta() + "\n\t" +
                "fechaPublicacion='" + getFechaPublicacion() + "'\n\t" +
                "autor='" + getAutor() + "'\n\t" +
                "titulo='" + getTitulo() + "'\n\t" +
                "editorial='" + getEditorial() + "'\n\t" +
                "personaje='" + personaje + "'\n\t" +
                "}";
    }
}
