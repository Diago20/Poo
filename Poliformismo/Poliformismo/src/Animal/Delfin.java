package Animal;

public class Delfin extends Animal{
    private String taxonomia;
    private String hocico;

    public Delfin(String nombre, String raza, String color, String tamaño, String habitad, String taxonomia, String hocico) {
        super(nombre, raza, color, tamaño, habitad);
        this.taxonomia = taxonomia;
        this.hocico = hocico;
    }

    public String getTaxonomia() {
        return taxonomia;
    }

    public String getOcico() {
        return hocico;
    }
    
    @Override
    public String mostrarDatos() {
        return "Nombre: " + nombre
                + "\nRaza: " + raza
                + "\nColor: " + color
                + "\nTamaño: " + tamaño
                + "\nHabitad: " + habitad
                + "\nTaxonomia: " + taxonomia
                + "\nHocico: " + hocico;
    }
    
}
