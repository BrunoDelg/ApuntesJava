public class EjemploString {
    public static void main(String[] args) {

        String curso1 = "Programación Java";
        String curso2 = new String("Programación Java");

        boolean esIgual = curso1 == curso2;
        System.out.println("curso1 == curso2 = " + esIgual);

        esIgual = curso1.equals(curso2);
        System.out.println("curso1.equals(curso2) = " + esIgual);

        String curso3 = "Programación Java";            //En esta los compara igual, ya que si generamos String directamente con la literal, si detecta un valor igual
        esIgual = curso1 == curso3;                     //Para optimizar solo copiara la misma referencia.
        System.out.println("curso1 == curso3 = " + curso3);

    }
}
