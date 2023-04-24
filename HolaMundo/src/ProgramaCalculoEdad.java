import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramaCalculoEdad {
    public static void main(String[] args) throws ParseException {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa tu fecha de nacimiento con el formato 'yyyy-MM-dd'");
        String fechaStr = s.next();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNacimiento = df.parse(fechaStr);
        Date fecha = new Date();

        df = new SimpleDateFormat("yyyyMMdd");

        int desde = Integer.parseInt(df.format(fechaNacimiento));
        int hasta = Integer.parseInt(df.format(fecha));

        int edad = (hasta - desde) / 10000;
        System.out.println("La edad es = " + edad);


    }
}
