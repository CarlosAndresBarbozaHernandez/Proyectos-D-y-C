public class ejercicio_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Ingrese el valor del " + (i + 1) + "º numero");
            numeros[i] = scanner.nextInt();

        }

        //sacar maximo y minimo del arreglo

        int maximo = 0;
        int minimo = numeros[0];

        for (int i = 0; i < numeros.length; i++) {

            if (maximo < numeros[i]){

                maximo = numeros[i];

            }

            if(minimo > numeros[i]){

                minimo = numeros[i];

            }

        }

        System.out.println();

        //System.out.println("Maximo: " + maximo);
        //System.out.println("Minimo: " + minimo);

        System.out.println();

        for (int i = 0; i < numeros.length; i++) {

            System.out.print(numeros[i] + " ");

            if(numeros[i] == minimo){

                System.out.print("minimo ");

            }
            if (numeros[i] == maximo){

                System.out.print("maximo");

            }

            System.out.println();

        }

    }
}
