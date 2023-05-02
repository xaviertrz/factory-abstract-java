package Almuerzo;

public class AlmuerzoIngles implements IAlmuerzo {
    @Override
    public String getTipo() {
        return "Inglés";
    }

    @Override
    public String[] getMenu() {
        return new String[] { "Papas a la francesa", "Res", "Ensalada de cebolla" };
    }

    @Override
    public float getPrecio() {
        return 22000;
    }

    @Override
    public String toString() {
        return "Tipo: [ ".concat(getTipo())
                .concat(" ] - Menú: [ ").concat(String.join(",", getMenu()))
                .concat(" ] - Precio: [ ").concat(String.valueOf(getPrecio())).concat(" ]");
    }
}
