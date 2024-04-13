import abstracts.Producto;
import objects.Comic;
import objects.Iphone;
import objects.Libro;
import objects.TvLcd;

import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {
        Date date = new Date();
        Producto[] listaProductos = new Producto[6];


        listaProductos[0] = new Comic(240,date,"Robert Kirkman",
                "Invincible","Image Comics","Mark Greyson");
        listaProductos[1] = new Libro(540, date, "Joyanes Aguilar", "Aprende Java", "Penguin");
        listaProductos[2] = new Iphone(1000, "apple", "x", "negro");
        listaProductos[3] = new TvLcd(3000, "samsung", 45);
        listaProductos[4] = new Iphone(1000, "apple", "x", "negro");
        listaProductos[5] = new Libro(100,date, "Michael Pollan",
                "How To Change Your Mind", "Penguin Press");

        for (Producto producto : listaProductos){
            System.out.println(producto);
        }
    }
}