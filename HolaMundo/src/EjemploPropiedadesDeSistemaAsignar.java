import java.io.FileInputStream;
import java.util.Properties;

public class EjemploPropiedadesDeSistemaAsignar {
    public static void main(String[] args){

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties"); //Este mos va ayudar a leer el archivo y convertirlo a bytes

            Properties p = new Properties(System.getProperties()); //Aquí cargamos el objeto Properties con las propiedades de sistema.
            p.load(archivo); //cargamos la configuración.

            p.setProperty("mi.propiedad.personalizada","Mi valor guardados en el objeto properties"); //De esta manera también guardamos propiedades
                                                                                                       //sin necesitar el archivo properties.
            System.setProperties(p); //Actualizamos la información.

            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada")); //Podemos obtener uno por uno las propiedades.
            System.out.println("System.getProperty(\"config.puerto.servidor\") = " + System.getProperty("config.puerto.servidor"));

            System.out.println();
            ps.list(System.out);

        } catch (Exception e){
            System.err.println("La ruta de archivo es incorrecta");
        }
    }
}
