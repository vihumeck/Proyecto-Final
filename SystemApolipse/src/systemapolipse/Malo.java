package systemapolipse;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;


public class Malo extends Personaje {
    
    public Malo() {
        numeroVidas = 3;
        UbicacionImagen = "../Recursos/GOBpequeño.png";
        ImageIcon img = new ImageIcon(this.getClass().getResource(UbicacionImagen));
        Imagen = img.getImage();
        x = 200;
        y = 100;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        
        if (key == 68) {
            dx = 2;
        }
        if (key == 65) {
            dx = -2;
        }
        if (key == 87) {
            dy = -2;
        }
        if (key == 83) {
            dy = 2;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == 68) {
            dx = 0;
        }

        if (key == 65) {
            dx = 0;
        }

        if (key == 87) {
            dy = 0;
        }

        if (key == 83) {
            dy = 0;
        }
    }
    
}
