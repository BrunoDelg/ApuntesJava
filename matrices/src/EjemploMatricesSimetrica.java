public class EjemploMatricesSimetrica {
    public static void main(String[] args){

        boolean simetrica = true;

        int[][] matriz = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7}
        };

        /* Esta es una manera de ver si la matriz es simétrica, se die que es simétrica si la matriz original es igual
        que la matriz transpuesta, ósea si la columna 1 es igual a a la fila 1, la columna 2 igual a la 2 etc.
        La diagonal superior deber ser igual a la inferior.

        int i, j;
        i = 0;
        while (i < matriz.length && simetrica == true){
            j = 0;
            while (j < i && simetrica == true){
                if (matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                }
                j++;
            }
            i++;
        }
        */

        //También se puede con for y usando etiquetas:

        salir: for (int i = 0; i < matriz.length; i++){

            for (int j = 0; j < i; j++){
                if (matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                    break salir;
                }
            }

        }

        if (simetrica){
            System.out.println("La matriz es simétrica");
        } else {
            System.out.println("La matriz no es simétrica");
        }
    }
}
