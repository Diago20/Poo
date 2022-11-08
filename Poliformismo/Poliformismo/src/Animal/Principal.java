package Animal;

public class Principal {
    public static void main(String[] args) {
        Animal show[] = new Animal[4];
        
        show[0] = new Animal("Pajaro", "Loro", "Variado", "pequeño", "Selva");
                show[1] = new Gato("Gato", "Persa", "Gris con varios colores", "Mediano", "Variado", "Felino", "verde");
                show[2] = new Delfin("Delfin", "Chileno", "Negro", "1.65 m", "Mar", "Mamifero", "Corto");
                show[3] = new Gusano("Gusano", "Seda", "Blanco", "3 cm", "Variado", "Insecto", "5 Patas");
                
                for(Animal Animal: show){
                    System.out.println(Animal.mostrarDatos());
                    System.out.println(" ");
                }
    }
    
}
