package Comida;

public class ComidaChino implements IComida {
    @Override
    public String getTipo() {
        return "Chino";
    }

    @Override
    public String[] getMenu() {
        return new String[] { "Lumpia" };
    }

    @Override
    public float getPrecio() {
        return 10000;
    }

    @Override
    public float getDomicilio() {
        return 3000;
    }

    @Override
    public String toString() {
        return "Tipo: [ ".concat(getTipo())
                .concat(" ] - Menú: [ ").concat(String.join(",", getMenu()))
                .concat(" ] - Domicilio: [ ").concat(String.valueOf(getDomicilio()))
                .concat(" ] - Precio: [ ").concat(String.valueOf(getPrecio())).concat(" ]");
    }
}
