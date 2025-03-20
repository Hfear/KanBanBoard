// ITaskManager (Interface) – Defines task management methods.
import java.util.List;

public interface ITaskManager {
    void addTask(Task task);
    boolean markCompleted(String title); // Changed from Task to String
    List<Task> listTasks();
    boolean removeTask(String title);
}
