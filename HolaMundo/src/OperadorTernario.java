import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        String variable = 7 == 7 ? "si es verdadero":"no es verdadero";
        System.out.println("variable = " + variable);


        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese las notas de Matemáticas: ");
        matematicas = s.nextDouble();

        System.out.println("Ingrese las notas de Ciencias: ");
        ciencias = s.nextDouble();

        System.out.println("Ingrese las notas de Historia: ");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia)/3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.5 ? "Aprobado":"Reprobado";
        System.out.println("estado = " + estado);


    }
}
