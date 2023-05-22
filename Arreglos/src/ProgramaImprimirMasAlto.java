import java.util.Scanner;

public class ProgramaImprimirMasAlto {
    public static void main(String[] args){

        int[] a = new int[7];

        Scanner s = new Scanner(System.in);

        //Ingresando datos al arreglo.
        for (int i = 0; i < a.length; i++){
            System.out.print("Ingresa un número entre 11 y 99: ");
            a[i] = s.nextInt();
        }
        s.close();

        int numeroMayor = 0;

        //recorriendo el arreglo.
        for (int i : a) {
            if (i <= 10 || i >= 100){ //Verificando el rango
                System.out.println("\r\nSolo se aceptan rangos de 11 a 99 vuelve a intentar");
                main(args);
                System.exit(0);
            }
            //Obteniendo el número mayor.
            numeroMayor = Math.max(numeroMayor, i);
        }

        System.out.println("\r\nEl número mayor es: " + numeroMayor);
    }
}
