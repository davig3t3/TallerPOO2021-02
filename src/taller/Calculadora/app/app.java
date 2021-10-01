package taller.Calculadora.app;

import taller.Calculadora.dominio.Calculadora;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class app {

    private static ImageIcon icono = new ImageIcon("C:\\Users\\zuiza\\Documents\\GitHub\\TallerPOO2021-02\\src\\taller\\Calculadora\\app\\calculadora.png");

    private static final int OPCION_SUMAR = 0;
    private static final int OPCION_RESTAR = 1;
    private static final int OPCION_MULTIPLICAR = 2;
    private static final int OPCION_DIVIDIR = 3;
    private static final int OPCION_ELIMINAR = 4;


    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora("Texas");
        JCheckBox checkBox = new JCheckBox("Redondear");

        while (true) {

            int n1= 0, n2 = 0, acumulador = 0;


            do {
                try {
                    n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el primer digito"));
                } catch (NumberFormatException E) {
                    JOptionPane.showMessageDialog(null, "ingrese un numero valido");
                }
            } while (n1 < 1);

            do {
                try {
                    n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el segundo digito"));
                } catch (NumberFormatException E) {
                    JOptionPane.showMessageDialog(null, "ingrese un numero valido");
                }
            } while (n2 < 1);


            int opcionElegida = JOptionPane.showOptionDialog(null, "Elige una de las siguientes opciones",
                    "POO", 0, 0, icono,
                    Arrays.asList("Sumar", "Restar", "Multiplicar", "Dividir", "Eliminar", checkBox).toArray(), null);


            switch (opcionElegida) {

                case OPCION_SUMAR:


                    mostrarMensaje("El resultado es: " + calculadora.sumar(n1,n2));


                    break;
                case OPCION_RESTAR:

                    mostrarMensaje("El resultado es: " + calculadora.restar(n1, n2));


                    break;
                case OPCION_MULTIPLICAR:

                    mostrarMensaje("El resultado es: " + calculadora.mul(n1, n2));


                    break;
                case OPCION_DIVIDIR:

                    mostrarMensaje("El resultado es: " + calculadora.div(n1, n2));

                    double resultado = calculadora.div(n1,n2);

                    if (checkBox.isSelected()) {
                        resultado = Math.round(resultado);
                    }

                    mostrarMensaje("El valor es: "+resultado);


                    break;
                case JOptionPane.CLOSED_OPTION:
                    return;
            }

        }

    }

    private static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "POO", JOptionPane.PLAIN_MESSAGE, icono);
    }

}


