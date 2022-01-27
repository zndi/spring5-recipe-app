package guru.springframework.service;

import guru.springframework.entity.Recipe;
import guru.springframework.repository.RecipeRepository;
import guru.springframework.service.impl.RecipeServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class RecipeServiceTests {

    @InjectMocks
    private RecipeServiceImpl recipeService;

    private RecipeRepository recipeRepository;

    @Before
    public void setUp() {
        recipeRepository = Mockito.mock(RecipeRepository.class);
        ReflectionTestUtils.setField(recipeService, "recipeRepository", recipeRepository);
        Mockito.reset(recipeRepository);
    }

    @Test
    public void getRecipes() {
        List<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe() {{
            setDescription("pouloulou");
        }});
        when(recipeRepository.findAll()).thenReturn(Collections.singletonList(recipes).iterator().next());
        assertEquals("pouloulou", Objects.requireNonNull(recipeService.getRecipes().stream().findFirst().orElse(null)).getDescription());
        verify(recipeRepository, times(1)).findAll();
    }
}