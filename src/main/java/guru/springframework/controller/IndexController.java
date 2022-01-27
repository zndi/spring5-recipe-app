package guru.springframework.controller;


import guru.springframework.map.CycleAvoidingMappingContext;
import guru.springframework.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.stream.Collectors;

import static guru.springframework.map.RecipeMapper.INSTANCE;

@Controller
public class IndexController {
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping({"/", "/index.html", ""})
    public String getRecipes(Model model) {
        model.addAttribute("recipes",
                this.recipeService.getRecipes()
                        .stream()
                        .map(map ->
                                INSTANCE
                                        .toModel(map, new CycleAvoidingMappingContext())).collect(Collectors.toSet()));
        return "index";
    }
}
