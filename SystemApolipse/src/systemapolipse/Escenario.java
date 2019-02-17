package systemapolipse;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Toolkit;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Escenario extends JPanel implements ActionListener{

    private final Phill phill;
    private final Malo Golb;    
    private final Timer timer;
    private JButton boton;
    private Image escena;
    private TAdapter tadapter;
    private Fondo fondo1, fondo2;
    private boolean juegoActivo = false;
    public Escenario(){
        tadapter = new TAdapter();
        boton = new JButton();
        try {
            Image img = ImageIO.read(getClass().getResource("../Recursos/boton.png"));
            boton.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }    
        //boton.setBounds(1200, 50, 300, 300);
        fondo1 = new Fondo("../Recursos/portada.png");
        fondo2 = new Fondo("../Recursos/fondo.png");
        setFocusable(true);
        setDoubleBuffered(true); 
        addKeyListener(tadapter);
        phill = new Phill();
        Golb = new Malo();
        timer = new Timer(5, this);
        timer.start(); 
        jugando();
        boton.addActionListener(tadapter);
    }
    public void jugando(){
        if(juegoActivo){
           remove(boton);
           escena = fondo1.getImagen();           
        }else{
           escena = fondo2.getImagen();
           add(boton);
           boton.setEnabled(true);
           boton.setVisible(true);
           
        }
    }
    @Override
    public void paint (Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        //g2d.drawImage(escena, 0 , 0 , this);
        if(juegoActivo){
            g2d.drawImage(escena, 0 , 0 , this);
            g2d.drawImage(phill.getImagen(), phill.getX(), phill.getY(), this);
            g2d.drawImage(Golb.getImagen(), Golb.getX(), Golb.getY(), this);
        }//else debería mostrar la pantalla de inicio
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        phill.mover();
        Golb.mover();
        colision();
        repaint();
    }
    
    public void colision(){
        if(phill.getX()>= Golb.getX()-50 && phill.getX()<= Golb.getX()+50){
            if(phill.getY()>= Golb.getY()-60 && phill.getY()<= Golb.getY()+60){
                System.out.println("Se tocaron los personajes");
            }
        }
    }    
    private class TAdapter extends KeyAdapter implements ActionListener{
        
        @Override
        public void keyReleased (KeyEvent e){
            phill.keyReleased(e);
            Golb.keyReleased(e);
        }
        
        @Override
        public void keyPressed(KeyEvent e){
            phill.keyPressed(e);
            Golb.keyPressed(e);
        }
        public void actionPerformed(ActionEvent e) {
            juegoActivo = true;
        }
    }
}
