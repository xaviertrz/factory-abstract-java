import Almuerzo.IAlmuerzo;
import Comida.IComida;
import Desayuno.IDesayuno;

public abstract class RestauranteAbstractFactory {
    public abstract IComida crearComida();

    public abstract IDesayuno crearDesayuno();

    public abstract IAlmuerzo crearAlmuerzo();
}