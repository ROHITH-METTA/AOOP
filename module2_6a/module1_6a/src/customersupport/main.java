package customersupport;

public class main {
    public static void main(String[] args) {
        TicketSystem system = new TicketSystem();
        system.addTicket("Issue with login");
        system.addTicket("Payment gateway error");
        system.displayTickets();
        system.processNextTicket();
        system.displayTickets();
    }
}
