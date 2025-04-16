import java.time.LocalDate;

public class TicketSoporte {
    private static int contadorTickets = 0;
    private int id;
    private String descripcion;
    private String estado;
    private LocalDate fechaCreacion;
    private Usuario usuario;
    private Tecnico tecnico;

    public TicketSoporte(String descripcion, Usuario usuario) {
        this.id = ++contadorTickets;
        this.descripcion = descripcion;
        this.estado = "abierto";
        this.fechaCreacion = LocalDate.now();
        this.usuario = usuario;
        this.tecnico = null;
    }

    public void asignarTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public void cerrarTicket() {
        this.estado = "cerrado";
    }

    @Override
    public String toString() {
        return "Ticket ID: " + id + "\nDescripción: " + descripcion + "\nEstado: " + estado +
                "\nFecha de Creación: " + fechaCreacion + "\nUsuario: " + usuario +
                "\nTécnico: " + (tecnico != null ? tecnico : "No asignado");
    }

    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }
}
