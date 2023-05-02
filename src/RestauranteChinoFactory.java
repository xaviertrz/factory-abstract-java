import Almuerzo.IAlmuerzo;
import Comida.ComidaChino;
import Comida.IComida;
import Desayuno.DesayunoChino;
import Desayuno.IDesayuno;
import Almuerzo.AlmuerzoChino;

public class RestauranteChinoFactory extends RestauranteAbstractFactory {

    @Override
    public IDesayuno crearDesayuno() {
        IDesayuno desayuno = new DesayunoChino();
        return desayuno;
    }

    @Override
    public IAlmuerzo crearAlmuerzo() {
        IAlmuerzo almuerzo = new AlmuerzoChino();
        return almuerzo;
    }

    @Override
    public IComida crearComida() {
        IComida comida = new ComidaChino();
        return comida;
    }
}
