/**
5. Bucles

10. Ejercicio

Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.

* @author Carlos Barboza

 */

public class ejercicio_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double media;
        double numero;
        double sumaNumeros = 0;
        double cantidadNumeros = 0;

        while (true){

            System.out.println("Ingrese un numero, cuando se quiera detener, ingrese un numero negativo para salir");
            numero = scanner.nextDouble();

            if (numero < 0) {

                media = sumaNumeros / cantidadNumeros;
                System.out.println("La media de los números que usted ingreso es de: " + media);
                break;

            }else {

                sumaNumeros += numero;
                cantidadNumeros ++;

            }

        }

    }
}
