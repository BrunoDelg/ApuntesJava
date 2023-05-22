import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;

        for(int i = 0; i< total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--; //Este nos ayudará a que justo a la mitad, sea el punto de inflexion y se termine.
        }
    }
    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB","Samsung Galaxy","Disco duro SSD Samsung externo","Asus Notebook",
                "Macbook Air","Chromecast 4ta Generación","Bicicleta Oxford"};
        int count = productos.length;

        Arrays.sort(productos);
        //arregloInverso(productos);

        Collections.reverse(Arrays.asList(productos)); //Usando la colección de java podemos invertirlo sin tener que hacerlo manual

        System.out.println("==========Usando for ============");
        for (int i = 0; i < count; i++){
            System.out.println("Para el indice " + i + " : " + productos[i]);
        }
    }
}
