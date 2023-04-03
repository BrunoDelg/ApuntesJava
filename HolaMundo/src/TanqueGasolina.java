import javax.swing.*;

public class TanqueGasolina {
    public static void main(String[] args) {

        /*Si la capacidad actual es 70 litros: imprimir Estanque lleno
        Si está entre 60 y menor a 70: imprimir Estanque casi lleno
        Si está entre 40 y menor a 60: imprimir Estanque  3/4
        Si está entre 35 y menor a 40: imprimir Medio Estanque
        Si está entre 20 y menor a 35: imprimir Suficiente
        Si está entre 1 y menor a 20: imprimir Insuficiente
         */

        double tanque = Double.parseDouble(JOptionPane.showInputDialog(null, "Hola, ingrese la cantidad de litros " +
                "de gasolina que tiene"));

        if (tanque == 70){
            JOptionPane.showMessageDialog(null,"Tanque lleno");
        } else if (tanque >= 60 && tanque < 70) {
            JOptionPane.showMessageDialog(null,"Tanque casi lleno");
        }else if (tanque >= 40 && tanque < 60){
            JOptionPane.showMessageDialog(null,"Tanque 3/4");
        } else if (tanque >= 35 && tanque < 40) {
            JOptionPane.showMessageDialog(null,"Suficiente");
        } else if (tanque >= 20 && tanque < 35) {
            JOptionPane.showMessageDialog(null,"Tanque 3/4");
        } else if (tanque >= 1 && tanque <20) {
            JOptionPane.showMessageDialog(null,"Insuficiente");
        }else {
            JOptionPane.showMessageDialog(null,"Ingrese valor valido");
        }

    }
}
