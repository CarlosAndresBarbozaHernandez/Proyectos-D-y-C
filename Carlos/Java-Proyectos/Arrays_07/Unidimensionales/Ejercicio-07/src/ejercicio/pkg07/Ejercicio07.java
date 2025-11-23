package ejercicio.pkg07;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio07 {

    public static void main(String[] args) {
        
        int[] array1 = new int[100];
        
        Random random = new Random();
        
        //for para rellenar el arreglos con numeros aleatorios del 0 al 20
        for (int i = 0; i < array1.length; i++) {
            
            array1[i] = random.nextInt(21);
            
        }
        
        //convertir el array1 en String para poder imprimir el numero deseado entre comillas
        String[] array2 = new String[array1.length];
        for (int i = 0; i < array1.length; i++) {
            
            array2[i] = String.valueOf(array1[i]);
            
        }
        
        //for para mostrar el array1 separado por espacios
        for (int i = 0; i < array1.length; i++) {
            
            System.out.print(" " + array1[i]);
            
        }
        
        System.out.println();
        
        //pedir al usuario que ingrese dos numeros por teclado
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite el primer numero");
        String num1 = scanner.next();
        
        System.out.println("Digite el segundo numero");
        String num2 = scanner.next();
        
        scanner.close();
        
        //for para sustituir los valores de num1 por num2 en el array1
        for (int i = 0; i < array2.length; i++) {
            
            if (num1 == null ? array2[i] == null : num1.equals(array2[i])) {
                
                array2[i] = ("\"" + num2 + "\"");
                
            }
            
            
        }
        
        //for para imprimir el array2 ya con los cambios
        for (int i = 0; i < array2.length; i++) {
            
            System.out.print(" " + array2[i]);
            
        }
        
        
        
    }
    
}
