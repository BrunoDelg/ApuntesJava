import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*String[] passwords = new String[2]; //Número de elementos que tendrá.
        String[] usernames = new String[2];
        usernames[0] = "bruno";
        passwords[0] = "12345";

        usernames[1] = "andres";
        passwords[1] = "12345";*/
        String[] passwords = {"bruno","andres"};
        String[] usernames = {"12345","12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su usuario");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean isAuthentic = false;

        for (int i = 0; i < usernames.length; i++){
            if (usernames[i].equals(u) && passwords[i].equals(p)){
                isAuthentic = true;
                break;
            }
        }

        if (isAuthentic){
            System.out.println("Bienvenido ".concat(u));
        }else {
            System.out.println("Usuario o contraseña incorrectos");
            System.out.println("Lo siento requiere autenticación");
        }


    }
}
