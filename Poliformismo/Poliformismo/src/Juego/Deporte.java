package Juego;

public class Deporte extends Juego {

    private String tipo;
    private String balon;

    public Deporte(String desarrollador, String nombre, int año, String tipo, String balon) {
        super(desarrollador, nombre, año);
        this.tipo = tipo;
        this.balon = balon;
    }

    public String getTipo() {
        return tipo;
    }

    public String getBalon() {
        return balon;
    }

    @Override
    public String mostrarDatos() {
        return "Desarrollador: " + desarrollador
                + "\nNombre: " + nombre
                + "\nAño: " + año
                + "\nTipo: " + tipo
                + "\nBalon: " + balon;
    }

}
