package Juego;

public class Principal {
    public static void main(String[] args) {
        Juego show [] = new Juego [6];
        
        show [0] = new Juego("EA", "Fifa", 2018);
            show [1] = new Accion("Xbox", "call of duty", 2019, "matar un objetivo", "varias");
            show [2] = new Deporte("EA", "Tennis", 2010, "Puntuacion", "pelota de tennis");
            show [3] = new Aventura("ubisoft", "Asassing", 2020, "Asesino", "ciudad");
            show [4] = new Simulacion("konami", "parque diverciones", 2000, "wii", "casco");
            show [5] = new Musical("sony", "Guitar Flash", 2020, "Guitarra", "Musical");
            
            for(Juego Juego:show){
                System.out.println(Juego.mostrarDatos());
                System.out.println(" ");
            }
    }
    
}
