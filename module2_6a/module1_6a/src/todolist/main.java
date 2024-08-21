package todolist;

public class main {
    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        list.addTask("Read a book");
        list.addTask("Exercise");
        list.displayTasks();
        list.updateTask(0, "Read two books");
        list.removeTask(1);
        list.displayTasks();
    }
}

