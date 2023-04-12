import java.util.Scanner;

public class ProgramaPromedioNotasAlumno {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double nota;
        int countNotas1 = 0;
        int countNotas4 = 0;
        int countNotas5 = 0;
        double sumaNotas4 = 0;
        double sumaNotas5 = 0;
        double sumaTotal = 0;
        double promedioMenor4 = 0,promedioMayor5 = 0;

        boolean error = false;

        for (int i = 0;i < 20; i++){
            System.out.println("Ingresa una nota (entre 1-7) N°" + (i + 1));
            nota = s.nextDouble();

            if (nota == 0){
                error = true;
                break;
            }

            if (nota == 1) {
                countNotas1++;
            } else {
                if (nota > 5) {
                    countNotas5++;
                    sumaNotas5 += nota;
                } else if (nota < 4) {
                    countNotas4++;
                    sumaNotas4 += nota;
                }
            }
            sumaTotal += nota;
        }

        if (error){
            System.out.println("Error: no puede haber notas valor 0, finalizando el programa");
            System.exit(1);
        }

        System.out.println("La cantidad de notas 1 que poses son " + countNotas1);

        if (countNotas4 == 0) {
            System.out.println("No existe promedio de las notes menores a 4");
        } else{
            promedioMenor4 = sumaNotas4 / countNotas4;
            System.out.println("El promedio de la notas menores a 4 son: " + promedioMenor4);
        }

        if (countNotas5 == 0) {
            System.out.println("No existe promedio de las notes mayores a 5");
        } else{
            promedioMayor5 = sumaNotas5 / countNotas5;
            System.out.println("El promedio de la notas mayores a 5 son: " + promedioMayor5);
        }

        double promedioTotal = sumaTotal /20;

        System.out.println("El promedio de todas las notas son: " + promedioTotal);


    }
}
