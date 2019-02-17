package systemapolipse;

import javax.swing.JFrame;

public class Ventana extends JFrame {

    public Ventana() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        add(new Escenario());
        setTitle("System Apocalipse");
        setSize(1295, 821);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}