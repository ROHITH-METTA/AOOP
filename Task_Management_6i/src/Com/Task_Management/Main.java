package Com.Task_Management;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nTask Management System");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = sc.nextLine();
                    manager.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter task position to update: ");
                    int updateIndex = sc.nextInt() - 1;
                    sc.nextLine();  
                    System.out.print("Enter new task description: ");
                    String newDescription = sc.nextLine();
                    manager.updateTask(updateIndex, newDescription);
                    break;
                case 3:
                    System.out.print("Enter task position to remove: ");
                    int removeIndex = sc.nextInt() - 1;
                    manager.removeTask(removeIndex);
                    break;
                case 4:
                    manager.displayTasks();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }
}
