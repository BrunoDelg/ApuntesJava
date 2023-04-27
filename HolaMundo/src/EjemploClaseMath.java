public class EjemploClaseMath {
    public static void main(String[] args){

        int absoluto = Math.abs(-3); //Este método nos ayuda a sacra el valor absoluto.
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5,1.2); //Este nos da el número mayor entre 2 valores.
        System.out.println("max = " + max);

        double min = Math.min(3.5,1.2); //Este nos da el valor mínimo.
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5); //Este redondea hacia arriba.
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5); //Y este redondea hacia abajo.
        System.out.println("piso = " + piso);

        long entero = Math.round(Math.PI); //Este nos ayuda a redondear, si es >= 5 será hacia arriba de lo contrario hacia abajo.
        System.out.println("entero = " + entero);

        double exp = Math.exp(1);
        System.out.println("exp = " + exp); //Este nos imprime la función exponencial de x.

        double log = Math.log(10); //Nos ayuda a  sacar el logaritmo natural de cierto número.
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3); //Es para sacra la potencia el ultimo valor, es el exponente.
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5); //Nos ayuda a sacar la raíz cuadrada.
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57); //Convertir de radianes a grados.
        System.out.println("radianes a grados = " + grados);

        double radianes = Math.toRadians(90.00); //Convertir de grados a radianes.
        System.out.println("grados a radianes = " + radianes);

        System.out.println("sin(90) = " + Math.sin(radianes)); //Es para sacar el seno, solo recibe radianes.
        System.out.println("cos(90) = " + Math.cos(radianes)); //Es para sacar el coseno, solo radianes.



    }
}
