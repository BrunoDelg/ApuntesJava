public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args){

        Object texto = "Creando un objeto de la clase String";

        Number num = Integer.valueOf(7);//7;
        // Esta es la manera de instanciar sín que sea deprecated coo en el ejemplo de abajo.
        //Integer num = new Integer(7);

        boolean b1 = texto instanceof String; //Con la instanceOf se percata que sea una instancia de cierto objeto, que estén relacionadas.
        System.out.println("texto es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo Object = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("texto es del tipo Integer = " + b1);
        /*Como vemos ya compila el código, ya que Object es el padre de las otras instancias, sín embargo nosotros guardamos un String por lo que
        * nos dara como resultado da false*/


        b1 = num instanceof Long;
        System.out.println("num es del tipo Long = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo Object = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number = " + b1);

    }
}
