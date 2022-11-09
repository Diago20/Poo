package Ventana;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class Button extends JFrame {

    public Button() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(600, 250, 600, 600);
    }

    public void inicioButton() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.decode("#64dfdf"));
        panel.setLayout(null);
        this.getContentPane().add(panel);

        JButton button1 = new JButton("Click");
        button1.setBounds(250, 50, 100, 60);
        button1.setBackground(Color.decode("#415a77"));
        panel.add(button1);

        JRadioButton radioButton1 = new JRadioButton("opcion 1", false);
        radioButton1.setBounds(100, 200, 120, 40);
        radioButton1.setBackground(Color.decode("#ffcfd2"));
        panel.add(radioButton1);

        JRadioButton radioButton2 = new JRadioButton("opcion 2", false);
        radioButton2.setBounds(100, 250, 120, 40);
        radioButton2.setBackground(Color.decode("#ffcfd2"));
        panel.add(radioButton2);
        
        JRadioButton radioButton3 = new JRadioButton("opcion 3", false);
        radioButton3.setBounds(100, 300, 120, 40);
        radioButton3.setBackground(Color.decode("#ffcfd2"));
        panel.add(radioButton3);
        
        ButtonGroup grupo=new ButtonGroup();
        grupo.add(radioButton1);
        grupo.add(radioButton2);
        grupo.add(radioButton3);
        
        
        JCheckBox box1=new JCheckBox("Ingles");
        box1.setBounds(300, 200, 120, 40);
        box1.setBackground(Color.decode("#e9d8a6"));
        panel.add(box1);
        
        JCheckBox box2=new JCheckBox("Frances");
        box2.setBackground(Color.decode("#e9d8a6"));
        box2.setBounds(300, 250, 120, 40);
        panel.add(box2);
        
        JCheckBox box3=new JCheckBox("Aleman");
        box3.setBackground(Color.decode("#e9d8a6"));
        box3.setBounds(300, 300, 120, 40);
        panel.add(box3);
        
        
    }

}
