
package Vistas;

import Controlador.ControladorPrincipal;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Principal extends JFrame{

    ControladorPrincipal controlador;
    JPanel p1,p2, p1Aux1, p1Aux2, p2Aux1,p2Aux2;
    JTable tabla; DefaultTableModel modelo;
    JLabel lblCantFelinos, lblCantCaninos, lblEdadPromedio;
    
    public Principal(ControladorPrincipal controlador){
        this.controlador=controlador;
        setBounds(100, 100, 500, 700);
        setTitle("Veterinaria");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        
        //instanciar
        p1=new JPanel(new BorderLayout());
        p2=new JPanel(new GridLayout(2, 1));
        p1Aux1=new JPanel();
        p1Aux2=new JPanel();
        p2Aux1=new JPanel(new GridLayout(3, 2));
        p2Aux2=new JPanel(new GridLayout(1, 2));
        modelo = new DefaultTableModel(controlador.crearArreglo(), controlador.crearEncavezado());
        tabla = new JTable(modelo);
        lblEdadPromedio= new JLabel("Edad Promedio: "+String.valueOf(controlador.edadPromedio()));
        lblCantFelinos=new JLabel("Cantidad Felinos: "+String.valueOf(controlador.contarFelinos()));
        lblCantCaninos=new JLabel("Cantidad Caninos: "+String.valueOf(controlador.contarCaninos()));
        
        //caracteristicas
        p2Aux1.setBackground(new Color(0xC1B3DE));
        p2Aux2.setBackground(Color.blue);
        
        //agregar
        add(p1);
        add(p2);
        
        p1.add(p1Aux1,BorderLayout.NORTH);
        p1.add(p1Aux2,BorderLayout.CENTER);
        
        p2.add(p2Aux1);
        p2.add(p2Aux2);
        
        p1Aux1.add(tabla.getTableHeader());
        p1Aux2.add(tabla);
        
        p2Aux1.add(lblEdadPromedio);
        p2Aux1.add(new JPanel());
        p2Aux1.add(lblCantFelinos);
        p2Aux1.add(new JButton("Actualizar"));
        p2Aux1.add(lblCantCaninos);
        p2Aux1.add(new JButton("Retirar"));
        
        p2Aux2.add(new JButton("registrar Felino"));
        p2Aux2.add(new JButton("registrar Canino"));
        
        Animal felino = new Felino();
        Animal canino = new Canino();
    }

    
    
}
