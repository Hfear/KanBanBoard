import java.util.List;
import java.util.ArrayList;

public class TaskManager {
    private List<Task> taskList;

    public TaskManager() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public boolean markCompleted(String title) {
        for (Task task : taskList) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                task.setStatus(true);
                return true;
            }
        }
        return false;
    }

    public List<Task> listTasks(boolean onlyIncomplete) {
        if (onlyIncomplete) {
            List<Task> incompleteTasks = new ArrayList<>();
            for (Task task : taskList) {
                if (!task.getStatus()) {
                    incompleteTasks.add(task);
                }
            }
            return incompleteTasks;
        }
        return taskList;
    }

    public boolean removeTask(String title) {
        return taskList.removeIf(task -> task.getTitle().equalsIgnoreCase(title));
    }
}
