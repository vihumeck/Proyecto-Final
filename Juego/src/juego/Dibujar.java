package juego;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Dibujar extends JPanel implements ActionListener  {
    
    
    private Personaje Phill;
    private Timer timer;
    private String escenario = "Abstraccion.png";
    ImageIcon imag;
    
    public Dibujar(){
        
        addKeyListener(new TAdapter());
        setFocusable(true);
        setDoubleBuffered(true);
        
        imag = new ImageIcon(this.getClass().getResource(escenario));
        
        Phill = new Personaje();
        timer = new Timer(5, this);
        timer.start(); 
    }
          
    @Override
    public void paint (Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(imag.getImage(), 0, 0, this);
        g2d.drawImage(Phill.getImagen(), Phill.getX(), Phill.getY(), this);
        
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Phill.mover();
        repaint();
    }
    
    private class TAdapter extends KeyAdapter{
        
        public void keyReleased (KeyEvent e){
            Phill.keyReleased(e);
        }
        
        public void keyPressed(KeyEvent e){
            Phill.keyPressed(e);
        }
    }
        
}
