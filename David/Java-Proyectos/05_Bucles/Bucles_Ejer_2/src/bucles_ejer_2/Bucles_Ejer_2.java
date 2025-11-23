package bucles_ejer_2;

/**
 * @author bones
 */

/**
 * Problema a resolver:
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while
 */

public class Bucles_Ejer_2 {
    
    public static void main(String[] args) {
        
        int numero = 0;
        
        while (numero <= 100)
        {            
            
            if (numero % 5 == 0)
            {
                
                System.out.println(numero);
                
            }// Termina el if
            
            numero++;
            
        }// Termina el while
        
    }// Termina el metodo main
    
}// Termina la clase