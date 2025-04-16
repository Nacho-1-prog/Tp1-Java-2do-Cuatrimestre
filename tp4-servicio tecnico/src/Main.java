//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Empleado e1 = new Empleado(1, "Nacho","desarrolador",500000.0);
    Empleado e2 = new Empleado("Carlos", "diseñadir");

    e1.actualizarSalario(10);
    e2.actualizarSalario(5000);

        System.out.println(e1);
        System.out.println(e2);
    }
}