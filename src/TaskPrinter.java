//(Optional) TaskPrinter (Class) – Handles displaying tasks, following the Single Responsibility Principle (SRP).
import java.util.List;
public class TaskPrinter {

    public void printTask(List<Task> taskList) {

        if (taskList.isEmpty()) {
            System.out.println("No current tasks listed");
            return;
        }
        for (Task task : taskList)
        {
            System.out.println(task.getTitle());
        }
    }
}

