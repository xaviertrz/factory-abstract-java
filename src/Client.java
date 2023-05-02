import Desayuno.IDesayuno;
import Almuerzo.IAlmuerzo;
import Comida.IComida;

public class Client {

    public static void main(String[] args) {
        RestauranteAbstractFactory restauranteChino = new RestauranteChinoFactory();
        IDesayuno desayunoChino = restauranteChino.crearDesayuno();
        System.out.println(desayunoChino.toString());

        RestauranteAbstractFactory restauranteIngles = new RestauranteInglesFactory();
        IDesayuno desayunoIngles = restauranteIngles.crearDesayuno();
        System.out.println(desayunoIngles.toString());
    }
}
