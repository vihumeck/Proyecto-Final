package systemapolipse;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Phill extends Personaje {

    int cont = 0;
    Image[] ataque = {new ImageIcon(getClass().getResource("../Recursos/ataque1.png")).getImage(),
        new ImageIcon(getClass().getResource("../Recursos/ataque2.png")).getImage(),
        new ImageIcon(getClass().getResource("../Recursos/ataque3.png")).getImage(),
        new ImageIcon(getClass().getResource("../Recursos/ataque4.png")).getImage()};
    Image[][] imagenes = {{new ImageIcon(getClass().getResource("../Recursos/posicion00.png")).getImage(),
            new ImageIcon(getClass().getResource("../Recursos/posicion01.png")).getImage(),
            new ImageIcon(getClass().getResource("../Recursos/posicion02.png")).getImage(),
            new ImageIcon(getClass().getResource("../Recursos/posicion03.png")).getImage()
        },
        {new ImageIcon(getClass().getResource("../Recursos/posicion04.png")).getImage(),
            new ImageIcon(getClass().getResource("../Recursos/posicion05.png")).getImage(),
            new ImageIcon(getClass().getResource("../Recursos/posicion06.png")).getImage(),
            new ImageIcon(getClass().getResource("../Recursos/posicion07.png")).getImage()
        },
        {new ImageIcon(getClass().getResource("../Recursos/posicion08.png")).getImage(),
            new ImageIcon(getClass().getResource("../Recursos/posicion09.png")).getImage(),
            new ImageIcon(getClass().getResource("../Recursos/posicion10.png")).getImage(),
            new ImageIcon(getClass().getResource("../Recursos/posicion11.png")).getImage()
        },
        {new ImageIcon(getClass().getResource("../Recursos/posicion12.png")).getImage(),
            new ImageIcon(getClass().getResource("../Recursos/posicion13.png")).getImage(),
            new ImageIcon(getClass().getResource("../Recursos/posicion14.png")).getImage(),
            new ImageIcon(getClass().getResource("../Recursos/posicion15.png")).getImage(),}
        };

    public Phill() {
        numeroVidas = 3;
        x = 40;
        y = 60;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;
            cont++;
            cont = cont % 4;
            Imagen = imagenes[2][cont];
        }
        
        if (key == KeyEvent.VK_LEFT) {
            dx = -2;
            cont++;
            cont = cont % 4;
            Imagen = imagenes[1][cont];
        }
        if (key == KeyEvent.VK_UP) {
            dy = -2;
            cont++;
            cont = cont % 4;
            Imagen = imagenes[3][cont];
        }
        if (key == KeyEvent.VK_DOWN) {
            dy = 2;
            cont++;
            cont = cont % 4;
            Imagen = imagenes[0][cont];
        }
        
    }

    @Override
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
                if(key == KeyEvent.VK_SPACE){
            for(int i=0; i<4; i++){
                Imagen = ataque[i];
            }   
        }

    }
    public void keyTyped(KeyEvent e){
        
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_SPACE){
            for(int i=0; i<4; i++){
                Imagen = ataque[i];
            }   
        }
    }

}
