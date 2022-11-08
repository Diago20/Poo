package Animal;

public class Animal {

    protected String nombre;
    protected String raza;
    protected String color;
    protected String tamaño;
    protected String habitad;

    public Animal(String nombre, String raza, String color, String tamaño, String habitad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.tamaño = tamaño;
        this.habitad = habitad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getHabitad() {
        return habitad;
    }

    public String mostrarDatos() {
        return "Nombre: "+nombre+
                "\nRaza: "+raza+
                "\nColor: "+color+
                "\nTamaño: "+tamaño+
                "\nHabitad: "+habitad;
    }

}
