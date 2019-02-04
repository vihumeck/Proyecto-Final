package juego;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;

public class Personaje {

    private String UbicacionImagen;
    private Image Imagen;
    private int dx;
    private int dy;
    private int x;
    private int y;

    public Personaje() {
        UbicacionImagen = "Adelante0.png";
        ImageIcon img = new ImageIcon(this.getClass().getResource(UbicacionImagen));
        Imagen = img.getImage();
        x = 40;
        y = 60;
    }

    public void mover() {
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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImagen() {
        return Imagen;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;
        }
        if (key == KeyEvent.VK_LEFT) {
            dx = -2;
        }
        if (key == KeyEvent.VK_UP) {
            dy = -2;
        }
        if (key == KeyEvent.VK_DOWN) {
            dy = 2;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }

}
