package guru.springframework.controller;

import guru.springframework.domain.Recipe;
import guru.springframework.repository.RecipeRepository;
import guru.springframework.service.impl.RecipeServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.reset;
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