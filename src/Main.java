import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        TaskPrinter printer = new TaskPrinter();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTask Manager");
            System.out.println("1. Add a Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. List Tasks");
            System.out.println("4. Remove a Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Add Task
                    System.out.print("Enter Task Title: ");
                    String title = scanner.nextLine();

                    Task task = Task.createTask(title);
                    manager.addTask(task);
                    System.out.println("Task added successfully.");
                    break;

                case 2:
                    // Mark Task as Completed
                    System.out.print("Enter Task Title to Mark as Completed: ");
                    String completeTitle = scanner.nextLine();

                    if (manager.markCompleted(completeTitle)) {
                        System.out.println("Task marked as completed.");
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;

                case 3:
                    //List Tasks
                    System.out.println("\n1. List All Tasks");
                    System.out.println("2. List Incomplete Tasks Only");
                    System.out.print("Choose an option: ");
                    int listChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (listChoice == 1) {
                        System.out.println("\nAll Tasks:");
                        printer.printTask(manager.listTasks(false));
                    } else if (listChoice == 2) {
                        System.out.println("\nIncomplete Tasks:");
                        printer.printTask(manager.listTasks(true));
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 4:
                    // Remove Task
                    System.out.print("Enter Task Title to Remove: ");
                    String removeTitle = scanner.nextLine();

                    if (manager.removeTask(removeTitle)) {
                        System.out.println("Task removed successfully.");
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting Task Manager. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
