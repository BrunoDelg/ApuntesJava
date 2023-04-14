public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2;
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = false;

        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);
        System.out.println("objBoolean3 = " + objBoolean3);

        System.out.println("Comparando 2 objetos boolean: " + (objBoolean == objBoolean2));          //Cuando se trata de la clase Wrapper Boolean, el operador ==
        System.out.println("Comparando 2 objetos boolean: " + (objBoolean.equals(objBoolean2)));     //funciona diferente que los enteros, aquí siempre evaluara
        System.out.println("Comparando 2 objetos boolean: " + (objBoolean2 == objBoolean3));         //por valor y no por la instancia.
        System.out.println("Comparando 2 objetos boolean: " + (objBoolean == objBoolean3));

        boolean primBoolean2 = objBoolean.booleanValue(); //De esta manera transformamos de objeto a primitivo.
        System.out.println("primBoolean2 = " + primBoolean2);
    }
}
