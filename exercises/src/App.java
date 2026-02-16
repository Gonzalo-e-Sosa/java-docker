import composite.Cuadrado;
import composite.GrupoFiguraGeometrica;
import composite.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        compositeExercise();
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
}
