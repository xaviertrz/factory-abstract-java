package Almuerzo;

public class AlmuerzoChino implements IAlmuerzo {
    @Override
    public String getTipo() {
        return "Chino";
    }

    @Override
    public String[] getMenu() {
        return new String[] { "Sopa", "Arroz Con Verduras", "Pollo", "Ensalada" };
    }

    @Override
    public float getPrecio() {
        return 15000;
    }

    @Override
    public String toString() {
        return "Tipo: [ ".concat(getTipo())
                .concat(" ] - Menú: [ ").concat(String.join(",", getMenu()))
                .concat(" ] - Precio: [ ").concat(String.valueOf(getPrecio())).concat(" ]");
    }
}
