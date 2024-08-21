package taskmanagement;

public class main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask("Complete project report");
        manager.addTask("Buy groceries");
        manager.displayTasks();
        manager.updateTask(1, "Buy groceries and supplies");
        manager.removeTask(0);
        manager.displayTasks();
    }
}
