/**
 * 5. Bucles
 * 8. Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Carlos Barboza
 */
public class ejercicio_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entradaUsuario;
        System.out.println("Escriba el numero de la tabla de multiplicar");
        entradaUsuario = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(entradaUsuario + " x " + i + " = " + (entradaUsuario * i));
        }
    }
}
