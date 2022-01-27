package guru.springframework.controller;

import guru.springframework.map.CycleAvoidingMappingContext;
import guru.springframework.map.RecipeMapper;
import guru.springframework.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static guru.springframework.map.RecipeMapper.INSTANCE;

@Controller
@RequestMapping("/recipe")
public class RecipeController {

    private final RecipeService recipeService;
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }


    @GetMapping("/show/{id}")
    public String getRecipe(@PathVariable("id") Long id, Model model) {
        model.addAttribute("recipe", INSTANCE.toModel(this.recipeService.getRecipe(id), new CycleAvoidingMappingContext()));
        return "recipe/show";
    }
}
