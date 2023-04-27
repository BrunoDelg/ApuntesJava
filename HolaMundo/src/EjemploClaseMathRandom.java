import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args){

        String[] colores = {"blanco", "azul", "amarillo", "rojo", "verde", "negro"};
        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length;

        random = Math.floor(random);

        System.out.println("colores = " + colores[(int)random]);

        Random randomObj = new Random(); //Asi instanciamos la clase random la cual nos da mas libertad de generación de números random.
        //int randomInt = randomObj.nextInt(); //El next es para generar el número aleatorio.
        //int randomInt = randomObj.nextInt(25); //De esta manera nos generará un número entre 0 y 25, sin incluir el 25.
        int randomInt = 15 + randomObj.nextInt(25 - 15); //Y así nos imprimirá un número entre 15 y 25.
        System.out.println("randomInt = " + randomInt);

        //Una manera de generar los colores pero ahora con la clase seria:

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}
