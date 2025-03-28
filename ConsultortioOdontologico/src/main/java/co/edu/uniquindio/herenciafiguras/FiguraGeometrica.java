package co.edu.uniquindio.herenciafiguras;

//Clase Padre
public class FiguraGeometrica {
    public int cantLados;

    public FiguraGeometrica(int cantLados) {
        this.cantLados = cantLados;
    }

    public void cantidadLados() {
        System.out.println("La Figura tiene: " + cantLados + " Lados");
    }
}
