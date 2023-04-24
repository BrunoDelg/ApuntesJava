import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {

        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("Line.separator");
        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator:" + lineSeparator2 + "Una nueva Linea...");

        /*Esta es la manera de ir recabando las propiedades del sistema usando getProperty y utilizando la palabra key como la de los ejemplos
        en esta página están las demás https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html también podemos sacar todas las propiedades
        como veremos a continuación:
         */

        Properties p = System.getProperties();
        p.list(System.out); //De esta manera listamos las propiedades.

    }
}
