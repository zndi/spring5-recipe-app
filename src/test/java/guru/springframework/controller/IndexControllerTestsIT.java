package guru.springframework.controller;

import guru.springframework.entity.Recipe;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


public class IndexControllerTestsIT extends AbstractControllerTest {

    @Test
    public void getIndexPage() throws Exception {
        List<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe() {{
            setDescription("pouloulou");
        }});
        when(recipeRepository.findAll()).thenReturn(Collections.singletonList(recipes).iterator().next());
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }
}