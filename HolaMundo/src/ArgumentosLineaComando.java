public class ArgumentosLineaComando {
    public static void main(String[] args) {

        if(args.length == 0){
            System.err.println("Debe agregar argumentos o parámetros!");
            System.exit(-1);
        }

        for (int i = 0; i < args.length; i++){
            System.out.println("Argumentos n° " + i + "." + args[i]);
        }
    }

    /*
    Usando la terminal podemos establecer los argumentos, haciendo la compilación de manera manual, la cual nos genera un archivo.class
    Por ejemplo aquí para compilar en la terminal usamos (javac ArgumentosLineaComando.java) esto estando en la carpeta "src" después
    de eso, ejecutamos (java ArgumentosLineaComando "Aquí agregamos los argumentos, si son compuestos usamos: ""), igual se puede hacer la
    compilación directa desde out/production/HolaMundo, que es donde tenemos nuestros archivos.class.

    Para poder leer los caracteres especiales, al momento de hacer la compilación usamos (-encoding utf8) después del .java.
     */
}
