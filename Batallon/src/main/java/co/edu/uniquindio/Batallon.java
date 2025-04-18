package co.edu.uniquindio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

public class Batallon {
    private String id;
    private String nombre;

    private LinkedList<VehiculoApoyo> listVehiculosApoyo;
    private LinkedList<VehiculoBlindado> listVehiculosBlindados;
    private LinkedList<VehiculoTransporteTropas> listVehiculosTransporteTropas;

    private ArrayList<Mision> listMisiones;

    public Batallon(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;

        this.listVehiculosApoyo = new LinkedList<>();
        this.listVehiculosBlindados = new LinkedList<>();
        this.listVehiculosTransporteTropas = new LinkedList<>();
        this.listMisiones = new ArrayList<>();
    }

    public boolean crearVehiculoBlindado(String id, String modelo, int aniofabricacion,
                                         double kilometraje, int misionesCompletadas,
                                         EstadoOperativo estadoOperativo, int nivelBlindaje){
        boolean flag = false;

        for(VehiculoBlindado vehiculo : listVehiculosBlindados){
            if(vehiculo.getId().equals(id)){
                return flag;
            }
        }

        VehiculoBlindado newVehiculoBlindado =
                new VehiculoBlindado(id,modelo, aniofabricacion,
                        kilometraje, misionesCompletadas, nivelBlindaje, estadoOperativo);
        listVehiculosBlindados.add(newVehiculoBlindado);
        flag = true;

        return flag;
    }


    public Vehiculo getVehiculoConMasMisiones() {
        Vehiculo vehiculoConMasMisiones = null;
        int maxMisiones = -1;

// Buscar en vehículos de transporte de tropas for (VehiculoTransporteTropa v : listVehiculosTransporteTropa) {
//        if (v.getMisionesCompletadas() > maxMisiones) {
//            maxMisiones = v.getMisionesCompletadas();
//            vehiculoConMasMisiones = v;
//        }
//
//// Buscar en vehículos blindados for (VehiculoBlindado v : listVehiculosBlindados) {
//        if (v.getMisionesCompletadas() > maxMisiones) {
//            maxMisiones = v.getMisionesCompletadas();
//            vehiculoConMasMisiones = v;
//        }
//
//        // Buscar en vehículos de apoyo for (VehiculoApoyo v : listVehiculosApoyo) {
//        if(v.getMisionesCompletadas()>maxMisiones)
//            {
//                maxMisiones = v.getMisionesCompletadas();
//                vehiculoConMasMisiones = v;
//            }

                return vehiculoConMasMisiones;
        }


public double kilometrajePromedioVehiculoCraga(LinkedList<VehiculoTransporteTropas> listVehiculosCarga) {
    double sumakilometraje = 0;
    int contador = 0;
    for (VehiculoTransporteTropas vehiculo : listVehiculosTransporteTropas) {

        sumakilometraje += vehiculo.getKilometraje();

        contador++;

    }

    if (contador != 0) {
        return sumakilometraje / contador;
    }
    return 0;
}

public double kilometrajePromedioVehiculoApoyo(LinkedList<VehiculoApoyo> listVehiculosApoyo) {

    double sumakilometraje = 0;
    int contador = 0;

    for (VehiculoApoyo vehiculo : listVehiculosApoyo) {

        sumakilometraje += vehiculo.getKilometraje();

        contador++;

    }

    if (contador != 0) {
        return sumakilometraje / contador;
    }
    return 0;
}

public double kilometrajePromedioVehiculoBlindado(LinkedList<VehiculoBlindado> listVehiculoBlindados) {

    double sumakilometraje = 0;
    int contador = 0;

    for (VehiculoBlindado vehiculo : listVehiculoBlindados) {

        sumakilometraje += vehiculo.getKilometraje();

        contador++;
    }

    if (contador != 0) {
        return sumakilometraje / contador;
    }
    return 0;
}


public boolean registrarMision(LocalDate fechaMision, String ubicacionMision,
                               LinkedList listPersonal, String idVehiculoMision) {
    boolean flag = false;
    int idMisionNueva = listMisiones.size() + 1;

    Mision newMision = new Mision(idMisionNueva, fechaMision, ubicacionMision);
    newMision.setListPersonal(listPersonal);

    for (VehiculoApoyo vehiculo : listVehiculosApoyo) {
        if (vehiculo.getId().equals(idVehiculoMision)) {
            newMision.setTheVehiculo(vehiculo);

            LinkedList<Mision> listaMisionesAux = vehiculo.getListMisiones();
            listaMisionesAux.add(newMision);
            vehiculo.setListMisiones(listaMisionesAux);
            flag = true;
        }
    }

    for (VehiculoBlindado vehiculo : listVehiculosBlindados) {
        if (vehiculo.getId().equals(idVehiculoMision)) {
            newMision.setTheVehiculo(vehiculo);


            LinkedList<Mision> listaMisionesAux = vehiculo.getListMisiones();

            listaMisionesAux.add(newMision);
            vehiculo.setListMisiones(listaMisionesAux);
            flag = true;
        }
    }

    for (VehiculoTransporteTropas vehiculo : listVehiculosTransporteTropas) {
        if (vehiculo.getId().equals(idVehiculoMision)) {
            newMision.setTheVehiculo(vehiculo);

            LinkedList<Mision> listaMisionesAux = vehiculo.getListMisiones();

            listaMisionesAux.add(newMision);
            vehiculo.setListMisiones(listaMisionesAux);
            flag = true;
        }
    }

    listMisiones.add(newMision);

    return flag;
}

public LinkedList<Vehiculo> obtenerVehiculosCantMisiones() {
    LinkedList<Vehiculo> vehiculosMisiones = new LinkedList<>();


    for (VehiculoApoyo vehiculo : listVehiculosApoyo) {
        if (vehiculo.getMisionesCompletadas() > 50) {
            vehiculosMisiones.add(vehiculo);
        }
    }

    for (Vehiculo vehiculo : listVehiculosBlindados) {
        if (vehiculo.getMisionesCompletadas() > 50) {
            vehiculosMisiones.add(vehiculo);
        }
    }

    for (Vehiculo vehiculo : listVehiculosTransporteTropas) {
        if (vehiculo.getMisionesCompletadas() > 50) {
            vehiculosMisiones.add(vehiculo);
        }
    }

    return vehiculosMisiones;
}

public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public LinkedList<VehiculoApoyo> getListVehiculosApoyo() {
    return listVehiculosApoyo;
}

public void setListVehiculosApoyo(LinkedList<VehiculoApoyo> listVehiculosApoyo) {
    this.listVehiculosApoyo = listVehiculosApoyo;
}

public LinkedList<VehiculoBlindado> getListVehiculosBlindados() {
    return listVehiculosBlindados;
}

public void setListVehiculosBlindados(LinkedList<VehiculoBlindado> listVehiculosBlindados) {
    this.listVehiculosBlindados = listVehiculosBlindados;
}

public LinkedList<VehiculoTransporteTropas> getListVehiculosTransporteTropas() {
    return listVehiculosTransporteTropas;
}

public void setListVehiculosTransporteTropas(LinkedList<VehiculoTransporteTropas> listVehiculosTransporteTropas) {
    this.listVehiculosTransporteTropas = listVehiculosTransporteTropas;
}

public ArrayList<Mision> getListMisiones() {
    return listMisiones;
}

public void setListMisiones(ArrayList<Mision> listMisiones) {
    this.listMisiones = listMisiones;
}
}
