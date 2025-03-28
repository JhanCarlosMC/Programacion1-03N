package co.edu.uniquindio;

import co.edu.uniquindio.herenciaanimales.Gato;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    @DisplayName("Prueba metodo equals")
    void test(){
        Gato gato = new Gato(4, "Felix", "Felino", "Croquetas", true) ;

        assertNotEquals(gato.getCantidadPatas(),2);
    }


}