public class EjemploMatrices {
    public static void main(String[] args){

        int[][] numeros = new int[2][4]; //De esta manera creamos las matrices, el primer corchete representará
                                         //los registros y el segundo las columnas

        //También podemos dejarlo en blanco y que tengan diferentes columnas de esta manera:
        //int[][] numeros = new int[2][];

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        numeros[1][0] = 11;
        numeros[1][1] = 12;
        numeros[1][2] = 13;
        numeros[1][3] = 14;

        System.out.println("números de filas (registros): " + numeros.length);
        System.out.println("números de columnas: " + numeros[0].length);

        System.out.println("Primer elemento de la matriz: " + numeros[0][0]);
        System.out.println("Ultimo elemento de la matriz: " + numeros[numeros.length -1][numeros[numeros.length -1].length -1]);
                                                      //También se podría: numeros[numeros.length-1][numeros[1].length-1]

        //También se pueden asignar valores:
        int num1 = numeros[0][0];
        int num2 = numeros[0][1];
        int num3 = numeros[0][2];

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);

    }
}
