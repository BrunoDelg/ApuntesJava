import java.util.Scanner;

public class EjemploArreglosNumMayor {
    public static void main(String[] args) {

        int[] a = new int[5];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa 5 números enteros");
        for (int i = 0; i < a.length; i ++){
            a[i] = s.nextInt();
        }
        s.close();

        int max = 0;
        for (int i = 1; i < a.length; i++){
            max = (a[max] > a[i])? max:i; //Aquí max solo esta guardando el número de indice.
        }
        System.out.println("max = " + a[max]);
    }
}
