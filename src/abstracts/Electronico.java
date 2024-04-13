package abstracts;

import interfaces.IntElectronico;


public abstract class Electronico extends Producto implements IntElectronico {
    private String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante(){
        return fabricante;
    }
}
