package composite;

public class Cuadrado extends FiguraGeometrica {
    public Cuadrado(double medida) {
        super(medida);
    }

    @Override
    public double obtenerMedida() {
        return this.medida;
    }
}
