package Juego;

public class Simulacion extends Juego{
    private String consola;
    private String tipo;

    public Simulacion(String desarrollador, String nombre, int año, String consola, String tipo) {
        super(desarrollador, nombre, año);
        this.consola = consola;
        this.tipo = tipo;
    }

    public String getConsola() {
        return consola;
    }

    public String getTipo() {
        return tipo;
    }
    
    @Override
    public String mostrarDatos(){
        return "Desarrollador: " + desarrollador
                + "\nNombre: " + nombre
                + "\nAño: " + año
                + "\nConsola: " + consola
                + "\nTipo: " + tipo;
    }
    
}
