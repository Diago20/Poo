package Ventana;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Texto extends JFrame{
    public Texto(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(1200, 250, 600, 600);
    }
    
    public void inicioTexto(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        JTextField caja1 = new JTextField("Introduzca");
        caja1.setBounds(100, 200, 120, 60);
        panel.add(caja1);
        
        JTextArea areaTexto =new JTextArea("Escriba");
        areaTexto.setBounds(250, 250, 70, 40);
        panel.add(areaTexto);
        
        
        String[] paises = {"peru", "colombia", "paraguay","Ecuador"};
        JComboBox lista = new JComboBox(paises);
        lista.setBounds(300, 100, 100, 100);
        panel.add(lista);
        
        
    
}
}
