public class OperadoresAsignacion {
    public static void main(String[] args) {

        int i = 5;
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i += 2; //i = i + 2;
        System.out.println("i = " + i);

        i += 5;
        System.out.println("i = " + i);

        j -= 4;
        System.out.println("j = " + j);

        j *= 3;
        System.out.println("j = " + j);

        String sqlString = "Select * from client as c"; //Se pueden utilizar para unir o asignar Strings también
        sqlString += "where c.nombre = 'Andres' ";
        sqlString += "c activo = 1";
        System.out.println("sqlString = " + sqlString);

    }
}
