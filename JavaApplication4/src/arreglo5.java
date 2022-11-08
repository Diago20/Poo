
import java.util.Scanner;

public class arreglo5 {

    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos: ");
        int cant = Integer.parseInt(pc.nextLine());
        String names[] = new String[cant];
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el nombre del estudiante: ");
            String Studen = pc.nextLine();
            System.out.println("Ingrese el nombre de la universidad: ");
            String university = pc.nextLine();

            names[i] = Studen + " " + university;
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
