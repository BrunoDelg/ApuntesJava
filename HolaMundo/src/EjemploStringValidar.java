public class EjemploStringValidar {

    public static void main( String[] args){

        String curso = null;

        boolean esNulo = curso == null;

        if(esNulo){
            curso = " "; //"Programación Java";
        }

        boolean esVacio = curso.length() == 0; //Con el punto length verificamos la cantidad de caracteres que posee
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esVacio3 = curso.isBlank(); //isBlank verifica que no sea null, ademas de que no sea un espacio vacío esta de la JDK 11 en adelante
        System.out.println("esVacio3 = " + esVacio3);

        if(!esVacio3){  //Esta es para verificar que no sea un espacio          // if(!esVacio){ Esta es para que no este sin valor
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));

        }
    }
}
