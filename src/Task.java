public class Task {
    private String title;
    private boolean status;

    public static Task create() {
        return new Task();
    }

    public Task setTitle(String title) {
        this.title = title;
        return this;
    }

    public Task setStatus(boolean status) {
        this.status = status;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public boolean getStatus() {
        return status;
    }

    public String getStatusText() {
        return status ? "Completed" : "Pending";
    }

    public static Task createTask(String title) {
        return new Task()
                .setTitle(title)
                .setStatus(false);
    }
}
