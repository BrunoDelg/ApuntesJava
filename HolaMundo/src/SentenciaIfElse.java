public class SentenciaIfElse {
    public static void main(String[] args){

        float promedio = 6.3f;

        if(promedio >= 6.5){
            System.out.println("Felicidades, excelente promedio");
        } else if (promedio >= 6.0){
            System.out.println("Muy buen promedio");
        } else if (promedio >= 5.5) {
            System.out.println("Necesitas esforzarte un poco más");
        } else if (promedio >= 5) {
            System.out.println("Insuficiente, necesitas estudiar más!");
        } else {
            System.out.println("Reprobado");
        }

    }
}
