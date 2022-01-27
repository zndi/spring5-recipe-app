package guru.springframework.controller;

import guru.springframework.entity.Recipe;
import org.junit.Test;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


public class RecipeControllerTest extends AbstractControllerTest {

    @Test
    public void getRecipe() throws Exception {
        when(recipeRepository.findById(anyLong())).thenReturn(Optional.of(new Recipe() {{
            setDescription("pouloulou");
        }}));
        mockMvc.perform(get("/recipe/show/223"))
                .andExpect(status().isOk())
                .andExpect(view().name("recipe/show"));
    }
}