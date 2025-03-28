package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Cargo.ADMIN);
//        System.out.println(Cargo.ADMIN.getSueldo());
//        System.out.println(Cargo.MENSAJERO);
//        System.out.println(Cargo.MENSAJERO.getSueldo());

        Nota nota1 = new Nota("Parcial1", 3.0, "13/03/2025");
        System.out.println(nota1);
        System.out.println(nota1.nombre());
        System.out.println(nota1.calificacion());
        System.out.println(nota1.fecha());
    }
}