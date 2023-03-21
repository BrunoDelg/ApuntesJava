public class PrimitivosCaracteres {
    public static void main(String[] args) {

        char character = '\u0040'; //Se usan comillas simples
        char decimal = 64;

        System.out.println("character = " + character);
        System.out.println("decimal = " + decimal);
        System.out.println("character + decimal = " + (character == decimal));

        char simbolo = '@';

        System.out.println("El char corresponde en bytes a " + Character.BYTES);
        System.out.println("El char corresponde en bits a " + Character.SIZE);
        System.out.println("Máximo valor de char es " + Character.MAX_VALUE);
        System.out.println("Mínimo valor de char es " + Character.MIN_VALUE);

        char espacio = '\u0020'; // es igual a ' ';
        char retroceso = '\b'; //Este es el de retroceso o eliminar, el backspace.
        char tabulador = '\t'; //Este es un espacio pero de tabulación, más grande.
        char nuevaLinea = '\n'; //Es un nuevo espacio de línea.
        char retornoCarro = '\r'; //Este elimina lo que tiene detrás aunque se suele usar en conjunto de la /n en windows.

        /*Cualquiera de estos caracteres especiales también se pueden escribir directo en el texto. Estos caracteres
        Pueden cambiar dependiendo el sistema operativo.*/


    }
}
