import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskServiceImpl implements TaskService{

    private List<Tasks> tasks = new ArrayList<>();

    @Override
    public void addTask(Tasks task) {
        for(Tasks task1: tasks){
            if(task.equals(task1)) {
                System.out.println("Task already Exists " + task);
                return;
            }
        }
        tasks.add(task);
        System.out.println("Task added " + task);
    }

    @Override
    public List<Tasks> getTasksByDate(LocalDate date) {

        List<Tasks> tasksList = new ArrayList<>();

        for(Tasks task : tasks){
            if(task.getDate().equals(date)) tasksList.add(task);
        }

        return tasksList;
    }

    @Override
    public String deleteTask(int id) {

        for(Tasks task : tasks){
            if(task.getId() == id) {
                tasks.remove(task);
                return "Task with given Id "+ id +" deleted";
            }
        }
        return "Task with given Id "+ id +" not found";
    }

    @Override
    public String markStatusAsCompleted(int id) {

        for(Tasks task : tasks){
            if(task.getId() == id) {
                task.setStatus(true);
                return "Task marked as done " + task;
            }
        }
        return "Task with given Id "+ id +" not found";
    }

    @Override
    public List<Tasks> SearchByWord(String word) {

        List<Tasks> tasksList = new ArrayList<>();

        for(Tasks task : tasks){
            if(task.getDescription().toLowerCase().contains(word.toLowerCase())) {
                tasksList.add(task);
            }
        }
        return tasksList;
    }
}









