public class Main {
    public static void main(String[] args) {

        TaskManager manager = new TaskManager();
        TaskPrinter printer = new TaskPrinter();


        Task ApiTask = new Task().setTitle("API Task")
                .setDescription("API Task Description");

        manager.addTask(ApiTask);

        Task DataTask = new Task().setTitle("Data Task")
                .setDescription("Data Task Description");

        manager.addTask(DataTask);

        Task ListTask = new Task().setTitle("List Task");
        manager.addTask(ListTask);

        printer.printTask(manager.listTasks());

    }


}