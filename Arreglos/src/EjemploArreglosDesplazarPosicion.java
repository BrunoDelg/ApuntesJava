import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {

        int[] a = new int[10];
        int ultimo;

        Scanner s = new Scanner(System.in);
        for (int i = 0;i < a.length; i++){
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }
        ultimo = a[a.length -1];

        for (int i = a.length -2; i >= 0; i--){
            a[i+1] = a[i];
        }
        a[0] = ultimo;

        System.out.println("\r\nEl arreglo:");
        for (int num : a){
            System.out.println("num = " + num);
        }
    }
}
