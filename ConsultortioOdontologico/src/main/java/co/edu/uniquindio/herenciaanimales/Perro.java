package co.edu.uniquindio.herenciaanimales;

public class Perro extends Animal{

    public Perro(String nombre, String especie, int cantidadPatas){
        super(cantidadPatas,especie,nombre);
    }

    @Override
    public void ruido(){
        System.out.println("GUAU GUAU");
    }
}
