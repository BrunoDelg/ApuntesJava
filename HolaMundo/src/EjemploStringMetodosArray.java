public class EjemploStringMetodosArray {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;

        for (int i = 0; i < largo; i++){
            System.out.println(arreglo[i]);
        }
        //Separador
        System.out.println();

        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a"); //El split va a separar de acuerdo al patron en este caso "a", y convierte los elementos en un array.
        int l = arreglo2.length;
        for (int j = 0; j < l; j++){
            System.out.println(arreglo2[j]);
        }
        //Separador
        System.out.println();

        String archivo = "alguna.imagen.jpg";
        String[] archivoArr = archivo.split("\\."); // [.] Se deben usar \\ ó [] porque el punto es una palabra reservada de expresiones regulares.
        l = archivoArr.length;
        for (int i=0; i < l; i++){
            System.out.println(archivoArr[i]);
        }
        System.out.println("Extensión = " + archivoArr[l-1]);


    }
}
