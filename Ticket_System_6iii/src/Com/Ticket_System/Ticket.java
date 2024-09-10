package Com.Ticket_System;

public class Ticket {
	private String customerName;
    private String issueDescription;

    public Ticket(String customerName, String issueDescription) {
        this.customerName = customerName;
        this.issueDescription = issueDescription;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    @Override
    public String toString() {
        return "Customer: " + customerName + ", Issue: " + issueDescription;
    }
}
