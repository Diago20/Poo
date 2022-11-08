
import java.util.Scanner;

public class Rtr {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Inserte la cantidad: ");
        int num = console.nextInt();
        String[] names = new String[num];
        System.out.println("Ingrese nombre y carrera de los estudiantes");
        for (int i = 0; i < names.length; i++) {
            names[i] = console.next();
            System.out.println(names[i]);
        }
    }
}
