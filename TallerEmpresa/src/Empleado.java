public class Empleado {
    private String nombre;
    private String id;
    private String cargo;
    private int tiempoEmpresa;
    private double salario;

    public Empleado (String nombre, String id, String cargo, int tiempoEmpresa) {
        this.nombre = nombre;
        this.id = id;
        this.cargo = cargo;
        this.tiempoEmpresa = tiempoEmpresa;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", cargo='" + cargo + '\'' +
                ", tiempoEmpresa=" + tiempoEmpresa +
                ", salario=" + salario +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getTiempoEmpresa() {
        return tiempoEmpresa;
    }

    public void setTiempoEmpresa(int tiempoEmpresa) {
        this.tiempoEmpresa = tiempoEmpresa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
