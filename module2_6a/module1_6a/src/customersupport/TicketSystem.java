package customersupport;

import java.util.LinkedList;
import java.util.Queue;

public class TicketSystem {
    private Queue<String> tickets;

    public TicketSystem() {
        tickets = new LinkedList<>();
    }

    public void addTicket(String ticket) {
        tickets.add(ticket);
        System.out.println("Ticket added: " + ticket);
    }

    public void processNextTicket() {
        String ticket = tickets.poll();
        if (ticket != null) {
            System.out.println("Processing ticket: " + ticket);
        } else {
            System.out.println("No tickets to process.");
        }
    }

    public void displayTickets() {
        System.out.println("Pending tickets:");
        for (String ticket : tickets) {
            System.out.println(ticket);
        }
    }
}
