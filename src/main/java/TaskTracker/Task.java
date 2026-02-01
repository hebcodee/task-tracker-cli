package TaskTracker;
import java.time.LocalDate;
import java.util.Objects;
import java.util.StringJoiner;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Task {

    public static int id = 0;
    private int taskId;
    private String description;
    private Status status;
    private final LocalDate createdAt;
    private LocalDate updatedAt;

    @JsonCreator
    public Task(@JsonProperty("taskID") int TaskId,
                @JsonProperty("description") String description,
                @JsonProperty("status") Status status,
                @JsonProperty("createdAt") LocalDate createdAt,
                @JsonProperty("updatedAt") LocalDate updatedAt) {
        id = TaskId;
        this.taskId = TaskId;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Task(String description, Status status){
        this.taskId = ++id;
        this.description = description;
        this.status = status;
        this.createdAt = LocalDate.now();
        this.updatedAt = null;
    }
}