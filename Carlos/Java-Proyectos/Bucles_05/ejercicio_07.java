/**
 * 5. Bucles
 *
 * 7. Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 * @author Carlos Barboza
 */
public class ejercicio_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int combinacion = 1234;
        int entradaUsuario;
        int intentos = 0;

        while (true){
            System.out.println("Ingrese la combinacion de la caja fuerte: ");
            entradaUsuario = scanner.nextInt();

            if (entradaUsuario == combinacion){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            } else {
                intentos ++;
                System.out.println("Lo siento, esa no es la combinación.\nNumero de intentos: " + intentos);
                System.out.println("Vuelvalo a intentar");
                if (intentos == 4){
                    System.out.println("A ingresado demasiadas veces la contrasenna");
                    break;
                }
            }
        }



    }
}
