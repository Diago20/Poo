package Ventana;

public class Principal {
    public static void main(String[] args) {
        Ventana v1 = new Ventana();
        Button show = new Button();
        Texto texto = new Texto();
        
        v1.setVisible(true);
        v1.iniciarComponentes();
        show.setVisible(true);
        show.inicioButton();
        texto.setVisible(true);
        texto.inicioTexto();
    }
}