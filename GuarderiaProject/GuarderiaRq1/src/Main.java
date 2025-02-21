import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    int n = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de estudiantes que quiere registrar: "));

    for (int i = 0; i < n; i++){
      String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
      String identificacion = JOptionPane.showInputDialog("Ingrese su identificacion: ");
      int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante: "));
      String genero = JOptionPane.showInputDialog("Ingrese el genero: ");
      String alergias = JOptionPane.showInputDialog("Ingrese las alergias: ");
      String nombreAcudiente = JOptionPane.showInputDialog("Ingrese nombre del acudiente: ");
      String numeroAcudiente = JOptionPane.showInputDialog("Ingrese numero de contacto: ");

      Estudiante newEstudiante = new Estudiante(nombre,edad, identificacion,genero,alergias,nombreAcudiente,numeroAcudiente);

      listaEstudiantes.add(newEstudiante);
    }

//    //Areglos
//    int[] arregloEnteros = new int[4];
//    Estudiante[] arregloEstudiantes = new Estudiante[4];
//    int[] arregloEnterosDos = {1,2,3,4};
//
//    //Listas
//    ArrayList<String> listEjemplo = new ArrayList<>();
//    listEjemplo.add("Hola");
//    listEjemplo.remove(0);
  }
}