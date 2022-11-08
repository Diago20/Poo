import java.util.Scanner;
public class arreglo4 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        
        int lista[]=new int[20];
        int lim;
        
        System.out.println("Ingrese limite del arreglo");
        lim=lector.nextInt();
        
        for(int i=0;i<lim;i++){
            System.out.println("X ["+(i+1)+"]= ");
            lista[i]=lector.nextInt();
        }
        for(int i=0;i<lim;i++)
            System.out.print(lista[i]+", ");
        
    }
    
}
