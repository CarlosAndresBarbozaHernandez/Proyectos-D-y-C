import java.util.Scanner;

public class ejercicio_06 {

    public static void main(String[] args) {

        int[] numero = new int[15];
        int[] sustituto = new int[15];

        Scanner scanner = new Scanner(System.in);
                
        //for para que el usuario llene el arreglo
        for (int i = 0; i < numero.length; i++) {

            System.out.println("Digite el valor de la posicion " + i + ": ");
            numero[i] = scanner.nextInt();

        }
        
        int x = 1;
        
        //pasar el ultimo numero del arreglo "numero" a la primera posicion del arreglo "sustituto"
        sustituto[0] = numero.length;
        
        //for para recorrer el arreglo
        for (int i = 0; i < numero.length; i++) {
            
            //si x es menor que el tamanno de "numero", entonces.....
            if (x < numero.length) {
                
                
                //se iguala "sustituto" con "numero" para queden pero adelantado una posicion
                sustituto[x] = numero[i];
                
                x++;
                
            }
            
        }        
        
        //se muestra el arreglo "sustituto"
        for (int i = 0; i < sustituto.length; i++) {
            
            System.out.println("\n" + sustituto[i]);
            
        }        
                
    }

}
