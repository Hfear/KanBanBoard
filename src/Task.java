
//Task (Class) – Represents a single task with properties like title,
//description, priority, and status.

public class Task {
private String title;
private String description;
private int priority;
private boolean status;


//Builder method constructors
public static Task create()
{
    return new Task();
}


public Task setTitle(String title){
    this.title = title;
    return this;
}
public Task setDescription(String description){
    this.description = description;
    return this;
}
public Task setPriority(int priority){
    this.priority = priority;
    return this;
}
public Task setStatus(boolean status){
    this.status = status;
    return this;
}

    public String getDescription() {
        return description;
    }
    public int getPriority() {
    return priority;
    }
    public String getTitle() {
    return title;
    }
}
