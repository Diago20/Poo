package Ventana;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

    public Ventana() {
        //setSize(500, 500);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100, 250, 600, 600);
    }

    public void iniciarComponentes() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.decode("#2471A3"));

        this.getContentPane().add(panel);

        JLabel etiqueta = new JLabel("Uniagustiniana",SwingConstants.CENTER);
        etiqueta.setBounds(0, 300, 100,20);
        etiqueta.setForeground(Color.decode("#BFED58"));
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.decode("#7355FA"));
        panel.add(etiqueta);
        
        JLabel name = new JLabel("Nombre: Diego ",SwingConstants.LEFT);
        name.setBounds(10,300, 100, 20);
        name.setForeground(Color.decode("#4095E6"));
        name.setOpaque(true);
        name.setBackground(Color.decode("#D242E3"));
        panel.add(name);
        
        JLabel phone = new JLabel("Telefono: 30062534276 ",SwingConstants.CENTER);
        phone.setBounds(0, 350, 100, 20);
        phone.setForeground(Color.decode("#4095E6"));
        phone.setOpaque(true);
        phone.setBackground(Color.decode("#D242E3"));
        panel.add(phone);
        
        JLabel cod = new JLabel("codigo: 23561246 ",SwingConstants.CENTER);
        cod.setBounds(0, 400, 100, 20);
        cod.setForeground(Color.decode("#4095E6"));
        cod.setOpaque(true);
        cod.setBackground(Color.decode("#D242E3"));
        panel.add(cod);
        
        JLabel carrera = new JLabel("Carrera: desarrollo de software ",SwingConstants.CENTER);
        carrera.setBounds(0, 450, 100, 20);
        carrera.setForeground(Color.decode("#4095E6"));
        carrera.setOpaque(true);
        carrera.setBackground(Color.decode("#D242E3"));
        panel.add(carrera);
    }
}
