import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //El scanner nos permite leer la consola, y el system in es el parámetro que recibe.
        System.out.println("Ingrese un número");
        //String numeroStr = scanner.nextLine();  //nextLine() nos ayuda a escanear la linea actual que el usuario ingresa.
        int numeroDecimal = 0;

        try{
            numeroDecimal = scanner.nextInt();//El nextInt nos da directamente un entero //Integer.parseInt(numeroStr); <- Nos auyda a cambiar a entero el String
        }catch(InputMismatchException e){
            System.out.println("Error, debe introducir solo números");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);
        String resultadoBinario = "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        System.out.println(mensaje);;
    }
}
