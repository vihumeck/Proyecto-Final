/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.Image;
import java.awt.event.KeyEvent;

/**
 *
 * @author Kevin Garcia
 */
public abstract class Personaje {
    
    int dx;
    int dy;
    int x;
    int y;
    Image Imagen;
    
    public void mover(){
        
    }
    
    abstract public void keyPressed(KeyEvent e);
    
    abstract public void keyReleased(KeyEvent e);
            
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImagen() {
        return Imagen;
    }
}
