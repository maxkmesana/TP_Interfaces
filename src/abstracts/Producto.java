package abstracts;

import interfaces.IntProducto;

public abstract class Producto implements IntProducto {
    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    // getPrecioVenta() : double se delega para implementacion en subclases
}
