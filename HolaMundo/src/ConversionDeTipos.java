public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "89765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicStr = "true";
        boolean logicBoolean = Boolean.parseBoolean(logicStr);
        System.out.println("logicBoolean = " + logicBoolean);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt); //El valueOf nos ayuda a convertir a diferentes valores.

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 42767;
        short s = (short) i; //Esta es la manera de hacer un Cast donde puede haber perdida de información, como en este ejemplo el máximo de short es 32767
        System.out.println("s = " + s); //Al poner una cantidad más grande el resultado varía completamente.


    }
}
