package FiguraGeometrica;


public class Triangulo extends Figura{
    private String tipos;
    private String angulo;

    public Triangulo(String nombre, String perimetro, String area, String volumen, String tipos, String angulo) {
        super(nombre, perimetro, area, volumen);
        this.tipos = tipos;
        this.angulo = angulo;
    }

    public String getTipos() {
        return tipos;
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
                + "\nTipos: " + tipos
                + "\nAngulo: " + angulo;
    }
    
}
