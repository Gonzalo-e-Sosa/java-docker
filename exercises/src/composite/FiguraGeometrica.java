package composite;

public abstract class FiguraGeometrica implements Figura {
    protected double medida;

    FiguraGeometrica(double medida) {
        this.medida = medida;
    }
}
