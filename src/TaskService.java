import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface TaskService {

    public void addTask(Tasks tasks);

    public List<Tasks> getTasksByDate(LocalDate date);

    public String deleteTask(int id);

    public String markStatusAsCompleted(int id);

    public List<Tasks> SearchByWord(String word);
}
