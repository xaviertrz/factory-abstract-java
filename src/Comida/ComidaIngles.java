package Comida;

public class ComidaIngles implements IComida {
    @Override
    public String getTipo() {
        return "Inglés";
    }

    @Override
    public String[] getMenu() {
        return new String[] { "Pizza de la casa" };
    }

    @Override
    public float getPrecio() {
        return 18000;
    }

    @Override
    public float getDomicilio() {
        return 5000;
    }

    @Override
    public String toString() {
        return "Tipo: [ ".concat(getTipo())
                .concat(" ] - Menú: [ ").concat(String.join(",", getMenu()))
                .concat(" ] - Domicilio: [ ").concat(String.valueOf(getDomicilio()))
                .concat(" ] - Precio: [ ").concat(String.valueOf(getPrecio())).concat(" ]");
    }
}
