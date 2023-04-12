import java.util.Scanner;

public class ProgramaMultiplicarSinSimbolo {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el primer número a multiplicar");
        int numero1 = s.nextInt();

        System.out.println("Ingrese el segundo número a multiplicar");
        int numero2 = s.nextInt();
        int resultado = 0;

        boolean positivo1 = numero1 > -1;
        boolean positivo2 = numero2 > -1;

        int cantidadAbsoluta = positivo1? numero1: -numero1;

        for (int i = 0; i < cantidadAbsoluta; i++){
            resultado += numero2;
        }

        if (!positivo1 && !positivo2 || !positivo1){
            resultado = -resultado;
        }

        System.out.println("El resultado de tu multiplicación es " + resultado);


    }
}
