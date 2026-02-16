package composite;

import java.util.ArrayList;
import java.util.List;

public class GrupoFiguraGeometrica implements Figura {
    private List<FiguraGeometrica> figuras = new ArrayList<>();

    @Override
    public double obtenerMedida() {
        double result = 0.0;

        for (FiguraGeometrica figuraGeometrica : figuras) {
            result += figuraGeometrica.obtenerMedida();
        }

        return result;
    }

    public void agregarFiguraGeometrica(FiguraGeometrica figura) {
        this.figuras.add(figura);
    }

    public void quitarFiguraGeomtrica(FiguraGeometrica figura) {
        this.figuras.remove(figura);
    }
}
