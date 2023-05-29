import java.util.Scanner;

public class ProgramaArregloHistograma {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int[] a = new int[12];
        int total = a.length;
        String[] histogramaArray = new String[6];
        int totalH = histogramaArray.length;

        for (int i = 0; i < total; i++){
            System.out.print("Ingresa 12 números en un rango de 1 a 6, número " + i + ": ");
            a[i] = s.nextInt();
        }

        for (int i = 0; i < totalH; i++){
            int aux = i +1;
            String histograma = aux + ": ";
            for (int k : a) {
                if (aux == k) {
                    histograma += "*";
                }
            }
            histogramaArray[i] = histograma;
        }

        for ( String histo : histogramaArray ){
            System.out.println(histo);
        }

    }
}
