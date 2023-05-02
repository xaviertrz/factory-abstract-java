package Desayuno;

public class DesayunoIngles implements IDesayuno {
    @Override
    public String getTipo() {
        return "Inglés";
    }

    @Override
    public String[] getMenu() {
        return new String[] { "Café", "Huevos revueltos", "Sandwich" };
    }

    @Override
    public String getPostre() {
        return "Dona";
    }

    @Override
    public float getPrecio() {
        return 15000;
    }

    @Override
    public String toString() {
        return "Tipo: [ ".concat(getTipo())
                .concat(" ] - Menú: [ ").concat(String.join(",", getMenu()))
                .concat(" ] - Postre: [ ").concat(getPostre())
                .concat(" ] - Precio: [ ").concat(String.valueOf(getPrecio())).concat(" ]");
    }
}
