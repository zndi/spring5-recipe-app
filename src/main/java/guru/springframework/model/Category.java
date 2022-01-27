package guru.springframework.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
public class Category {
    private Long id;

    private String description;

    private Set<Recipe> recipes;
}
