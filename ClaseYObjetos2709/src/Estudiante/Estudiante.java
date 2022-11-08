package Estudiante;

public class Estudiante {
    int nit;
    String name;
    String surname;
    String direction;
    int age;
    
    public Estudiante(int _nit, String _name, String _surname, String _direction, int _age){
        this.nit=_nit;
        this.name=_name;
        this.surname=_surname;
        this.direction=_direction;
        this.age=_age;
    }
     public void result(){
         System.out.println("EL nombre es: "+name+" "+surname);
         System.out.println("El nit es: "+nit);
         System.out.println("La edad es: "+age);
         System.out.println("La direccion es: "+direction);
     }
}
