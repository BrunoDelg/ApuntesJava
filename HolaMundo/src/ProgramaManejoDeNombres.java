import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        //Resolución mia

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola bienvenido, ingrese el primer nombre:");
        String nombre1 = scanner.nextLine();

        System.out.println("Ingrese el segundo nombre:");
        String nombre2 = scanner.nextLine();

        System.out.println("Ingrese el tercer nombre:");
        String nombre3 = scanner.nextLine();

        char variable1 = nombre1.toUpperCase().charAt(1);
        String variableNueva1 = variable1 + "." + nombre1.substring(nombre1.length()-2);

        char variable2 = nombre2.toUpperCase().charAt(1);
        String variableNueva2 = variable2 + "." + nombre2.substring(nombre2.length()-2);

        char variable3 = nombre3.toUpperCase().charAt(1);
        String variableNueva3 = variable3 + "." + nombre3.substring(nombre3.length()-2);

        String mensaje = variableNueva1 + "_" + variableNueva2 + "_" + variableNueva3;
        System.out.println(mensaje);

        //Resolución del profesor

        System.out.println("Ingrese un nombre de un familiar:");
        String nombreA = scanner.nextLine();
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreB = scanner.nextLine();
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreC = scanner.nextLine();
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

        String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;

        System.out.println(resultado);

        /*En conclusión se puede omitir código, ya que al hacer la concatenación en el mismo lugar ya no es tipo char si no
        que ya pasa directamente a ser tipo String ahorrando variables. */

    }
}
