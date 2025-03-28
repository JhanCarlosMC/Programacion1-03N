package co.edu.uniquindio;

import co.edu.uniquindio.herenciaanimales.Animal;
import co.edu.uniquindio.herenciaanimales.Gato;
import co.edu.uniquindio.herenciaanimales.Pajaro;
import co.edu.uniquindio.herenciaanimales.Perro;
import co.edu.uniquindio.herenciafiguras.Cuadrado;
import co.edu.uniquindio.herenciafiguras.Triangulo;
import co.edu.uniquindio.herenciafiguras.TrianguloEscaleno;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato(4, "Felix", "Felino", "Croquetas", true) ;
        Perro perro = new Perro("Firulai", "Canino", 4);
        Pajaro pajaro = new Pajaro("Piolin", "Canario", 2);

        Animal nuevoAnimal = new Perro("Piolin", "Canino", 2);

//        gato.ruido();
//        perro.ruido();
        nuevoAnimal.ruido();
    }
}