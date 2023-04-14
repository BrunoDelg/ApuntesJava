import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args){

        Date fecha = new Date();  //Así creamos la instancia de Date

        System.out.println("fecha = " + fecha);

        /*Podemos darle formato si no nos gusta como lo da en automático de la siguiente manera el SimpleDateFormat*/
        SimpleDateFormat df = new SimpleDateFormat("dd-MMMM-yyyy"); //Aquí agregamos el formato que deseemos, recordemos que mes es con mayúscula, 2M son
        String fechaStr = df.format(fecha);                               //para el número del mes, 3M para el nombre corto y 4M para el nombre completo.

        System.out.println("fechaStr = " + fechaStr);

        /*Esta es la documentación de SimpleFormatDate para ver los patrones y el significado de cada una de las letras:
        https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/SimpleDateFormat.html
         */

    }
}
