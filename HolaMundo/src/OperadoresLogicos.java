public class OperadoresLogicos {
    public static void main(String[] args) {

        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        boolean b1 = i == j && k < l && m == false; //Significa AND.
        System.out.println("b1 = " + b1);

        boolean b2 = i == j || k < l; //Significa OR.
        System.out.println("b2 = " + b2);

        boolean b3 = i == j && k < l || m == false; //Siempre se lee de derecha a izquierda la precedencia. Pero siempre tendrá prioridad el AND
        System.out.println("b3 = " + b3);

        boolean b4 = i == j && (k < l || m == false); //Al menos que se usen paréntesis como en este caso.
        System.out.println("b4 = " + b4);

        boolean b5 = i == j || k < l && m == false; //Aquí como vemos primo tomara en cuenta el && antes del ||.
        System.out.println("b5 = " + b5);

        /*Siempre será importante usar los paréntesis para de esta manera no confundirnos al usar operadores lógicos. */

        boolean b6 = true || false && false || false; //true
        System.out.println("b6 = " + b6);

        boolean b7 = ((true || false) && false) || false; //false
        System.out.println("b7 = " + b7);



    }
}
