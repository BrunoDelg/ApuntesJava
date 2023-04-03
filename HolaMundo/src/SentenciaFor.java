public class SentenciaFor {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            System.out.println("i = " + i);
        }

        for (int i = 10; i >= 0; i--){
            System.out.println("i = " + i);
        }

        for (int i = 0, j = 10; i <= j; i++, j--){ //También se pueden declarar 2 ó más variables en la sentencia for.
            System.out.println( i + " - " + j);
        }

        for (int i = 0; i < 10; i++){
            if (i % 2 == 0){
                continue; //El continue nos ayuda a saltar de la iteración sin salirse del for como en este ejemplo, pasa al siguiente ciclo.
            }
            System.out.println("i = " + i);
        }
    }
}
