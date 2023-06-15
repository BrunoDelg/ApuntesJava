public class EjemploMatricesBuscar {
    public static void main(String[] args){

        int[][] matrizDeEnteros = {
                {35, 90, 3, 1978},
                {15, 2020, 75, 48},
                {238, 76, 201, 26},
                {100, 89, 25, 160}
        };

        int elementoBuscar = 15;
        boolean encontrado = false;
        int i;
        int j = 0;
        buscar: for (i = 0; i < matrizDeEnteros.length; i++){
            for (j = 0; j < matrizDeEnteros[i].length; j++){
                if (elementoBuscar == matrizDeEnteros[i][j]){
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if (encontrado){
            System.out.println("Encontrado " + elementoBuscar + " en las coordenadas " + i + "," + j);
        } else {
            System.out.println("No encontrado");
        }

    }
}
