public class Empleado {
    private int idEmpleado;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    public Empleado(int idEmpleado, String nombre, String puesto, double salario) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this.idEmpleado = totalEmpleados + 1;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000.0;
    }

    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * porcentaje;
    }

    public void actualizarSalario(int cantidad) {
        this.salario += cantidad;
    }

    @Override
    public String toString() {
        return "ID: " + idEmpleado + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: " + salario;
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
