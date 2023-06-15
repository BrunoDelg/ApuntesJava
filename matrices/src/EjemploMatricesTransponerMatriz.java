public class EjemploMatricesTransponerMatriz {
    public static void main(String[] args) {

        int[][] a, b;
        a = new int[8][4]; //Como vamos a pasar la transpuesta a b, necesitan estar volteados.
        b = new int[4][8];

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                a[i][j] = i+j*3;
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        //Llenando la matriz b
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                b[j][i] = a[i][j];
            }
        }

        System.out.println("La matriz transpuesta b: ");
        for (int[] filas : b){
            for (int num : filas){
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
