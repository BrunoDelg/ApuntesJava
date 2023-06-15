import java.util.Scanner;

public class ProgramaImprimirX {
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
        String[][] matriz = new String[n][n];

        //Generando la X
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (i == j || i + j == n-1){
                    matriz[i][j] = "X";
                } else {
                    matriz[i][j] = "_";
                }
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /* Resolución del profe

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el tamaño de la matriz (n x n): ");
            int n = scanner.nextInt();

            if (n == 0) {
                System.out.println("ERROR");
                System.exit(1);
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    if (i == j || (j == n - i - 1)) {
                        System.out.print("X");
                    } else {
                        System.out.print("_");
                    }
                }
                System.out.println();
            }
        }

         */
}
