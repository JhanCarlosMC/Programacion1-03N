package org.example;

public enum Cargo {
    ADMIN(1000),
    INGENIERIO(5000),
    AUXILIAR(200),
    SECRETARIO(250),
    MENSAJERO(300),
    OPERARIO(500);

    private final int sueldo;

    private Cargo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }
}
