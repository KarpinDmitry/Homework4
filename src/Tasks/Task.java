package Tasks;


public class Task {
    private String name;
    private String description;
    private final int id;
    private TaskStatus status;

    public Task(String name, String description, int id){
        this.name = name;
        this.description = description;
        this.id = id;
        status = TaskStatus.NEW;

    }
    public Task(String name, String description, int id, TaskStatus status){
        this.name = name;
        this.description = description;
        this.id = id;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    protected void setDescription(String description){
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public TaskStatus getStatus() {
        return status;
    }
    protected void setStatus(TaskStatus status){
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", status=" + status +
                '}';
    }
}
