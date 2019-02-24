package systemapolipse;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Phill extends Personaje {
    
    Image[][] ataque = {{new ImageIcon(getClass().getResource("../Phill/Ataque0.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/Ataque1.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/Ataque2.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/Ataque3.png")).getImage()
        },
        {new ImageIcon(getClass().getResource("../Phill/Ataque4.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/Ataque5.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/Ataque6.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/Ataque7.png")).getImage()
        },
        {new ImageIcon(getClass().getResource("../Phill/Ataque8.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/Ataque9.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/Ataque10.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/Ataque11.png")).getImage()
        },
        {new ImageIcon(getClass().getResource("../Phill/Ataque12.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/Ataque13.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/Ataque14.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/Ataque15.png")).getImage(),}
        };
    
    Image[][] imagenes = {{new ImageIcon(getClass().getResource("../Phill/posicion0.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/posicion1.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/posicion2.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/posicion3.png")).getImage()
        },
        {new ImageIcon(getClass().getResource("../Phill/posicion4.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/posicion5.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/posicion6.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/posicion7.png")).getImage()
        },
        {new ImageIcon(getClass().getResource("../Phill/posicion8.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/posicion9.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/posicion10.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/posicion11.png")).getImage()
        },
        {new ImageIcon(getClass().getResource("../Phill/posicion12.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/posicion13.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/posicion14.png")).getImage(),
            new ImageIcon(getClass().getResource("../Phill/posicion15.png")).getImage(),}
        };
    

    public Phill() {
        x = 250;
        y = 410;   
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
                if(key == KeyEvent.VK_ENTER){
            /*for(int i=0; i<4; i++){
                Imagen = ataque[i];
            }*/   
        }

    }
    public void keyTyped(KeyEvent e){
        
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_SPACE){
           /* for(int i=0; i<4; i++){
                Imagen = ataque[i];
            }   */
        }
    }

    private void getImage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
