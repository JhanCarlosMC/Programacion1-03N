package co.edu.uniquindio.herenciafiguras;

public class Triangulo extends FiguraGeometrica {

    public Triangulo(int cantLados) {
        super(cantLados);
    }

    @Override
    public void cantidadLados() {
        System.out.println("El triangulo tiene: " + cantLados + " Lados");
    }
}
