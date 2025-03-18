//ITaskManager (Interface) – Defines task management methods
//        (addTask, markCompleted, listTasks, etc.).

public interface ITaskManager {

    public void addTask(Task task);
    public void markCompleted(Task task);
    public void listTasks();

}
