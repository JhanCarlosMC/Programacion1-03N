package co.edu.uniquindio.herenciaanimales;

public class Animal {
    public int CantidadPatas;
    public String especie;
    public String nombre;

    public void ruido(){
        System.out.println("El animal hace ruido");
    }

    public Animal(int cantidadPatas, String especie, String nombre) {
        CantidadPatas = cantidadPatas;
        this.especie = especie;
        this.nombre = nombre;
    }

    public int getCantidadPatas() {
        return CantidadPatas;
    }

    public void setCantidadPatas(int cantidadPatas) {
        CantidadPatas = cantidadPatas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
