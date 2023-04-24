public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime(); //Nos permite ejecutar aplicaciones con el método exec.
        Process proceso; //Cuando se ejecuta el programa nos devuelve un tipo proceso.

        try {
            if (System.getProperty("os.name").toLowerCase().contains("windows")){
                proceso = rt.exec("notepad");
            } else if (System.getProperty("os.name").toLowerCase().contains("mac")) {
                proceso = rt.exec("textedit");
            } else if (System.getProperty("os.name").toLowerCase().contains("linux") ||
                    System.getProperty("os.name").toLowerCase().contains("nix")){
                proceso = rt.exec("gedit");
            } else {
                proceso = rt.exec("gedit");
            }
            proceso.waitFor(); //Es para esperar hasta que cierre el programa.
        } catch(Exception e){
            System.err.println("Comando desconocido " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
