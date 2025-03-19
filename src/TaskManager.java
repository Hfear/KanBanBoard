//TaskManager (Class) – Implements ITaskManager,
//manages a collection of tasks.
import java.util.List;
import java.util.ArrayList;

public class TaskManager implements ITaskManager {

    private List<Task> taskList;

    public TaskManager() {
        this.taskList = new ArrayList<>();
    }
    public void addTask(Task task)
    {
        taskList.add(task);
    }

    public boolean markCompleted(Task task)
    {
        task.setStatus(true);
        return true;
    }

    public List<Task> listTasks()
    {
        return taskList;
    }

}

