package co.edu.uniquindio;
/*
 * Clase BatallonTest creada para probar las funcionlidades de Batallon
 *
 * @author JhanCarlosMC
 * @since 4/8/2025
 * */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Assertions;

public class BatallonTest {
    private static final Logger LOG =
            Logger.getLogger(BatallonTest.class.getName());

    @Test
    @DisplayName("Metodo de Prueba Crear Vehiculo Blindado")
    public void crearVehiculoBlindadoTest() {
        LOG.info("La prueba crearVehiculoBlindadoTest inicio");

        Batallon newBatallon = new Batallon("001", "Cacique Calarca");

        boolean respuesta = newBatallon.crearVehiculoBlindado("01", "2000", 2000,
                1000.0,0,EstadoOperativo.DISPONIBLE, 10);

//        assertTrue(respuesta);
        assertEquals(1, newBatallon.getListVehiculosBlindados().size());
        LOG.info("La prueba crearVehiculoBlindadoTest finalizo");
    }

    @Test
    @DisplayName("Metodo de Prueba Crear Vehiculo Blindado duplicado")
    public void crearVehiculoBlindadoRepetidoTest() {
        LOG.info("La prueba crearVehiculoBlindadoTest inicio");

        Batallon newBatallon = new Batallon("001", "Cacique Calarca");

        newBatallon.crearVehiculoBlindado("01", "2000", 2000,
                1000.0,0,EstadoOperativo.DISPONIBLE, 10);

        boolean respuesta = newBatallon.crearVehiculoBlindado("01", "2000", 2000,
                1000.0,0,EstadoOperativo.DISPONIBLE, 10);

//        assertFalse(respuesta);
        assertNotEquals(2, newBatallon.getListVehiculosBlindados().size());
        LOG.info("La prueba crearVehiculoBlindadoTest finalizo");
    }

}