public class OperadoresIncrementales {
    public static void main(String[] args){

        //Pre-incremento
        int i = 1;
        int j = ++i; //Primero se incrementa y después asigna un valor.
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        //Post-incremento
        i = 2;
        j = i++; //Primero se asigna valor y luego se realiza el aumento.
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Pre-decremento
        i = 3;
        j = --i;
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        //Post-decremento
        i = 4;
        j = i++;
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + j);

    }
}
