/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import javax.swing.JButton;
/**
 *
 * @author nicol
 */
public class Boton extends JButton{
    Dimension dimensionBoton = new Dimension(300,300);
    public Boton(){
        this.setVisible(true);
        this.setPreferredSize(dimensionBoton);
        this.setLayout(null);
        this.setMaximumSize(dimensionBoton);
        this.setMinimumSize(dimensionBoton);
        
    }
    
}
