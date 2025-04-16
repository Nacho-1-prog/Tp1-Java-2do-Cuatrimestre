import java.util.ArrayList;
import java.util.List;

public class SistemaSoporte {
    private List<TicketSoporte> tickets = new ArrayList<>();

    public void crearTicket(String descripcion, Usuario usuario) {
        TicketSoporte nuevoTicket = new TicketSoporte(descripcion, usuario);
        tickets.add(nuevoTicket);
    }

    public void asignarTecnico(int ticketId, Tecnico tecnico) {
        for (TicketSoporte ticket : tickets) {
            if (ticket.getId() == ticketId) {
                ticket.asignarTecnico(tecnico);
                return;
            }
        }
        System.out.println("Ticket no encontrado.");
    }

    public void listarTickets(boolean abiertos) {
        System.out.println("\n=== Tickets " + (abiertos ? "Abiertos" : "Cerrados") + " ===");
        for (TicketSoporte ticket : tickets) {
            if ((abiertos && ticket.getEstado().equals("abierto")) || (!abiertos && ticket.getEstado().equals("cerrado"))) {
                System.out.println(ticket);
            }
        }
    }

    public void cerrarTicket(int ticketId) {
        for (TicketSoporte ticket : tickets) {
            if (ticket.getId() == ticketId) {
                ticket.cerrarTicket(); // Llamamos al método de TicketSoporte
                System.out.println("El ticket " + ticketId + " ha sido cerrado.");
                return;
            }
        }
        System.out.println("Ticket no encontrado.");

    }
}