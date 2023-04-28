import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD Samsung externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta Generación";
        productos[6] = "Bicicleta Oxford";

        int count = productos.length;
        Arrays.sort(productos);

        System.out.println("==========Usando for ============");
        for (int i = 0; i < count; i++){
            System.out.println("Para el indice " + i + " : " + productos[i]);
        }

        System.out.println("==========Usando foreach ============");
        for (String pro : productos){
            System.out.println("pro = " + pro);
        }

        //Lo mismo se puede hacer con un while o do while.

        int[] numeros = new int[4];

        int countNum = numeros.length;

        for (int i = 0; i < countNum; i++){ //de esta manera llenamos un array.
            numeros[i] = i*3;
        }

        for (int numero : numeros) {
            System.out.println("números = " + numero);
        }
    }
}
