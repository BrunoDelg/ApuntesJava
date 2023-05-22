import java.util.Scanner;

public class ProgramaOrdenarArreglo {
    public static void main(String[] args){

        int[] a = new int[10];
        int max = a.length;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < max; i++){
            System.out.print("Ingresa un número: ");
            a[i] = s.nextInt();
        }
        s.close();

        for (int i = 0; i < max/2; i++){
            System.out.print("\r\n" + a[i] + " --- " + a[max -i -1] );
        }

    }
}
