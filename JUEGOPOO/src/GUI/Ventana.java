package GUI;

import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.*;


public class Ventana extends JFrame{
    
    JFrame ventana;
    Panel panelPrincipal;
    Dimension dimension = new Dimension(1280,914);
    Boton botonInicio;
    public Ventana(){
        ventana = new JFrame();
        panelPrincipal= new Panel();
        botonInicio = new Boton();
        panelPrincipal.setVisible(true);
        ventana.setLayout(new CardLayout());
        ventana.setVisible(true);
        ventana.setSize(dimension);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ventana.getContentPane().setLayout(null);
        ventana.getContentPane().add(panelPrincipal);
        ventana.getContentPane().add(botonInicio);
    }
}
