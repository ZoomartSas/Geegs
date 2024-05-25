package kg.test.geegs.Controller;

import kg.test.geegs.Model.Task;
import kg.test.geegs.Service.TaskService;
import kg.test.geegs.Service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/task")
public class TaskCon {
  private final TaskService taskService;

    public TaskCon(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/id")
    public Optional<Task> getTaskById(@RequestParam Long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping("/cr")
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PutMapping("/{id}")
    public Optional<Task> updateTask(@PathVariable Long id, @RequestBody Task updatedTask) {
        return taskService.updateTask(id, updatedTask);
    }

    @DeleteMapping("/{id}")
    public boolean deleteTask(@RequestParam Long id) {
        return taskService.deleteTask(id);
    }
}
