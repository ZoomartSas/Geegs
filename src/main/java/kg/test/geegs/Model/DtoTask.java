package kg.test.geegs.Model;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DtoTask {
    Long id;
    @Column(length = 100)
    String title;
    String description;
    boolean completed;
    LocalDate created = LocalDate.now();
}
