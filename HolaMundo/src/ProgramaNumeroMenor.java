import java.util.Scanner;

public class ProgramaNumeroMenor {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números a ingresar");
        int cantidad = s.nextInt();

        if (cantidad < 10){
            System.out.println("Error debe comparar or lo menos 10 números");
        } else {
            int menor = Integer.MAX_VALUE;
            int numero;

            for (int i = 1; i <= cantidad; i++){
                System.out.println("Ingrese el número " + i + ": ");
                numero = s.nextInt();
                menor = (numero < menor)? numero:menor;
            }

            if (menor < 10) {
                System.out.println("El número es menor que diez!");
            }else {
                System.out.println("El número es mayor o igual a diez!");
            }
            System.out.println(" El número menor es: " + menor);
        }

    }
}
