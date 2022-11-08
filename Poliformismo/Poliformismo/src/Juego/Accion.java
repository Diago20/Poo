package Juego;

public class Accion extends Juego {

    private String objetivo;
    private String arma;

    public Accion(String desarrollador, String nombre, int año, String objetivo, String arma) {
        super(desarrollador, nombre, año);
        this.objetivo = objetivo;
        this.arma = arma;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public String getArma() {
        return arma;
    }

    @Override
    public String mostrarDatos() {
        return "Desarrollador: " + desarrollador
                + "\nNombre: " + nombre
                + "\nAño: " + año
                + "\nObjetivo: " + objetivo
                + "\nArma: " + arma;
    }

}
