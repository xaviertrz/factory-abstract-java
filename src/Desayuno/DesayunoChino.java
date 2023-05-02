package Desayuno;

public class DesayunoChino implements IDesayuno {
    @Override
    public String getTipo() {
        return "Chino";
    }

    @Override
    public String[] getMenu() {
        return new String[] { "Chocolate", "Pan", "Huevo Frito", "Queso" };
    }

    @Override
    public String getPostre() {
        return "Galleta";
    }

    @Override
    public float getPrecio() {
        return 10000;
    }

    @Override
    public String toString() {
        return "Tipo: [ ".concat(getTipo())
                .concat(" ] - Menú: [ ").concat(String.join(",", getMenu()))
                .concat(" ] - Postre: [ ").concat(getPostre())
                .concat(" ] - Precio: [ ").concat(String.valueOf(getPrecio())).concat(" ]");
    }
}
