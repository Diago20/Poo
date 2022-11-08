
public class arreglo2 {
    public static void main(String[] args) {
        final int tamano=26;
        char lista[]=new char[tamano];
        char letra ='A';
        for(int i=0;i<tamano;i++){
        lista[i]=letra;
        letra++;
    }
        for(int i=0;i<tamano;i++){
            System.out.print(lista[i]+" ");
        }
    }
    
}

