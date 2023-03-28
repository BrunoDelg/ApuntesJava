import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j; //Al ser las variables del mismo tipo se pueden declarar en la misma linea

        System.out.println("suma = " + suma);
        System.out.println("(i + j) = " + (i + j)); //Aquí es importante los paréntesis para cambiar la precedencia, ya que si no lo toma como String
                                                    //ya que está iniciando con un String.

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (i - j)); //Aquí igual se ocupa él () a que el string no reconoce "-" como operador.

        int multi = i * j;
        System.out.println("multiplicación = " + multi);

        int div = i / j;
        float div2 = (float )i / j; //Se hace un cast ya qué i y j son integer.
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        int resto = i % j; //El resto o moduló es lo que nos da la resta de la division que se realizó.
        System.out.println("resto = " + resto);

        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        if(numero % 2 == 0){
            System.out.println("Número par " + numero);
        }else {
            System.out.println("Número impar " + numero);
        }

    }
}
