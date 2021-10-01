package taller.PruebaInterfaz;

import javax.swing.*;

public class app {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Ventana();
                frame.setSize(500,500);
                frame.setVisible(true);
            }
        });
    }
}
