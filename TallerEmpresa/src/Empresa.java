public class Empresa {
    private String nit;
    private String nombre;
    private Empleado[] listEmpleados;

    public Empresa(String nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
        listEmpleados = new Empleado[50];
    }

    public Empleado[] buscarEmpleadosSalarioAlto() {
        Empleado[] empleadosSinNulos = encontrarListaEmpleadosSinNulos(listEmpleados);
        if (empleadosSinNulos.length == 0) {
            return new Empleado[0];
        }

        for (int i = 0; i < empleadosSinNulos.length; i++) {
            for (int j = i; j < empleadosSinNulos.length; j++) {
                if (empleadosSinNulos[i].getSalario() < empleadosSinNulos[j].getSalario()) {
                    Empleado empleadoAux = empleadosSinNulos[i];
                    empleadosSinNulos[i] = empleadosSinNulos[j];
                    empleadosSinNulos[j] = empleadoAux;
                }
            }

        }

        return empleadosSinNulos;
    }

    private Empleado[] encontrarListaEmpleadosSinNulos(Empleado[] empleados) {
        int count = 0;
        for (int i = 0; i < listEmpleados.length; i++) {
            if (listEmpleados[i] != null) {
                count++;
            }
        }

        Empleado[] empleadosValidos = new Empleado[count];
        int index = 0;
        for (int i = 0; i < listEmpleados.length; i++) {
            if (listEmpleados[i] != null) {
                empleadosValidos[index++] = listEmpleados[i];
            }
        }

        return empleadosValidos;
    }

    public boolean eliminarEmpleado(String idEliminar) {
        int indiceEmpleado = buscarEmpleadID(idEliminar);

        if (indiceEmpleado != -1) {
            listEmpleados[indiceEmpleado] = null;
            return true;
        }
        return false;
    }

    public boolean actualizarEmpleado(String idBuscar, Empleado empleadoActualizado) {
        int indiceEmpleado = buscarEmpleadID(idBuscar);

        if (indiceEmpleado != -1) {
            listEmpleados[indiceEmpleado] = empleadoActualizado;
            return true;
        }
        return false;
    }

    public int buscarEmpleadID(String idBuscar) {
        for (int i = 0; i < listEmpleados.length; i++) {
            if (listEmpleados[i] != null && listEmpleados[i].getId().equals(idBuscar)) {
                return i;
            }
        }
        return -1;
    }

    public boolean crearEmpleado(Empleado newEmpleado) {
        int indice = encontrarPosicionValida();

        if (verificarIdEmpleado(newEmpleado.getId()) && indice != -1) {
            newEmpleado.setSalario(asignarSalarioEmpleado(newEmpleado));
            listEmpleados[indice] = newEmpleado;
            return true;
        }
        return false;
    }

    public int encontrarPosicionValida() {
        for (int i = 0; i < listEmpleados.length; i++) {
            if (listEmpleados[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public boolean verificarIdEmpleado(String idEmpleado) {
        for (int i = 0; i < listEmpleados.length; i++) {
            if (listEmpleados[i] != null && listEmpleados[i].getId().equals(idEmpleado)) {
                return false;
            }
        }
        return true;
    }

    public double asignarSalarioEmpleado(Empleado empleado) {
        double salarioCargo = 0;
        switch (empleado.getCargo().toLowerCase()) {
            case "gerente":
                salarioCargo += 3000000;
                break;
            case "ingeniero":
                salarioCargo += 4000000;
                break;
            case "desarrollador ":
                salarioCargo += 2000000;
                break;
            default:
                salarioCargo += 1000000;
                break;
        }


        return salarioCargo;
    }

    public Empleado[] getListEmpleados() {
        return listEmpleados;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nit='" + nit + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
