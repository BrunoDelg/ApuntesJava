import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja {

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

    public static void sortBurbuja(Object[] arreglo){

        int contador = 0;
        int count = arreglo.length;

        //Ordenamiento burbuja optimizado.
        for(int i = 0; i < count -1; i++){ //Agregamos él -1 porque ya al final no es importante la última iteración.

            for (int j = 0; j < count-1-i; j++){ //Agregamos él -1 ya que colocamos j+1, por lo que se puede desbordar
                //y agregamos él -i porque conforme vamos iterando, los últimos espacios
                //van quedando ordenados.
                if ( ((Comparable) arreglo[j+1]).compareTo(arreglo[j]) < 0){ //Aquí comparamos pares de elementos.
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1]; //Cambiamos la posición de j+1 a j.
                    arreglo[j+1] = auxiliar; //Y cambiamos j a j+1
                }
                contador++;
            }
        }

        System.out.println("contador = " + contador);
    }
    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB","Samsung Galaxy","Disco duro SSD Samsung externo","Asus Notebook",
                "Macbook Air","Chromecast 4ta Generación","Bicicleta Oxford"};
        int count = productos.length;

        /*
        for(int i = 0; i < count; i++){         //Este es un ejemplo del algoritmo del ordenamiento burbuja, que usamos para ordenar
            for (int j = 0; j < count; j++){    //El arreglo en orden alfabético.
                if (productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador++;
            }
        }
        */

        sortBurbuja(productos);

        System.out.println("==========Usando for ============");
        for (int i = 0; i < count; i++){
            System.out.println("Para el indice " + i + " : " + productos[i]);
        }

        Integer[] numeros = new Integer[4];

        numeros[0] = 1;
        numeros[1] = 10;
        numeros[2] = 300;
        numeros[3] = 35;

        sortBurbuja(numeros);

        for (int i = 0; i < numeros.length; i++){
            System.out.println("i = " + i + " : " + numeros[i]);
        }
    }
}
