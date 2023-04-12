public class SentenciaWhile {
    public static void main(String[] args){
        //A este while se le conoce como pre-evaluación ya qué primero evalúa y después ejecuta
        int i = 0;
        while(i <= 5){
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba = true;

        while (prueba){

            if (i == 7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        //Y el do while es post-prueba, primero ejecuta al menos una vez y después evalúa.

        prueba = false;
        do {
            System.out.println("Se ejecutara al menos una vez");
        } while (prueba);

        prueba = true;
        i = 0;

        do {
            if (i == 10){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;

        }while (prueba);
    }
}
