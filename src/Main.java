import java.time.LocalDate;
import java.util.Date;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        TaskService taskService = new TaskServiceImpl();

//        Adding Tasking
        System.out.println("\n ADDING TASKS \n");
        taskService.addTask(new Tasks(1,"Scheduled appointment with doctor on monday", LocalDate.of(2023,1,6)));
        taskService.addTask(new Tasks(2,"Task 2", LocalDate.of(2023,1,6)));
        taskService.addTask(new Tasks(3,"Task 3", LocalDate.of(2023,3,5)));
        taskService.addTask(new Tasks(4,"Appointment with client today evening", LocalDate.of(2023,3,5)));
        taskService.addTask(new Tasks(2,"Task 2", LocalDate.of(2023,1,6)));

//        Getting tasks By given Date
        System.out.println("\n Getting tasks By given Date \n");
        List<Tasks> tasksList;
//        When tasks are found.
        tasksList = taskService.getTasksByDate(LocalDate.of(2023,1,6));
        System.out.println(tasksList.isEmpty() ? "No Tasks are found on the given date " : tasksList);
//        When no tasks are found.
        tasksList = taskService.getTasksByDate(LocalDate.of(2022,1,6));
        System.out.println(tasksList.isEmpty() ? "No Tasks are found on the given date " : tasksList);


//        Deleting tasks
        System.out.println("\n Deleting Tasks \n");
//        Deleting an existing task
        System.out.println(taskService.deleteTask(2));
//        Deleting a non existing task
        System.out.println(taskService.deleteTask(20));


//       Marking Task status as completed
        System.out.println("\n Marking Task status as completed \n");
//        updating an existing task
        System.out.println(taskService.markStatusAsCompleted(1));
//       trying to updating a non existing task
        System.out.println(taskService.markStatusAsCompleted(12));


//        Searching task with given word
        System.out.println("\n Searching task with given word \n");
        List<Tasks> tasksList1;
//        When there is a matching Task
        tasksList1 = taskService.SearchByWord("appointment");
        System.out.println(tasksList1.isEmpty() ? "No Tasks are found" : tasksList1);
//        When there is a matching Task
        tasksList1 = taskService.SearchByWord("call");
        System.out.println(tasksList1.isEmpty() ? "No Tasks are found" : tasksList1);
    }
}