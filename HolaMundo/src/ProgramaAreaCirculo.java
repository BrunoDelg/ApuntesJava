import java.util.Scanner;

public class ProgramaAreaCirculo {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo para calcular su area");
        double radio = s.nextDouble();

        s.close();

        double area = Math.PI * Math.pow(radio,2);
        System.out.println("area = " + area);

    }
}
