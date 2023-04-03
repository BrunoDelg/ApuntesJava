import javax.swing.*;

public class ProgramaNombreMasLargo {
    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog("Ingresa el primer nombre de un familiar ó amigo");
        String b = JOptionPane.showInputDialog("Ingresa un segundo nombre de un familiar ó amigo");
        String c = JOptionPane.showInputDialog("Ingresa un segundo nombre de un familiar ó amigo");

        String[] nombre1 = a.split(" ");
        String[] nombre2 = b.split(" ");
        String[] nombre3 = c.split(" ");

        a = nombre1[0];
        b = nombre2[0];
        c = nombre3[0];

        String resultado = (a.length() > b.length())? a:b;
        resultado = (resultado.length() > c.length())? resultado:c;

        System.out.println("El Familiar con el nombre más largo es " + resultado);

        /* Esta es la forma de resolverlo del profesor
        String persona1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona2 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona3 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");

        String max = (persona1.split(" ")[0].length() < persona2.split(" ")[0].length()) ? persona2 : persona1;
        max = (persona3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: persona3;

        System.out.println("La persona con el nombre más largo es " + max);

        //Como vemos en la respuesta del profesor se puede comprimir la respuesta usando personal.split(" ")[0].length() en lugar
        //de hacerlo separado
         */
    }
}
