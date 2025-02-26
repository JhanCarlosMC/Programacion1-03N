import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    int n = 4;
    int[] arregloEdades = new int[n];

    for(int i = 0; i< arregloEdades.length; i++){
      arregloEdades[i] = (int) (Math.random()*10);
    }

    String mensaje = "";

    for(int i = 0; i< arregloEdades.length; i++) {
      mensaje += arregloEdades[i] + " ";
    }

    JOptionPane.showMessageDialog(null, mensaje);
  }
}