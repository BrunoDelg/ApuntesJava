import java.nio.file.Path;
import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("variables de entorno en el sistema = " + varEnv); //De esta manera imprimimos todas las variables de entorno.

        String username = System.getenv("USERNAME"); //Y así imprimimos una en especifico.
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        String path2 = varEnv.get("Path");//También lo podemos obtener por medio del objeto Map, solo que tiene que ser específica la key.
        System.out.println("path2 = " + path2);

        System.out.println("---------------listando variables de entorno del sistema---------------");
        for (String key: varEnv.keySet()) {
            System.out.println(key + " => " + varEnv.get(key));
        }
    }
}
