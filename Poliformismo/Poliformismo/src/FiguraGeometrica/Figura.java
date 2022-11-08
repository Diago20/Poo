package FiguraGeometrica;

public class Figura {

    protected String nombre;
    protected String perimetro;
    protected String area;
    protected String volumen;

    public Figura(String nombre, String perimetro, String area, String volumen) {
        this.nombre = nombre;
        this.perimetro = perimetro;
        this.area = area;
        this.volumen = volumen;
    }

    public String getPerimetro() {
        return perimetro;
    }

    public String getArea() {
        return area;
    }

    public String getVolumen() {
        return volumen;
    }

  
    public String mostrarDatos() {
        return "Nombre: "+nombre+
                "\nPerimetro: "+perimetro+
                "\nArea: "+area+
                "\nVolumen: "+volumen;
    }

}
