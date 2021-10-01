package taller.PruebaInterfaz;

import javax.swing.*;

public class Ventana extends JFrame{
    private JPanel panel1;
    private JTextField txtUsuario;
    private JPasswordField txtPassword;
    private JButton ingresarButton;
    private JButton salirButton;

    public Ventana(){
        super("EJEMPLO");
        setContentPane(panel1);
    }
}
