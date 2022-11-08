package Juego;

public class Musical extends Juego{
    private String control;
    private String genero;

    public Musical(String desarrollador, String nombre, int año, String control, String genero) {
        super(desarrollador, nombre, año);
        this.control = control;
        this.genero = genero;
    }

    public String getControl() {
        return control;
    }

    public String getGenero() {
        return genero;
    }
    
    @Override
    public String mostrarDatos(){
        return "Desarrollador: " + desarrollador
                + "\nNombre: " + nombre
                + "\nAño: " + año
                + "\nControl: " + control
                + "\nGenero: " + genero;
    }
}
