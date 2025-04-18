package co.edu.uniquindio;

public class VehiculoTransporteTropas extends Vehiculo {
    private int capacidadSoldados;

    public VehiculoTransporteTropas(String id, String modelo, int aniofabricacion, double kilometraje, int misionesCompletadas, int capacidadSoldados, EstadoOperativo estadoOperativo) {
        super(id, modelo, aniofabricacion, kilometraje, misionesCompletadas, estadoOperativo);

        this.capacidadSoldados = capacidadSoldados;
    }

    @Override
    public void desplazar() {
        System.out.println("El vehiculo desplazado es: " + getId());
    }

    public int getCapacidadSoldados() {
        return capacidadSoldados;
    }

    public void setCapacidadSoldados(int capacidadSoldados) {
        this.capacidadSoldados = capacidadSoldados;
    }
}
