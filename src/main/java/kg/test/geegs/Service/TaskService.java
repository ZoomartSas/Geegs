package kg.test.geegs.Service;

import kg.test.geegs.Model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    List<Task> getAllTasks();
    Optional<Task> getTaskById(Long taskId);
    Task createTask(Task task);
    Optional<Task> updateTask(Long taskId, Task updatedTask);
    boolean deleteTask(Long taskId);
}
