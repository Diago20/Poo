package Ventana;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

    public Ventana() {
        //setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100, 250, 600, 600);
    }

    public void iniciarComponentes() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.decode("#2471A3"));
        panel.setLayout(null);

        this.getContentPane().add(panel);
        

        JLabel etiqueta = new JLabel("Uniagustiniana",SwingConstants.CENTER);
        etiqueta.setBounds(250,0,170,50);
        etiqueta.setForeground(Color.decode("#BFED58"));
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.decode("#7355FA"));
        panel.add(etiqueta);
        
        JLabel name = new JLabel("Nombre: Diego ",SwingConstants.LEFT);
        name.setBounds(0,100,170,50);
        name.setForeground(Color.decode("#402a15"));
        name.setOpaque(true);
        name.setBackground(Color.decode("#D242E3"));
        panel.add(name);
        
        JLabel phone = new JLabel("Telefono: 30062534276 ",SwingConstants.LEFT);
        phone.setBounds(0,150,170,50);
        phone.setForeground(Color.decode("#402a15"));
        phone.setOpaque(true);
        phone.setBackground(Color.decode("#D242E3"));
        panel.add(phone);
        
        JLabel cod = new JLabel("codigo: 23561246 ",SwingConstants.LEFT);
        cod.setBounds(0,200,170,50);
        cod.setForeground(Color.decode("#402a15"));
        cod.setOpaque(true);
        cod.setBackground(Color.decode("#D242E3"));
        panel.add(cod);
        
        JLabel carrera = new JLabel("Carrera: desarrollo de software ",SwingConstants.LEFT);
        carrera.setBounds(0,250,190,50);
        carrera.setForeground(Color.decode("#402a15"));
        carrera.setOpaque(true);
        carrera.setBackground(Color.decode("#D242E3"));
        panel.add(carrera);
    }
}
