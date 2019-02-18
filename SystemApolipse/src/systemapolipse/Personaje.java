package systemapolipse;

import java.awt.Image;
import java.awt.event.KeyEvent;

public abstract class  Personaje {

    int dx;
    int dy;
    int x;
    int y;
    String UbicacionImagen;
    Image Imagen;
    int numeroVidas = 3;
    
    public void mover(){
        if (dx > 0 && x <= 1250) {
            x += dx;
        } else if (dx < 0 && x >= 10) {
            x += dx;
        }

        if (dy > 0 && y <= 780) {
            y += dy;
        } else if (dy < 0 && y >= 10) {
            y += dy;
        }
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
