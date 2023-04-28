import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        //String[] productos = new String[7];

        String[] productos = {"Kingston Pendrive 64GB","Samsung Galaxy","Disco duro SSD Samsung externo","Asus Notebook",
                "Macbook Air","Chromecast 4ta Generación","Bicicleta Oxford"};
        int count = productos.length;
        /**
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD Samsung externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta Generación";
        productos[6] = "Bicicleta Oxford";
        */
        Arrays.sort(productos);

        System.out.println("==========Usando for ============");
        for (int i = 0; i < count; i++){
            System.out.println("Para el indice " + i + " : " + productos[i]);
        }

        System.out.println("==========Usando for inverso ============");
        for (int i = 0; i < count; i++){
            System.out.println("para i = " + (count-1-i) + " valor: " + productos[count-1-i]);
        }
        System.out.println("==========Usando for inverso2 ============");
        for (int i = count-1; i >= 0; i--){
            System.out.println("para i = " + i + " valor: " + productos[i]);
        }
    }
}
