/**
 * 5. Bucles
 * 9. Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
 * la salvedad de que el anterior estaba limitado a números de 5 dígitos como
 * máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
 * esta manera, la única limitación en el número de dígitos la establece el tipo de
 * dato que se utilice (int o long).
 *
 * @author Carlos Barboza
 */
public class ejercicio_09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int entradaUsuario;
        int numero;
        int numeroDigitos = 1;

        System.out.println("Ingrese un numero: ");
        entradaUsuario = scanner.nextInt();
        numero = entradaUsuario;

        do {
            if (entradaUsuario < 10){
                System.out.println("El numero de digitos de: " + numero + " es: " + numeroDigitos);
                break;
            }else {

                entradaUsuario /= 10;
                numeroDigitos ++;

            }
        } while (entradaUsuario >= 10);

        System.out.println("El numero digitos de: " + numero + " es: " + numeroDigitos);
    }

}
