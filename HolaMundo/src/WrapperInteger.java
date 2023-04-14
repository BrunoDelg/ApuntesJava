public class WrapperInteger {
    public static void main(String[] args){

        int intPrimitivo = 32768;
        Integer intObject = Integer.valueOf(intPrimitivo); //Esta es la manera de convertir un primitivo a un objeto.
        Integer intObject2 = intPrimitivo; //Esta es otra manera pero es Autoboxing.
        System.out.println("intObject2 = " + intObject2);

        int num = intObject; //De esta manera implícita pasamos un objeto a primitivo. autoboxing
        System.out.println("num = " + num);
        int num2 = intObject.intValue(); //Así lo hacemos pero de manera explícita.
        System.out.println("num2 = " + num2);

        String valorTvLcd = "6700";
        Integer valor = Integer.valueOf(valorTvLcd); //Así podemos convertir un String en Integer
        System.out.println("valor = " + valor);

        Short shortObjeto = intObject.shortValue(); //Asi podemos cambiar a diferentes valores
        System.out.println("shortObjeto = " + shortObjeto);//Aunque no olvidemos que la información será ambigua por la diferencia de tamaños en bytes y short

        Byte byteObjeto = intObject.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

    }
}
