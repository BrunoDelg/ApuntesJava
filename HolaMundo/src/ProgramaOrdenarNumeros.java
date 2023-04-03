import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaOrdenarNumeros {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Hola, ingrese un número");
            a = s.nextInt();

            System.out.println("Gracias, ingrese otro número");
            b = s. nextInt();
        }catch (InputMismatchException e){
            System.out.println("Solo se permiten números intenta otra vez");
            main(args);
            System.exit(0);
        }
        s.close();

        int numeroMayor = (a > b)? a : b;
        System.out.println("Tu número mayor es: " + numeroMayor);

    }
}
