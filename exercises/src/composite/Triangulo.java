package composite;

public class Triangulo extends FiguraGeometrica {
    public Triangulo(double medida) {
        super(medida);
    }

    @Override
    public double obtenerMedida() {
        return this.medida;
    }
}
