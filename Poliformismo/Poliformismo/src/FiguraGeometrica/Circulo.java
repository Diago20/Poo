package FiguraGeometrica;

public class Circulo extends Figura {

    private String radio;
    private String esfera;

    public Circulo(String nombre, String perimetro, String area, String volumen, String radio, String esfera) {
        super(nombre, perimetro, area, volumen);
        this.radio = radio;
        this.esfera = esfera;
    }

    public String getRadio() {
        return radio;
    }

    public String getEsfera() {
        return esfera;
    }

    @Override
    public String mostrarDatos() {
        return "Nombre: " + nombre
                + "\nPerimetro: " + perimetro
                + "\nArea: " + area
                + "\nVolumen: " + volumen
                + "\nRadio: " + radio
                + "\nEsfera: " + esfera;
    }
}
