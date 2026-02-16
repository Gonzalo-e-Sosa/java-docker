import composite.Cuadrado;
import composite.GrupoFiguraGeometrica;
import composite.Triangulo;
import state.Tank;
import state.TankModeSiegeState;
import state.TankModeTankState;

public class App {
    public static void main(String[] args) throws Exception {
        // compositeExercise();

        stateExercise();
    }

    public static void compositeExercise() {
        System.out.println(
                "Augusto quiere ayudar a su hija con una tarea del jardín de infantes.\nLe han pedido que lleve materiales para pintar una serie de formas geométricas con colores.\nHabrá un grupo de formas que pintará de un color, y otro grupo que pintará de otro color, y así sucesivamente.\nElla dispone por anticipado de las medidas y ubicaciones precisas de cada figura, pero necesita saber cuántos pomos de cada témpera debe comprar.\nSabiendo que un pomo de témpera tiene un poder cubritivo de 100cm2, y que no puede comprar \"fracciones de pomo\", se te pide que le muestres una forma de calcular las cantidades a comprar utilizando el patrón de diseño Composite.\n"
                        +
                        "\nNota: Las figuras no se solapan entre sí. Cada figura estará pintada al 100% del color indicado.\n");

        GrupoFiguraGeometrica grupo = new GrupoFiguraGeometrica();

        grupo.agregarFiguraGeometrica(new Cuadrado(162.3));
        grupo.agregarFiguraGeometrica(new Triangulo(125.3));

        double medidaDeGrupo = grupo.obtenerMedida();

        double pomo = 100.0;

        System.out.println("Medida de grupo: " + medidaDeGrupo);
        System.out.println("Pomos a comprar para grupo: " + ((int) Math.floor(medidaDeGrupo / pomo + 1)));
    }

    public static void stateExercise() {
        System.out.println(
                "Considere que tiene una clase llamada \"Tank\" que representa a un tanque Terran en Starcraft 2. Implemente el patrón State para modelar los dos posibles estados del tanque: el estado \"Modo Tanque\" y el estado \"Modo Asedio\". A continuación, se proporcionan varios métodos que puede incluir en la implementación:\r\n"
                        + //
                        "\r\n" + //
                        "Tank: la clase principal que representa un tanque Terran y contiene una referencia a un objeto de estado concreto.\r\n"
                        + //
                        "TankState: la interfaz que define los métodos comunes que deben implementar los estados concretos.\r\n"
                        + //
                        "TankModeTankState: una clase que implementa la interfaz TankState y representa el estado \"Modo Tanque\" del tanque. Debe proporcionar implementaciones para los métodos específicos de este estado, como moverse() y atacar().\r\n"
                        + //
                        "TankModeSiegeState: una clase que implementa la interfaz TankState y representa el estado \"Modo Asedio\" del tanque. Debe proporcionar implementaciones para los métodos específicos de este estado, como moverse() y atacar().\n");

        Tank tanque = new Tank();
        tanque.setState(new TankModeTankState(tanque));

        tanque.moverse();
        tanque.atacar();

        tanque.setState(new TankModeSiegeState(tanque));
        tanque.moverse();
        tanque.atacar();
    }
}
