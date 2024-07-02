package vo;

public class Task {
    private Long id;
    private String title;
    private String contents;
    private Category category;
    private StatusType status;
    private String createdTime;
    private String deadline;
    private String completeTime;

    public Task() {
    }

    public Task(String title, String contents, Category category, String deadline) {
        this.title = title;
        this.contents = contents;
        this.category = category;
        this.status = StatusType.PROGRESS;
        this.deadline = deadline;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", category=" + category +
                ", status=" + status +
                ", createdTime='" + createdTime + '\'' +
                ", deadline='" + deadline + '\'' +
                ", completeTime='" + completeTime + '\'' +
                '}';
    }
}
