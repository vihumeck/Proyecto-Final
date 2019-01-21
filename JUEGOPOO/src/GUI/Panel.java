/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author nicol
 */
public class Panel extends JPanel{
    private Image fondo;

    /**
     *
     */
    public Panel(){
        preInit();
        initComponents();      
    }
    private void preInit(){
        fondo = new ImageIcon("C:\\Users\\nicol\\OneDrive\\Escritorio\\JUEGOPOO\\src\\GUI\\Portada.png").getImage();
    } 
    @Override
    public void paint(Graphics g){
        g.drawImage(fondo,0,0,1280,914,this);
    }
    private void initComponents(){
        
    }
}
