import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola, bienvenido, ingrese el nombre de su factura");
        String nombreFactura = scanner.nextLine();

        System.out.println("Ingrese el precio del primer producto");
        double precio1 = scanner.nextDouble();

        System.out.println("Ingrese el precio del segundo producto");
        double precio2 = scanner.nextDouble();

        double precioTotal = precio1 + precio2;
        double impuesto = precioTotal * 0.19;
        double precioFinal = precioTotal + impuesto;

        System.out.println("La factura " + nombreFactura + " tiene un total bruto de " + precioTotal + "$, con un impuesto de " + impuesto + "$ y el monto" +
                " después de impuestos es de " + precioFinal + "$");

    }
}
