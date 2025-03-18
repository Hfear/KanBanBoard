//TaskManager (Class) – Implements ITaskManager,
//manages a collection of tasks.

public class TaskManager implements ITaskManager {

    private List<Task> taskList;

    public TaskManager() {
        this.taskList = new ArrayList<>();
    }
    public void addTask(Task task)
    {
        taskList.add(task);
    };

    public boolean markCompleted(Task task)
    {

    };

    public void listTasks()
    {

    };

}

