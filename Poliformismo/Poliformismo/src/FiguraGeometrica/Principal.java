package FiguraGeometrica;

public class Principal {

    public static void main(String[] args) {
        Figura show[] = new Figura[5];

        show[0] = new Figura("Pentagono", "25cm", "25cm", "50cm");
        show[1] = new Circulo("Circulo", "5π cm", "2.5π cm", "20.83π cm", "2.5 cm", "si");
        show[2] = new Cuadrado("Cuadrado", "8 cm", "4 cm", "8 cm", "4", "90 grados");
        show[3] = new Rectangulo("rectangulo", "10 cm", "6 cm", "8 cm", "8", "4");
        show[4] = new Triangulo("Triangulo", "6 cm", "2 cm", "8 cm", "Equilatero", "90°");
        
        for(Figura Figura:show){
            System.out.println(Figura.mostrarDatos());
            System.out.println(" ");
        }

    }

}
