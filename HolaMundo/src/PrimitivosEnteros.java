public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bits a " + Byte.SIZE);
        System.out.println("valor máximo de un byte " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo short corresponde en bits a " + Short.SIZE);
        System.out.println("valor máximo de un short " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bits a " + Integer.SIZE);
        System.out.println("valor máximo de un int " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo long corresponde en bits a " + Long.SIZE);
        System.out.println("valor máximo de un long " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long " + Long.MIN_VALUE);

        var numeroVar = 9223372036854775807L;
        //Como vemos también se puede realizar con var, dependiendo el valor que designemos ira
        //cambiando el tipo de variable que es

    }
}
