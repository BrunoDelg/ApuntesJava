public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle1: //Estas son las etiquetas, nos ayudan a identificar los for, para en caso de estar anidados no confundirnos.
        for (int i = 0; i < 5; i++){

            System.out.println();
            for (int j = 0; j < 5; j++){
                if (i == 2){
                    continue bucle1; //La etiqueta la podemos usar de esta manera también en el break.
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }

        System.out.println("\n===========================================================================================");

        etiqueta:
        for(int i = 0; i < 5; i++){

            System.out.println();
            for (int j = 0; j < 5; j++){
                if (i == 2){
                    break etiqueta;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }
    }
}
