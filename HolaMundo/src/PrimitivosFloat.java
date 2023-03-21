public class PrimitivosFloat {
    public static void main(String[] args){

                         //El "e" es el exponencial quiere decir que e4 es igual a x10 a la 4 potencia
        float realFloat = 1.5e4f; //15000.0
        System.out.println("realFloat = " + realFloat);
        System.out.println("El float corresponde en bytes a " + Float.BYTES);
        System.out.println("El float corresponde en bits a " + Float.SIZE);
        System.out.println("Máximo valor para float " + Float.MAX_VALUE);
        System.out.println("Mínimo valor para float " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38; //Puede llevar la d o no, en si con solo el punto ya pasa a ser del tipo double
        System.out.println("realDouble = " + realDouble);
        System.out.println("El double corresponde en bytes a " + Double.BYTES);
        System.out.println("El double corresponde en bits a " + Double.SIZE);
        System.out.println("Máximo valor para double " + Double.MAX_VALUE);
        System.out.println("Mínimo valor para double " + Double.MIN_VALUE);

        var varFlotante = 3.1416;
        System.out.println("varFlotante = " + varFlotante);

    }
}
