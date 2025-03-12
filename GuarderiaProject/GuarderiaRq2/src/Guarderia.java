import java.util.ArrayList;

public class Guarderia {
  //Atributos
  private String nombre;
  private String direccion;
  private String nit;
  private Estudiante[] listEstudiantes;


  //Constructor
  public Guarderia(String nombre, String direccion, String nit, int cupoLimite) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.nit = nit;
    this.listEstudiantes = new Estudiante[cupoLimite];
  }

  public void mostarListaEstudiantesMayores(){

  }

  public boolean crearEstudiante(Estudiante nuevoEstudiante){

    int posicionEncontrada = encontrarPosicionValida();
    if(posicionEncontrada != -1){
      listEstudiantes[posicionEncontrada] = nuevoEstudiante;
      return true;
    }else{
      return false;
    }
  }

  public int encontrarPosicionValida(){
    for (int i = 0; i < listEstudiantes.length; i++){
      if (listEstudiantes[i] == null){
        return i;
      }
    }
    return -1;
  }

  public void eliminarEstudiante(String idEstudianteEliminar){


  }

  public void modificarEstudiante(String idEstudianteBuscar, Estudiante estudianteModificado){

  }

  public void mostrarListaEstudiantes(){

  }

  //Getter y Setter
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getNit() {
    return nit;
  }

  public void setNit(String nit) {
    this.nit = nit;
  }

  public Estudiante[] getListEstudiantes() {
    return listEstudiantes;
  }

  public void setListEstudiantes(Estudiante[] listEstudiantes) {
    this.listEstudiantes = listEstudiantes;
  }
}
