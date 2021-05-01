package Vistas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Canino extends Animal{
    
    JTextField txtNivelEntrenamiento;
   
    public Canino() {
        setTitle("Registra Caninos");
        txtNivelEntrenamiento=new JTextField();
        add(new JLabel("Nivel Entrenamiento"));
        add(txtNivelEntrenamiento);
        add(btnAgregar);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(rootPane, "Chao");
    }
}
