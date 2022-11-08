package Juego;

public class Aventura extends Juego{
    private String personaje;
    private String ambiente;

    public Aventura(String desarrollador, String nombre, int año, String personaje, String ambiente) {
        super(desarrollador, nombre, año);
        this.personaje = personaje;
        this.ambiente = ambiente;
    }

    public String getPersonaje() {
        return personaje;
    }

    public String getAmbiente() {
        return ambiente;
    }
    
    @Override
    public String mostrarDatos() {
        return "Desarrollador: " + desarrollador
                + "\nNombre: " + nombre
                + "\nAño: " + año
                + "\nPersonaje: " + personaje
                + "\nAmbiente: " + ambiente;
    }
    
}
