import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args){

        Calendar calendario = Calendar.getInstance(); //Calendar es una clase abstracta por lo cual no se puede instancear.

        //calendario.set(2023,0,25,18,10,10); //Así establecemos la fecha que queramos recordando que en mes comienza desde 0.

        calendario.set(Calendar.YEAR, 2023);                 //Pero también podemos asignar los valores por partes como en el ejemplo.
        calendario.set(Calendar.MONTH,Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);

        //calendario.set(Calendar.HOUR_OF_DAY, 21); //Este es para formato en 24 horas.
        calendario.set(Calendar.HOUR, 7); //Este es formato de 12 horas
        calendario.set(Calendar.AM_PM, Calendar.PM); //Así decidimos si es pm o am.
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha = calendario.getTime(); //Y asi asignamos el calendario a la fecha
        System.out.println("fecha sin formato = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a"); //SSS es para milisegundos y la "a" al último es para agregar pm o am ademas
        String fechaDf = df.format(fecha);                       //Si dejamos la HH es en formato de 24 horas y hh es de 12 horas.
        System.out.println("fecha con formato = " + fechaDf);
    }
}
