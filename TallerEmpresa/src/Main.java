import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("123456789", "Tech Solutions");
        cargarDatos(empresa);

        String[] opciones = {
                "Crear empleado",
                "Eliminar empleado",
                "Actualizar empleado",
                "Buscar empleados con salario alto",
                "Listar empleados",
                "Salir"
        };

        while (true) {
            String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione una opción:",
                    "Menú Empresa",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            if (opcionSeleccionada == null || opcionSeleccionada.equals("Salir")) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                break;
            }

            switch (opcionSeleccionada) {
                case "Crear empleado":
                    crearEmpleado(empresa);
                    break;
                case "Eliminar empleado":
                    eliminarEmpleado(empresa);
                    break;
                case "Actualizar empleado":
                    actualizarEmpleado(empresa);
                    break;
                case "Buscar empleados con salario alto":
                    buscarEmpleadosSalarioAlto(empresa);
                    break;
                case "Listar empleados":
                    listarEmpleados(empresa);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida, intente de nuevo.");
            }
        }
    }

    private static void crearEmpleado(Empresa empresa) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        String id = JOptionPane.showInputDialog("Ingrese el ID del empleado:");
        String cargo = JOptionPane.showInputDialog("Ingrese el cargo del empleado:");
        int tiempoEmpresa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo en la empresa (en años):"));

        Empleado nuevoEmpleado = new Empleado(nombre, id, cargo, tiempoEmpresa);

        if (empresa.crearEmpleado(nuevoEmpleado)) {
            JOptionPane.showMessageDialog(null, "Empleado creado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Error: No se pudo crear el empleado (ID duplicado o sin espacio disponible).");
        }
    }

    private static void eliminarEmpleado(Empresa empresa) {
        String id = JOptionPane.showInputDialog("Ingrese el ID del empleado a eliminar:");

        if (empresa.eliminarEmpleado(id)) {
            JOptionPane.showMessageDialog(null, "Empleado eliminado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Error: No se encontró un empleado con ese ID.");
        }
    }

    private static void actualizarEmpleado(Empresa empresa) {
        String id = JOptionPane.showInputDialog("Ingrese el ID del empleado a actualizar:");

        String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del empleado:");
        String cargo = JOptionPane.showInputDialog("Ingrese el nuevo cargo del empleado:");
        int tiempoEmpresa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo tiempo en la empresa (en años):"));

        Empleado empleadoActualizado = new Empleado(nombre, id, cargo, tiempoEmpresa);

        if (empresa.actualizarEmpleado(id, empleadoActualizado)) {
            JOptionPane.showMessageDialog(null, "Empleado actualizado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Error: No se encontró un empleado con ese ID.");
        }
    }

    private static void buscarEmpleadosSalarioAlto(Empresa empresa) {
        Empleado[] empleadosSalarioAlto = empresa.buscarEmpleadosSalarioAlto();

        if (empleadosSalarioAlto.length == 0) {
            JOptionPane.showMessageDialog(null, "No hay empleados con salario registrado.");
            return;
        }

        StringBuilder resultado = new StringBuilder("Empleados con salario más alto:\n");
        for (Empleado emp : empleadosSalarioAlto) {
            resultado.append(emp).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    private static void listarEmpleados(Empresa empresa) {
        Empleado[] listaEmpleados = empresa.getListEmpleados();
        StringBuilder resultado = new StringBuilder("Lista de empleados:\n");

        boolean hayEmpleados = false;
        for (Empleado emp : listaEmpleados) {
            if (emp != null) {
                resultado.append(emp).append("\n");
                hayEmpleados = true;
            }
        }

        if (!hayEmpleados) {
            resultado.append("No hay empleados registrados.");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    public static void cargarDatos(Empresa empresa) {
        Empleado[] empleadosPrueba = {
                new Empleado("Juan Pérez", "E001", "Gerente", 10),
                new Empleado("María Gómez", "E002", "Desarrollador", 5),
                new Empleado("Carlos Rodríguez", "E003", "Ingeniero", 7),
                new Empleado("Ana Martínez", "E004", "Desarrollador", 8),
                new Empleado("Pedro Sánchez", "E005", "Gerente", 3),
                new Empleado("Lucía Fernández", "E006", "Ingeniero", 4),
                new Empleado("Sergio Ramírez", "E007", "Desarrollador", 2),
                new Empleado("Laura Herrera", "E008", "Gerente", 6),
                new Empleado("Andrés Castro", "E009", "Ingeniero", 4),
                new Empleado("Elena Ríos", "E010", "Desarrollador", 9)
        };

        for (int i = 0; i < empleadosPrueba.length; i++){
            empleadosPrueba[i].setSalario(empresa.asignarSalarioEmpleado(empleadosPrueba[i]));
            empresa.crearEmpleado(empleadosPrueba[i]);
        }
    }
}
