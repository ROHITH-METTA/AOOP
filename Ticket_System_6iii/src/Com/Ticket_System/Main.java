package Com.Ticket_System;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        TicketQueue ticketQueue = new TicketQueue();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nCustomer Support Ticket System");
            System.out.println("1. Add Ticket");
            System.out.println("2. Process Next Ticket");
            System.out.println("3. Display Pending Tickets");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String customerName = sc.nextLine();
                    System.out.print("Enter issue description: ");
                    String issueDescription = sc.nextLine();
                    ticketQueue.addTicket(customerName, issueDescription);
                    break;
                case 2:
                    ticketQueue.processNextTicket();
                    break;
                case 3:
                    ticketQueue.displayPendingTickets();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }

}
