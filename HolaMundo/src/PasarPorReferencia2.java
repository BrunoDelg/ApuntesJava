class Persona{
    private String nombre;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

public class PasarPorReferencia2 {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Andres");

        System.out.println("Iniciamos el método main");

        System.out.println("persona.getNombre() = " + persona.getNombre());
        System.out.println("Antes de llamar al método test");
        test(persona);
        System.out.println("Después de llamar al método test");
        System.out.println("persona.getNombre() = " + persona.getNombre());

        System.out.println("Finaliza el método main con los datos de la persona modificados");
    }

    public static void test(Persona persona){
        System.out.println("Iniciando el método test");
        persona.setNombre("Pepe");
        System.out.println("Finalizando método test");
    }
}
