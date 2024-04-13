package objects;

import abstracts.Electronico;

public class TvLcd extends Electronico {
    private int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public double getPrecioVenta(){
      // No sabia si calcular el precio de venta de otra manera
      // o que sea un atributo privado de cada clase, asi que
      // le hice un recargo de 20% del precio del producto
        return  getPrecio() * 1.20;
    }

    public int getPulgada() {
        return pulgada;
    }

    public void setPulgada(int pulgada) {
        this.pulgada = pulgada;
    }

    public String toString(){
        return "Iphone{\n\t" +
                "precio=" + getPrecio() + "\n\t" +
                "precioVenta=" + getPrecioVenta() + "\n\t" +
                "fabricante='" + getFabricante() + "'\n\t" +
                "pulgada=" + pulgada + "\n\t" +
                "}";
    }
}
