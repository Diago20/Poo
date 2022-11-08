package Animal;

public class Gusano extends Animal{
    private String taxonomia;
    private String patas;

    public Gusano(String nombre, String raza, String color, String tamaño, String habitad, String taxonomia, String patas) {
        super(nombre, raza, color, tamaño, habitad);
        this.taxonomia = taxonomia;
        this.patas = patas;
    }

    public String getTaxonomia() {
        return taxonomia;
    }

    public String getPatas() {
        return patas;
    }
    
    @Override
    public String mostrarDatos() {
        return "Nombre: " + nombre
                + "\nRaza: " + raza
                + "\nColor: " + color
                + "\nTamaño: " + tamaño
                + "\nHabitad: " + habitad
                + "\nTaxonomia: " + taxonomia
                + "\nCantidad de patas: " + patas;
    }
    
}
