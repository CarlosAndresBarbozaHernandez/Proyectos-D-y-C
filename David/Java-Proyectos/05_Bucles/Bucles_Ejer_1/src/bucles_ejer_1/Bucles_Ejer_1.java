
package bucles_ejer_1;

/**
 * @author bones
 */

/**
 * Problema a resolver: 
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 * 
*/

public class Bucles_Ejer_1 {

    public static void main(String[] args) {
        
        for (int i = 0; i <= 100; i++)
        {
            
            if (i %5 == 0){
                
                System.out.println(i);
                
            }// Termina el if 

        }// Termina el for
        
    }// Termina el metodo main
    
}// Termina la clase