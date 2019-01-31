
package Imagen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Dibujar extends JPanel implements ActionListener {
    
    draw PersonajePrincipal = new draw ();
    Timer timer = new Timer (5,this);
    
    public Dibujar(){
    
       // setBackground(Color.DARK_GRAY);
        setFocusable(true);
        addKeyListener(new teclado());
        timer.start();
}
    
    public void paint (Graphics grafica){
        
        super.paint (grafica);
        Graphics2D b = (Graphics2D)grafica;
        b.drawImage(PersonajePrincipal.tenerImagen(), PersonajePrincipal.tenerX(), PersonajePrincipal.tenerY(), null);
        
    }
    
     public void actionPerformed(ActionEvent e){
      
         PersonajePrincipal.mover();
         repaint();
    }
    
       private class teclado extends KeyAdapter{
           
           public void KeyPressed(KeyEvent e){
               
               PersonajePrincipal.keyPressed(e);
               
           }
           public void KeyReleased(KeyEvent e){
               
               PersonajePrincipal.keyReleased(e);
               
           }
           
       }
}
