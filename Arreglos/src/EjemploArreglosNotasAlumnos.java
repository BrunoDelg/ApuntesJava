import java.util.Scanner;

public class EjemploArreglosNotasAlumnos {
    public static void main(String[] args){

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumaMate = 0, sumaHist = 0, sumaLen = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 7 calificaciones para matemáticas");
        for (int i = 0; i < claseMatematicas.length; i++){
            claseMatematicas[i] = s.nextDouble();
        }

        System.out.println("Ingrese 7 calificaciones para historia");
        for (int i = 0; i < claseHistoria.length; i++){
            claseHistoria[i] = s.nextDouble();
        }

        System.out.println("Ingrese 7 calificaciones para lenguaje");
        for (int i = 0; i < claseLenguaje.length; i++){
            claseLenguaje[i] = s.nextDouble();
        }

        for (int i = 0; i < 7; i++){
            sumaMate += claseMatematicas[i];
            sumaHist += claseHistoria[i];
            sumaLen += claseLenguaje[i];
        }

        double promedioMate = (sumaMate/claseMatematicas.length);
        double promedioH = (sumaHist/claseHistoria.length);
        double promedioL = (sumaLen/claseLenguaje.length);

        System.out.println("El promedio de matemáticas es = " + promedioMate);
        System.out.println("El promedio de historia es = " + promedioH);
        System.out.println("El promedio de lenguaje es = " + promedioL);

        System.out.println("Ingrese el id de algún alumno (0 - 6)");
        int id = s.nextInt();
        double promedioAlumno = (claseLenguaje[id] + claseHistoria[id] + claseMatematicas[id])/3;
        System.out.println("promedioAlumno = " + promedioAlumno);




    }
}
