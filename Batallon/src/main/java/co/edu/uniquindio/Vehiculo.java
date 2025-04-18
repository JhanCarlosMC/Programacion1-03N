package co.edu.uniquindio;

import java.util.LinkedList;

public abstract class Vehiculo {
    protected String id;
    protected String modelo;
    protected int aniofabricacion;
    protected double kilometraje;
    protected int misionesCompletadas;
    protected EstadoOperativo estadoOperativo;

    protected LinkedList<Mision> listMisiones;

    public Vehiculo(String id, String modelo, int aniofabricacion, double kilometraje, int misionesCompletadas, EstadoOperativo estadoOperativo) {
        this.id = id;
        this.modelo = modelo;
        this.aniofabricacion = aniofabricacion;
        this.kilometraje = kilometraje;
        this.misionesCompletadas = misionesCompletadas;
        this.estadoOperativo = estadoOperativo;

        listMisiones = new LinkedList<>();
    }

    public abstract void desplazar();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAniofabricacion() {
        return aniofabricacion;
    }

    public void setAniofabricacion(int aniofabricacion) {
        this.aniofabricacion = aniofabricacion;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getMisionesCompletadas() {
        return misionesCompletadas;
    }

    public void setMisionesCompletadas(int misionesCompletadas) {
        this.misionesCompletadas = misionesCompletadas;
    }

    public LinkedList<Mision> getListMisiones() {
        return listMisiones;
    }

    public void setListMisiones(LinkedList<Mision> listMisiones) {
        this.listMisiones = listMisiones;
    }

    public EstadoOperativo getEstadoOperativo() {
        return estadoOperativo;
    }

    public void setEstadoOperativo(EstadoOperativo estadoOperativo) {
        this.estadoOperativo = estadoOperativo;
    }
}
