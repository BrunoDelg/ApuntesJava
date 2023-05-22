import java.util.Arrays;
import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {

        int[] a, pares, impares;
        int totalPares = 0, totalImpares = 0;
        a = new int[10];

        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa 10 números");
        for (int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
        }

        s.close();

        for (int j : a) {
            if (j % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        pares = new int[totalPares];
        impares = new int[totalImpares];

        int paraPar = 0;
        int paraImpar = 0;
        for (int j : a) {
            if (j % 2 == 0) {
                pares[paraPar++] = j;
            } else {
                impares[paraImpar++] = j;
            }
        }

        System.out.println("Pares");
        for (int par : pares){
            System.out.print(par + " ");
        }

        System.out.println("\r\nImpares");
        for (int impar : impares){
            System.out.print(impar + " ");
        }


    }
}
