import java.util.Scanner;

public class ProgramaSistemaEstadisticoArreglo {
    public static void main(String[] args){

        int[] a = new int[7];

        //Variable auxiliares.
        int cantidad0 = 0;
        int cantidadPositivos = 0;
        int sumaPositivos = 0;
        int cantidadNegativos = 0;
        int sumaNegativos = 0;
        int promedioPositivos = 0;
        int promedioNegativos = 0;

        Scanner s = new Scanner(System.in);

        //llenando array.
        for (int i = 0; i < a.length; i++){
            System.out.print("Ingresa 7 números, " + (i+1) + " : ");
            a[i] = s.nextInt();
        }
        s.close();

        //Verificando cantidades.
        for ( int i : a){
            if (i == 0){
                cantidad0++;
            } else if (i >= 1) {
                cantidadPositivos++;
                sumaPositivos += i;
            } else if (i <= -1){
                cantidadNegativos++;
                sumaNegativos += i;
            }
        }

        //Calculando promedios e imprimiendo resultados.
        if (cantidadPositivos == 0){
            System.out.println("\r\nNo hubo números positivos");
        } else {
            promedioPositivos = sumaPositivos / cantidadPositivos;
            System.out.println("El promedio de los positivos es: " + promedioPositivos);
        }

        if (cantidadNegativos == 0){
            System.out.println("No hubo números negativos");
        } else {
            promedioNegativos = sumaNegativos/cantidadNegativos;
            System.out.println("El promedio de los negativos es: " + promedioNegativos);
        }

        if (cantidad0 == 0){
            System.out.println("No hubo ningún 0");
        } else {
            System.out.println("El número de 0 es: " + cantidad0);
        }

    }
}
