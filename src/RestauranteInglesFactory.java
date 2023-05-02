import Almuerzo.IAlmuerzo;
import Comida.ComidaIngles;
import Comida.IComida;
import Desayuno.DesayunoIngles;
import Desayuno.IDesayuno;
import Almuerzo.AlmuerzoIngles;

public class RestauranteInglesFactory extends RestauranteAbstractFactory {

    @Override
    public IDesayuno crearDesayuno() {
        IDesayuno desayuno = new DesayunoIngles();
        return desayuno;
    }

    @Override
    public IAlmuerzo crearAlmuerzo() {
        IAlmuerzo almuerzo = new AlmuerzoIngles();
        return almuerzo;
    }

    @Override
    public IComida crearComida() {
        IComida comida = new ComidaIngles();
        return comida;
    }
}
