package guru.springframework.service;

import guru.springframework.entity.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe getRecipe(Long id);
    Recipe saveRecipe(Recipe recipe);
}
