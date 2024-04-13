package objects;

import abstracts.Electronico;

public class Iphone extends Electronico {
    private String modelo;
    private String color;

    public Iphone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    public double getPrecioVenta(){
        // No sabia si calcular el precio de venta de otra manera
        // o que sea un atributo privado de cada clase, asi que
        // le hice un recargo de 20% del precio del producto.
        return getPrecio() * 1.20;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "Iphone{\n\t" +
                "precio=" + getPrecio() + "\n\t" +
                "precioVenta=" + getPrecioVenta() + "\n\t" +
                "fabricante='" + getFabricante() + "'\n\t" +
                "modelo='" + modelo + "'\n\t" +
                "color='" + color + "'\n\t" +
                "}";
    }
}
