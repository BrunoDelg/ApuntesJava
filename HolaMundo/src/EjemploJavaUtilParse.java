import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilParse {
    public static void main(String[] args) {

        Scanner s =  new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con el formato 'yyyy-MM-dd'");
        try {
            Date fecha = df.parse(s.next()); //Con el parse transformamos el tipo String a un tipo Date.
            System.out.println("fecha = " + fecha);
            System.out.println("df.format(fecha) = " + df.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if (fecha.after(fecha2)){         //Usando after, before o equals podemos comparar fechas.
                System.out.println("Fecha 1 (del usuario) es mayor a fecha 2 (actual) ");
            } else if (fecha.before(fecha2)){
                System.out.println("Fecha es anterior a la fecha actual");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Fecha es igual a la fecha actual");
            }
            System.out.println();

            if (fecha.compareTo(fecha2) > 0){    //CompareTo es otra manera de comparar fechas solo que nos devuelve un int.
                System.out.println("Fecha 1 (del usuario) es mayor a fecha 2 (actual) ");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha es anterior a la fecha actual");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("Fecha es igual a la fecha actual");
            }


        } catch (ParseException e) {
            //e.printStackTrace();
            System.err.println("La fecha tiene un formato incorrecto," + e.getMessage() + "El formato debe ser yyyy-MM-dd");
        }

    }
}
