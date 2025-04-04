public class NaveEspacial {

    private String nombre;
    private int combustible;

    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = Math.min(combustibleInicial, 100);
    }

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no puede despegar, combustible insuficiente.");
        }
    }

    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " ha avanzado " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no puede avanzar " + distancia + " unidades. Combustible insuficiente.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > 100) {
            combustible = 100;
            System.out.println(nombre + " ha sido recargada completamente. Combustible actual: " + combustible);
        } else {
            combustible += cantidad;
            System.out.println(nombre + " ha sido recargada con " + cantidad + " unidades. Combustible actual: " + combustible);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible disponible: " + combustible);
        System.out.println("---------------------------");
    }

}
