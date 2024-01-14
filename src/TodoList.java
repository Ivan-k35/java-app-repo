import java.util.ArrayList;
import java.util.List;



public class TodoList {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTaskByTitle(String title) {
        tasks.removeIf(task -> task.getTitle().equalsIgnoreCase(title));
    }

    public void displayTasks() {
        for (Task task : tasks) {
            System.out.println(task.getTitle() + " - " + task.getDescription() + " - Completed: " + task.isCompleted());
        }
    }

    public void markTaskAsCompleted(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                task.setCompleted(true);
                break;
            }
        }
    }
}
