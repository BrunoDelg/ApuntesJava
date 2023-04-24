import java.io.IOException;

public class PruebaAnki {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process proceso;

        try {
            proceso = rt.exec("C:/Program Files/Anki/anki.exe");
            proceso.waitFor();
        } catch (Exception e){
            System.err.println("Comando incorrecto " + e.getMessage());
        }
        System.out.println("Se ah cerrado Anki");
        System.exit(0);
    }
}
