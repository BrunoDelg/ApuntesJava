public class SinMotivo {
    public static void main(String[] args) {

        String str1 = "Hola andres";
        String str2 = new String("Hola andres");

        System.out.println(str1 == str2);//Da false
        System.out.println(str1.equals(str2));//Da true
    }
}
