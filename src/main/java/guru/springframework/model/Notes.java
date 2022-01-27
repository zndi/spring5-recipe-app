package guru.springframework.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Notes {
    private Long id;
    private Recipe recipe;
    private String recipeNotes;
}
