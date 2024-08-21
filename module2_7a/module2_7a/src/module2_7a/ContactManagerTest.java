package module2_7a;

public class ContactManagerTest {
    public static void main(String[] args) {
        // Create a ContactManager instance
        ContactManager manager = new ContactManager();

        // Create contacts
        Contact contact1 = new Contact("John Doe", "123-456-7890", "john.doe@example.com");
        Contact contact2 = new Contact("Jane Smith", "987-654-3210", "jane.smith@example.com");
        Contact contact3 = new Contact("Alice Johnson", "555-555-5555", "alice.johnson@example.com");

        // Add contacts
        manager.addContact(contact1);
        manager.addContact(contact2);
        manager.addContact(contact3);

        // List all contacts
        System.out.println("All contacts:");
        manager.listContacts();

        // Retrieve a contact by phone number
        System.out.println("\nRetrieving contact with phone number 987-654-3210:");
        Contact retrievedContact = manager.getContact("987-654-3210");
        System.out.println(retrievedContact);

        // Remove a contact
        System.out.println("\nRemoving contact with phone number 123-456-7890:");
        manager.removeContact("123-456-7890");

        // List all contacts after removal
        System.out.println("\nAll contacts after removal:");
        manager.listContacts();
    }
}
