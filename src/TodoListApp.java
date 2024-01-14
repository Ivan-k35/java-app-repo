import java.util.Scanner;

public class TodoListApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        label:
        while (true) {
            System.out.println("Введите команду (add, remove, mark, display, exit):");
            String command = scanner.nextLine();

            switch (command) {
                case "exit":
                    break label;
                case "add": {
                    System.out.println("Введите название задачи:");
                    String title = scanner.nextLine();
                    System.out.println("Введите описание задачи:");
                    String description = scanner.nextLine();
                    Task newTask = new Task(title, description, false);
                    todoList.addTask(newTask);
                    break;
                }
                case "remove": {
                    System.out.println("Введите название задачи для удаления:");
                    String title = scanner.nextLine();
                    todoList.removeTaskByTitle(title);
                    break;
                }
                case "mark": {
                    System.out.println("Введите название задачи, которую хотите отметить как выполненную:");
                    String title = scanner.nextLine();
                    todoList.markTaskAsCompleted(title);
                    break;
                }
                case "display":
                    todoList.displayTasks();
                    break;
                default:
                    System.out.println("Неизвестная команда.");
                    break;
            }
        }
    }
}
