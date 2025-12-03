import javax.swing.JOptionPane;

/**
 * 5. Bucles
 * 
 * 7. Ejercicio:
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * 
 * @author Bones
 * 
 */

public class Bucles_Ejer_7 {

    public static void main(String[] args) {

        int password = 4251;
        int intento = 1;
        int passwordIntento;

        do {

            passwordIntento = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "INTENTO NUMERO " + intento + "\nIntroduzca la contrasenna"));

            if (passwordIntento == password) {

                JOptionPane.showMessageDialog(null, "La caja fuerte se ha abierto satisfactoriamente");
                break;

            } else {

                JOptionPane.showMessageDialog(null, "Lo siento, esa no es la combinacion");
                intento++;

            } // Termina el if para comprobar la contraseña

        } while (intento <= 4);

        if (intento == 4) {

            JOptionPane.showMessageDialog(null,
                    "Cantidad de intentos superados, la caja se a cerrado permanentemente 🔒");
        } // Termina el if para el mensaje de despedida

    }// Termina el main

}// Termina la clase