import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Tasks {

    private int id;
    private String description;
    private LocalDate date;

    private boolean status;

    public Tasks() {
    }

    public Tasks(int id, String description, LocalDate date) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.status = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tasks tasks)) return false;
        return getId() == tasks.getId() && Objects.equals(getDescription(), tasks.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDescription());
    }
}
