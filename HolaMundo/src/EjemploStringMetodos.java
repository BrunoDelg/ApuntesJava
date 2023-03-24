public class EjemploStringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Bruno";
        System.out.println("nombre = " + nombre);

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Bruno\") = " + nombre.equals("Bruno"));
        System.out.println("nombre.equals(\"bruno\") = " + nombre.equals("bruno"));
        System.out.println("nombre.equalsIgnoreCase(\"bruno\") = " + nombre.equalsIgnoreCase("bruno"));
        System.out.println("nombre.compareTo(\"Bruno\") = " + nombre.compareTo("Bruno")); //Esta comparación es a nivel del orden alfabético, pero del lexico-gráfico en referencia
        System.out.println("nombre.compareTo(\"Braulio\") = " + nombre.compareTo("Braulio"));//de la tabla unicode.
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); //Esta es la manera de obtener un carácter usando índice contando desde 0.
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1)); //Esta es una manera de obtener el último carácter.
        System.out.println("nombre.substring(1) = " + nombre.substring(1)); //Indicando desde donde se inicia.
        System.out.println("nombre.substring(1,3) = " + nombre.substring(1,3)); //Marcando de donde hasta donde.
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));//Obteniendo los 2 últimos caracteres.

        String trabalenguas = "trabalenguas";

        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); //Puede recibir carácter o String.
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf(\"lenguas\") = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas")); //Solo recibe String, y devuelve true o false.
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas")); //retorna true o false.
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim()); //Elimina los espacios en blanco al inicio y al final.

        
    }
}
