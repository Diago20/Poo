package FiguraGeometrica;

public class Rectangulo extends Figura{
    private String vertices;
    private String lados;

    public Rectangulo(String nombre, String perimetro, String area, String volumen, String vertices, String lados) {
        super(nombre, perimetro, area, volumen);
        this.vertices = vertices;
        this.lados = lados;
    }

    public String getVertices() {
        return vertices;
    }

    public String getLados() {
        return lados;
    }
    
     @Override
    public String mostrarDatos() {
        return "Nombre: " + nombre
                + "\nPerimetro: " + perimetro
                + "\nArea: " + area
                + "\nVolumen: " + volumen
                + "\nVertices: " + vertices
                + "\nLados: " + lados;
    }
    
}
