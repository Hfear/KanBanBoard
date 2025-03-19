//ITaskManager (Interface) – Defines task management methods
//        (addTask, markCompleted, listTasks, etc.).

import java.util.List;

public interface ITaskManager {

    public void addTask(Task task);
    public boolean markCompleted(Task task);
    public List<Task> listTasks();

}
