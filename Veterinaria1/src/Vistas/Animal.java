
package Vistas;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class Animal extends JFrame implements ActionListener{

    JTextField txtNombre, txtRaza, txtColor, txtEdad;
    JButton btnAgregar;
    
    public Animal() {
        setBounds(400,100,300,500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(6, 2));
        
        txtNombre = new JTextField();
        txtRaza = new JTextField();
        txtColor = new JTextField();
        txtEdad = new JTextField();
        btnAgregar = new JButton("Agregar");
        
        add(new JLabel("Ingrese Nombre: "));
        add(txtNombre);
        add(new JLabel("Ingrese Raza: "));
        add(txtRaza);
        add(new JLabel("Ingrese Color: "));
        add(txtColor);
        add(new JLabel("Ingrese Edad: "));
        add(txtEdad);
        btnAgregar.addActionListener(this);
    }}