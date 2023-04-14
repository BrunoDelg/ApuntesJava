public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? :" + (num1 == num2)); //Particularidad es que si comparamos valores hasta 127, comparará
                                                                      //Por valor y no por instancia ya qué por debajo usa el método valueOf().
        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? :" + (num1 == num2));

        System.out.println("¿Tienen el mismo valor? :" + (num1.equals(num2))); //Usamos equals para evaluar los valores de los objetos
        System.out.println("¿Tienen el mismo valor? :" + (num1.intValue() == num2.intValue())); //A menos que sean menores a 127

        num2 = 500;

        boolean condicion = num1 > num2;        //Cuando se trata de <,>,<=,>=, se ejecuta Auto-unboxing, ósea pasa de referencia a primitivo en automático
        System.out.println("condición = " + condicion);       //aunque también se puede hacer explícitamente como está abajo.

        boolean condicion2 = num1.intValue() > num2.intValue();
        System.out.println("condición2 = " + condicion2);
    }
}
