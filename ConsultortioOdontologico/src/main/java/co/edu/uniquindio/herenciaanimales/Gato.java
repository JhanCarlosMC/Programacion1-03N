package co.edu.uniquindio.herenciaanimales;

public class Gato extends Animal{
    private boolean pelaje;
    private String tipoAlimentacion;

    public Gato(int cantidadPatas, String nombre, String especie, String tipoAlimentacion, boolean pelaje) {
        super(cantidadPatas, nombre, especie);
        this.pelaje = pelaje;
        this.tipoAlimentacion = tipoAlimentacion;

    }

    @Override
    public void ruido(){
        System.out.println("MIAUUUU");
    }

}
