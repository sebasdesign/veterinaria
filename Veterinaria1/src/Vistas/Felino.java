
package Vistas;

import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Felino extends Animal{

    JComboBox cbxInfectado;
    
    public Felino() {
        setTitle("Registrar Felino");
        String[] opciones={"Si","No"};
        cbxInfectado=new JComboBox(opciones);
        add(new JLabel("¿Infectado?: "));
        add(cbxInfectado);
        add(btnAgregar);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(rootPane, "Hola");
    }
    
}
