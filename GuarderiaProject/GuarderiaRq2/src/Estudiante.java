public class Estudiante {
    //Atributos
    private String nombre;
    private int edad;
    private String identificacion;
    private String genero;
    private String alergias;
    private String nombreAcudiente;
    private String numAcudiente;

    public Estudiante(String nombre, int edad, String identificacion, String genero, String alergias,
                      String nombreAcudiente, String numAcudiente) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
        this.genero = genero;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.numAcudiente = numAcudiente;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
            "nombre='" + nombre + '\'' +"\n"+
            ", edad=" + edad +"\n"+
            ", identificacion='" + identificacion + '\'' +"\n"+
            ", genero='" + genero + '\'' +"\n"+
            ", alergias='" + alergias + '\'' +"\n"+
            ", nombreAcudiente='" + nombreAcudiente + '\''+"\n" +
            ", numAcudiente='" + numAcudiente + '\'' +"\n"+
            '}';
    }

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getNombreAcudiente() {
        return nombreAcudiente;
    }

    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }

    public String getNumAcudiente() {
        return numAcudiente;
    }

    public void setNumAcudiente(String numAcudiente) {
        this.numAcudiente = numAcudiente;
    }
}
