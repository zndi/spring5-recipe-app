package guru.springframework.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Recipe {
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private Byte[] images;
    private Set<Ingredient> ingredients;
    private Notes notes;
    private Difficulty difficulty;
    private Set<Category> categories;
}
