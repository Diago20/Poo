package carro;

public class carro {
    String plate;
    String color;
    String brand;
    double cylinder;
    int age;
    
    public carro(String _plate, String _color, String _brand, double _cylinder, int _age){
        this.plate=_plate;
        this.color=_color;
        this.brand=_brand;
        this.cylinder=_cylinder;
        this.age=_age;
    }
    
    public void result(){
        System.out.println("La placa del carro es: "+plate);
        System.out.println("el color: "+color);
        System.out.println("La marca: "+brand);
        System.out.println("El cilindraje: "+cylinder);
        System.out.println("El año de fabricacion: "+age);
    }
    
}