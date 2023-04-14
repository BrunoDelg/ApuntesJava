import java.util.Date;

public class EjemploJavaUtilDateGetTime {
    public static void main(String[] args){

        Date fecha = new Date();

        int j = 0;
        for (int i = 0; i < 1000000;i++){
            j += i;
        }
        System.out.println("j = " + j);
        
        Date fecha2 = new Date();

        long tiempoFinal = fecha2.getTime() - fecha.getTime(); //El getTime nos da el tiempo transcurrido en milisegundos desde 1970 hasta la fecha.
        System.out.println("El tiempo transcurrido en el for es de = " + tiempoFinal);
    }
}
