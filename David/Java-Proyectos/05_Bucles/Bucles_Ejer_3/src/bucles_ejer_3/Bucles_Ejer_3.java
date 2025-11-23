package bucles_ejer_3;

/**
 * @author bones
 */


/**
 * Problema a resolver: Muestra los números múltiplos de 5 de 0 a 100 utilizando
 * un bucle do-while
 */

public class Bucles_Ejer_3 {

    public static void main(String[] args) {

        int numero = 0;

        do
        {

            if (numero % 5 == 0)
            {

                System.out.println(numero);

            }//Termina el if 

            numero++;

        } while (numero <= 100);

    }// Termina el metodo main

}// Termina la clase
