package systemapolipse;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;


public class Steve extends Personaje {
    
    Image[][] ataqueShiny = {{new ImageIcon(getClass().getResource("../Steve/AtaqueShiny0.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/AtaqueShiny1.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/AtaqueShiny2.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/AtaqueShiny3.png")).getImage()
        },
        {new ImageIcon(getClass().getResource("../Steve/AtaqueShiny4.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/AtaqueShiny5.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/AtaqueShiny6.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/AtaqueShiny7.png")).getImage()
        },
        {new ImageIcon(getClass().getResource("../Steve/AtaqueShiny8.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/AtaqueShiny9.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/AtaqueShiny10.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/AtaqueShiny11.png")).getImage()
        },
        {new ImageIcon(getClass().getResource("../Steve/AtaqueShiny12.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/AtaqueShiny13.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/AtaqueShiny14.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/AtaqueShiny15.png")).getImage(),}
        };
    
    Image[][] imagenesShiny = {{new ImageIcon(getClass().getResource("../Steve/MovimientoShiny0.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/MovimientoShiny1.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/MovimientoShiny2.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/MovimientoShiny3.png")).getImage()
        },
        {new ImageIcon(getClass().getResource("../Steve/MovimientoShiny4.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/MovimientoShiny5.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/MovimientoShiny6.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/MovimientoShiny7.png")).getImage()
        },
        {new ImageIcon(getClass().getResource("../Steve/MovimientoShiny8.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/MovimientoShiny9.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/MovimientoShiny10.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/MovimientoShiny11.png")).getImage()
        },
        {new ImageIcon(getClass().getResource("../Steve/MovimientoShiny12.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/MovimientoShiny13.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/MovimientoShiny14.png")).getImage(),
            new ImageIcon(getClass().getResource("../Steve/MovimientoShiny15.png")).getImage(),}
        };
    
    public Steve() {
        x = 1000;
        y = 410;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        
        if (key == 68) {
            dx = 2;
            cont++;
            cont = cont % 4;
            Imagen = imagenesShiny[2][cont];
        }
        if (key == 65) {
            dx = -2;
            cont++;
            cont = cont % 4;
            Imagen = imagenesShiny[1][cont];
        }
        if (key == 87) {
            dy = -2;
            cont++;
            cont = cont % 4;
            Imagen = imagenesShiny[3][cont];
        }
        if (key == 83) {
            dy = 2;
            cont++;
            cont = cont % 4;
            Imagen = imagenesShiny[0][cont];
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
