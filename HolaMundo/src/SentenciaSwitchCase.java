public class SentenciaSwitchCase {
    public static void main(String[] args) {

        int numero = 3;
        switch(numero){

            case 1:
                System.out.println("Es el número 1");
                break;
            case 2:
                System.out.println("Es el número 2");
                break;
            case 3:
                System.out.println("Es el número 3");
                break;
            default: //El default se mostrara en caso de que ningún case se cumpla
                System.out.println("Número desconocido");
        }

        String nombre = "Juan";

        switch(nombre){
            case "Juan":
                System.out.println("Hola Juan bienvenido");
                break;
            case "Pepe":
                System.out.println("Bienvenido Juan");
                break;
            default:
                System.out.println("Usuario desconocido");
        }
    }
}
