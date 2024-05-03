import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        Random random = new Random();

        for (int i = 0; i < numero.length; i++) {

            int numeroAleatorio = random.nextInt(101);

            numero[i] = numeroAleatorio;

        }

        for (int i = 0; i < cuadrado.length; i++) {

            cuadrado[i] = (int) Math.pow(numero[i], 2);

        }

        for (int i = 0; i < cubo.length; i++) {

            cubo[i] = (int) Math.pow(numero[i], 3);

        }

        System.out.println(" Numero " + " Cuadrado " + " Cubo ");

        for (int i = 0; i < 20; i++) {

            System.out.print(numero[i]+ "\t\t" + " " + cuadrado[i]+ "\t\t" + " " + cubo[i]+ "\t\t" + "\n");
            
        }

    }
}