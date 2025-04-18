package co.edu.uniquindio;

public class VehiculoBlindado extends Vehiculo {
    private int nivelBlindaje;

    public VehiculoBlindado(String id, String modelo, int aniofabricacion, double kilometraje, int misionesCompletadas, int nivelBlindaje, EstadoOperativo estadoOperativo) {
        super(id, modelo, aniofabricacion, kilometraje, misionesCompletadas, estadoOperativo);

        this.nivelBlindaje = nivelBlindaje;
    }

    @Override
    public void desplazar() {

    }

    public int getNivelBlindaje() {
        return nivelBlindaje;
    }

    public void setNivelBlindaje(int nivelBlindaje) {
        this.nivelBlindaje = nivelBlindaje;
    }
}
