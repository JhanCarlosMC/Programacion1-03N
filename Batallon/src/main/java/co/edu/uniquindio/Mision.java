package co.edu.uniquindio;

import java.time.LocalDate;
import java.util.LinkedList;

public class Mision {
    private int id;
    private LocalDate fecha;
    private String ubicacion;
    private LinkedList<String> listPersonal;

    private Vehiculo theVehiculo;

    public Mision(int id, LocalDate fecha, String ubicacion) {
        this.id = id;
        this.fecha = fecha;
        this.ubicacion = ubicacion;

        this.listPersonal = new LinkedList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public LinkedList<String> getListPersonal() {
        return listPersonal;
    }

    public void setListPersonal(LinkedList<String> listPersonal) {
        this.listPersonal = listPersonal;
    }

    public Vehiculo getTheVehiculo() {
        return theVehiculo;
    }

    public void setTheVehiculo(Vehiculo theVehiculo) {
        this.theVehiculo = theVehiculo;
    }
}
