package Animal;

public class Gato extends Animal {

    private String taxonomia;
    private String ojos;

    public Gato(String nombre, String raza, String color, String tamaño, String habitad, String taxonomia, String ojos) {
        super(nombre, raza, color, tamaño, habitad);
        this.taxonomia = taxonomia;
        this.ojos = ojos;
    }

    public String getTaxonomia() {
        return taxonomia;
    }

    public String getOjos() {
        return ojos;
    }

    @Override
    public String mostrarDatos() {
        return "Nombre: " + nombre
                + "\nRaza: " + raza
                + "\nColor: " + color
                + "\nTamaño: " + tamaño
                + "\nHabitad: " + habitad
                + "\nTaxonomia: " + taxonomia
                + "\nColor de ojos: " + ojos;
    }

}
