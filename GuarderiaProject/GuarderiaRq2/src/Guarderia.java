import java.util.ArrayList;

public class Guarderia {
  //Atributos
  private String nombre;
  private String direccion;
  private String nit;
  private ArrayList<Estudiante> listEstudiantes;


  //Constructor
  public Guarderia(String nombre, String direccion, String nit) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.nit = nit;
  }

  public void mostarListaEstudiantesMayores(){

  }

  public void crearEstudiante(Estudiante nuevoEstudiante){
    listEstudiantes.add(nuevoEstudiante);
  }

  public void eliminarEstudiante(String idEstudianteEliminar){

    for (int i = 0; i < listEstudiantes.size(); i++) {
      if (listEstudiantes.get(i).getIdentificacion() == idEstudianteEliminar){
        listEstudiantes.remove(i);
      }
    }

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

  public ArrayList<Estudiante> getListEstudiantes() {
    return listEstudiantes;
  }

  public void setListEstudiantes(ArrayList<Estudiante> listEstudiantes) {
    this.listEstudiantes = listEstudiantes;
  }
}
