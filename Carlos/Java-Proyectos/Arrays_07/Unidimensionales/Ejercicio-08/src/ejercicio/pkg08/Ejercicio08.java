package ejercicio.pkg08;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        
        int[] tempMeses = new int[12];
        
        String[] meses = new String[12];
        
        meses[0] = "Enero";
        meses[1] = "Febrero";
        meses[2] = "Marzo";
        meses[3] = "Abril";
        meses[4] = "Mayo";
        meses[5] = "Junio";
        meses[6] = "Julio";
        meses[7] = "Agosto";
        meses[8] = "Septiembre";
        meses[9] = "Octubre";
        meses[10] = "Noviembre";
        meses[11] = "Diciembre";
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < meses.length; i++) {
            
            System.out.println("Cual fue la temperatura promedio en el mes " + meses[i]);
            tempMeses[i] = scanner.nextInt();
            
        }
        
        
    }

}
