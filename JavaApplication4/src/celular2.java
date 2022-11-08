
import java.util.Scanner;

public class celular2 {

    public static void main(String[] args) {
        Scanner console=new Scanner (System.in);
        System.out.println("cuantos celulares va a vender: ");
        int cant=console.nextInt();
        int celular[]=new int[cant];
        
            for(int i=0;i<cant;i++){
            System.out.println("Ingrese la marca del celular: ");
            int marca=Integer.parseInt(console.nextLine());
            System.out.println("Ingrese el precio del celular: ");
            int precio=console.nextInt();
            }
        
    }

}
