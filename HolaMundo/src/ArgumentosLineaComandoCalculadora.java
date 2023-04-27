public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args){

        if(args.length != 3){
            System.err.println("Por favor ingresar una operación (resta, suma, div o multi y 2 números");
            System.exit(-1);
        }

        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0.00;

        switch (operacion) {           //Recomendación del IDE, al parecer ya se puede acomodar el switch de esta manera.
            case "suma" -> resultado = a + b;
            case "resta" -> resultado = a - b;
            case "multi" -> resultado = a * b;
            case "div" -> {
                if (a == 0 || b == 0) {
                    System.out.println("No se puede dividir por cero");
                    System.exit(-1);
                }
                resultado = (double) a / b;
            }
            default -> resultado = a+b;
        }

        System.out.println("Resultado de la operación = " + resultado);
    }

    /*
    Para agregar argumentos sin usar la terminal, usando el IDE, nos vamos a la parte derecha superior, donde está seleccionado
    el archivo, y ahi nos vamos a editar configuraciones, y en la zona de argumentos, cambiamos los args, solo que cada vez
    que lo queramos cambiar hay que repetir los mimos pasos.
     */
}
