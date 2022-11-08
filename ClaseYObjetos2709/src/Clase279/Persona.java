package Clase279;

public class Persona {

    String name;
    int dni;

    public Persona(String name, int dni) {
        this.name = name;
        this.dni = dni;
    }

    public void result(int age) {
        System.out.print("Soy " + name + " tengo " + age + " mi cod documento "+dni+" y corri ");
    }

    public void Result(int km) {
        System.out.println(km + " km");
    }

}
