import java.util.Scanner;

public class ProgramaImprimirSilla {
    public static void main(String[] args) {

        //Obteniendo datos para la matriz.
        Scanner s = new Scanner(System.in);
        System.out.print("Ingresa el tamaño de la matriz que prefieras: ");
        int n = s.nextInt();
        if (n == 0){
            System.err.println("No se puede crear una matriz con 0 intenta de nuevo");
            System.exit(1);
        }

        //Creando matriz.
        int[][] matriz = new int[n][n];

        //Generando h e imprimiendo matriz.
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (j == 0 || i == n/2 || (j == n-1 && i >= n/2)){
                    matriz[i][j] = 1;
                }
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    /* Ejemplo del profe:

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz (n x n): ");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];

        if (n == 0) {
            System.out.println("ERROR");
            System.exit(1);
        }

        // llenamos la matriz de n x n con la figura de una silla en base al
        // numero 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if ((j == 0) || (i == n / 2 && j != 0 && j != n - 1) || (j == n - 1 && i >= n / 2)) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }

        }

        // recorremos e mostramos los elementos de la matriz para imprimir la
        // figura de una silla
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }

}
     */
}
