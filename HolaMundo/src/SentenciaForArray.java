import javax.swing.*;

public class SentenciaForArray {
    static public void main(String[] args){

        String[] nombres = {"Andres","Pepe","Maria","Paco","Lalo","Bea","Pato","Pepa"};
        int count = nombres.length;

        for (int i = 0;i < count; i ++){
            if(nombres[i].toLowerCase().contains("Andres".toLowerCase()) || nombres[i].toLowerCase().contains("Pepa".toLowerCase())){
                continue;
            }
            System.out.println( i + " - " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre");
        boolean encontrado = false;

        for (int i = 0;i < count; i++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null,buscar + " Fue encontrado");
        }else {
            JOptionPane.showMessageDialog(null,buscar + " No esta en sistema");
        }

    }
}
