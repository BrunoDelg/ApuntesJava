public class EjemploStringInmutable {
    public static void main(String[] args) {

        String curso = "Programación Java";
        String profesor = "Andrés Guzman";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        String resultado2 = curso.transform(c -> {
           return c + " con " + profesor;
        });

        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        String resultado3 = resultado.replace("a","A"); //El replace nos sirve para remplazar caracteres

        System.out.println("resultado = " + resultado); //Como vemos resultado no se modifica por que es inmutable.
        System.out.println("resultado3 = " + resultado3);

    }
}
