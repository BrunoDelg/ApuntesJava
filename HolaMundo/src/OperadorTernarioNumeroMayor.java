import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args){

        int max = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1 = s.nextInt();

        System.out.println("Ingrese el segundo número");
        int num2 = s.nextInt();

        System.out.println("Ingrese el tercer número");
        int num3 = s.nextInt();

        max = (num1 > num2)? num1 : num2;
        max = (max > num2)? max : num2;

        System.out.println("max = " + max);

    }
}
