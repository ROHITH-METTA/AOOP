package Com.Ticket_System;
import java.util.LinkedList;
import java.util.Queue;
public class TicketQueue {
	private Queue<Ticket> ticketQueue;

    public TicketQueue() {
        ticketQueue = new LinkedList<>();
    }

    public void addTicket(String customerName, String issueDescription) {
        Ticket ticket = new Ticket(customerName, issueDescription);
        ticketQueue.add(ticket);
        System.out.println("Ticket added: " + ticket);
    }

    public void processNextTicket() {
        if (!ticketQueue.isEmpty()) {
            Ticket nextTicket = ticketQueue.poll();
            System.out.println("Processing ticket: " + nextTicket);
        } else {
            System.out.println("No tickets to process.");
        }
    }

    public void displayPendingTickets() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No pending tickets.");
        } else {
            System.out.println("Pending Tickets:");
            for (Ticket ticket : ticketQueue) {
                System.out.println(ticket);
            }
        }
    }
        
}
