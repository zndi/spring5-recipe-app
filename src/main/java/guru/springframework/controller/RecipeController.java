package guru.springframework.controller;

import guru.springframework.map.CycleAvoidingMappingContext;
import guru.springframework.map.RecipeMapper;
import guru.springframework.model.Recipe;
import guru.springframework.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping({"/new"})
    public String newRecipe(@ModelAttribute Recipe recipe, Model model){
        model.addAttribute("recipe", recipe);

        return "recipe/recipeform";
    }

    @RequestMapping({"/{id}/update"})
    public String edit(@PathVariable("id") Long id, Model model){
        model.addAttribute("recipe", INSTANCE.toModel(this.recipeService.getRecipe(id), new CycleAvoidingMappingContext()));

        return "recipe/recipeform";
    }

    @PostMapping("")
    public String saveOrUpdate(@ModelAttribute Recipe recipe){
        Recipe savedCommand = INSTANCE
                .toModel(recipeService
                        .saveRecipe(INSTANCE.toEntity(recipe, new CycleAvoidingMappingContext())),
                        new CycleAvoidingMappingContext());

        return "redirect:/recipe/show/" + savedCommand.getId();
    }
}
