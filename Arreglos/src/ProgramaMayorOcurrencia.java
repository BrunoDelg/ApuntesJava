import java.util.Scanner;

public class ProgramaMayorOcurrencia {
    public static void main(String[] args){

        int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        //llenando el arreglo.
        for (int i = 0; i < a.length; i++){
            System.out.print(" Ingrese 10 números del 1 al 9, número " + i + " : ");
            a[i] = s.nextInt();
            if (a[i] < 1 || a[i] > 9){
                System.err.println( "Solo se permiten números del 1 al 9,intente de nuevo");
                System.exit(1);
            }
        }

        //Creando otro arreglo.
        int[] cantidadValores = new int[10];

        //Pasando recurrencia al nuevo array.
        for (int i = 0; i < a.length; i++){
            int cantidad = 0;
            for (int j = 0; j < a.length; j++){
                if (a[i] == a[j]){
                    cantidad++;
                }
            }
            cantidadValores[i] = cantidad;
        }

        int indice = 0, max = 0;

        //obtenemos la mayor recurrencia.
        for (int i = 0; i < a.length; i++){
            if (max < cantidadValores[i]){
                max = cantidadValores[i];
                indice = i;
            }
        }

        //imprimiendo resultados.
        System.out.println("\r\nEl número de mayor ocurrencia es: " + a[indice]);
        System.out.println("Su ocurrencia es de: " + max);

    }
}
