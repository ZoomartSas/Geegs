package kg.test.geegs.Repository;

import kg.test.geegs.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskRepo extends JpaRepository<Task,Long> {
        Optional<Task> findById (Long id);
}

