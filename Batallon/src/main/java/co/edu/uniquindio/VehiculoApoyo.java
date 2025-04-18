package co.edu.uniquindio;

public class VehiculoApoyo extends Vehiculo{
    private TipoApoyo tipoApoyo;

    public VehiculoApoyo(String id, String modelo, int aniofabricacion, double kilometraje, int misionesCompletadas, TipoApoyo tipoApoyo, EstadoOperativo estadoOperativo) {
        super(id, modelo, aniofabricacion, kilometraje, misionesCompletadas, estadoOperativo);

        this.tipoApoyo = tipoApoyo;
    }

    @Override
    public void desplazar() {
        System.out.println("El vehiculo de apoyo se esta desplazando");
    }

    public TipoApoyo getTipoApoyo() {
        return tipoApoyo;
    }

    public void setTipoApoyo(TipoApoyo tipoApoyo) {
        this.tipoApoyo = tipoApoyo;
    }
}
