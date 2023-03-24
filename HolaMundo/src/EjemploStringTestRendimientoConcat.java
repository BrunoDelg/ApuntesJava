public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a); //A diferencia del String este si es modificable.

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 10000 ; i++){
           // c = c.concat(a).concat(b).concat("\n"); // 500 => 15 ms, 1000 => 112 ms, 10000 => 455 ms  //Mas objetos se guardan en memoria.
           // c += a + b + "\n"; //500 => 118 ms, 1000 => 121 ms, 10000 => 253 ms
            sb.append(a).append(b).append("\n"); //500 => 1 ms, 1000 => 1 ms, 10000 => 12 ms
            //append es la manera de concatenar en StringBuilder
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

    }
}
