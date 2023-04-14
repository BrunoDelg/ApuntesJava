public class PasarPorValor {

    public static void main(String[] args) {

        int i = 10;
        System.out.println("Iniciamos con el método main i = " + i);
        test(i);
        System.out.println("Final del método main i = " + i);
    }

    public static void test(int i){
        System.out.println("Iniciamos el método test i = " + i);
        i = 35;
        System.out.println("Final del método test i = " + i);
    }
}
