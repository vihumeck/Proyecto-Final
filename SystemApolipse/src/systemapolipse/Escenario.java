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
    private componenteGrafico player1;
    private componenteGrafico player2;
    private componenteGrafico vidap1;
    private componenteGrafico vidap2;
    private final Timer timer;
    private JButton boton;
    private Image escena;
    private TAdapter tadapter;
    private Fondo portada, fondoJuego;
    private boolean juegoActivo = false;    
    public Escenario(){
        tadapter = new TAdapter();
        boton = new JButton();
        setFocusable(true);
        setDoubleBuffered(true); 
        this.addKeyListener(tadapter);
        
        
        try {
            Image img = ImageIO.read(getClass().getResource("../Recursos/boton.png"));
            boton.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        portada = new Fondo("../Recursos/portada.png");
        fondoJuego = new Fondo("../Recursos/fondo.png");
        
        
        phill = new Phill();
        Golb = new Malo();
        player1 = new componenteGrafico("../Recursos/player1.png", 20, 20);        
        vidap1 = new componenteGrafico("../Recursos/3vidas.png", 20, 70);
        player2 = new componenteGrafico("../Recursos/player2.png", 500, 20);
        vidap2 = new componenteGrafico("../Recursos/3vidas.png",500 ,70);
        
        timer = new Timer(5, this);
        timer.start(); 
        jugandoActualizarr();
        boton.addActionListener(tadapter);
    }
    public void jugandoActualizarr(){
        if(juegoActivo){
           remove(boton);
           escena = fondoJuego.getImagen();
           if(phill.numeroVidas==1)vidap1.setImagen("../Recursos/1vida.png");
           if(phill.numeroVidas==2)vidap1.setImagen("../Recursos/2vidas.png");
           if(Golb.numeroVidas==1)vidap2.setImagen("../Recursos/1vida.png");
           if(Golb.numeroVidas==2)vidap2.setImagen("../Recursos/2vidas.png");
        }
        else{
           escena = portada.getImagen();
           add(boton);
           boton.setEnabled(true);
           boton.setVisible(true);
           
        }
    }
    @Override
    public void paint (Graphics g){
        jugandoActualizarr();
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        //g2d.drawImage(escena, 0 , 0 , this);
        if(juegoActivo){
            g2d.drawImage(escena, 0 , 0 , this);
            g2d.drawImage(phill.getImagen(), phill.getX(), phill.getY(), this);
            g2d.drawImage(Golb.getImagen(), Golb.getX(), Golb.getY(), this);
            g2d.drawImage(player1.getImagen(),player1.getPosX(),player2.getPosY(),this);
            g2d.drawImage(vidap1.getImagen(),vidap1.getPosX(),vidap1.getPosY(),this);
            g2d.drawImage(player2.getImagen(),player2.getPosX(),player2.getPosY(),this);
            g2d.drawImage(vidap2.getImagen(),vidap2.getPosX(),vidap2.getPosY(),this);
            
            
        }else{
            g2d.drawImage(escena, 0 , 0 , this);
        }
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
