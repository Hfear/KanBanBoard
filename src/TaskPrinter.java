import java.util.List;

public class TaskPrinter {

    public void printTask(List<Task> taskList) {
        if (taskList.isEmpty()) {
            System.out.println("No current tasks listed");
            return;
        }
        for (Task task : taskList) {
            System.out.println("Title: " + task.getTitle());
            System.out.println("Status: " + task.getStatusText());
            System.out.println("-----------------------------");
        }
    }
}
