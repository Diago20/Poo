package FiguraGeometrica;

public class Cuadrado extends Figura {

    private String lados;
    private String angulo;

    public Cuadrado(String nombre, String perimetro, String area, String volumen, String lados, String angulo) {
        super(nombre, perimetro, area, volumen);
        this.lados = lados;
        this.angulo = angulo;
    }

    public String getLados() {
        return lados;
    }

    public String getAngulo() {
        return angulo;
    }

    @Override
    public String mostrarDatos() {
        return "Nombre: " + nombre
                + "\nPerimetro: " + perimetro
                + "\nArea: " + area
                + "\nVolumen: " + volumen
                + "\nLados: " + lados
                + "\nAngulo: " + angulo;
    }

}
