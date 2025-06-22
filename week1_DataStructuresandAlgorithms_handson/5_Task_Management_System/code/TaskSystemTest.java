public class TaskSystemTest {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        
        taskList.addTask(new Task("T001", "Design UI", "Pending"));
        taskList.addTask(new Task("T002", "Develop Backend", "In Progress"));
        taskList.addTask(new Task("T003", "Test Features", "Not Started"));

        
        System.out.println("All Tasks:");
        taskList.displayTasks();

        
        System.out.println("\nSearch Task T002:");
        Task task = taskList.searchTask("T002");
        System.out.println(task != null ? task : "Task not found");

        
        System.out.println("\nDeleting Task T002:");
        taskList.deleteTask("T002");

        
        System.out.println("\nFinal Task List:");
        taskList.displayTasks();
    }
}
