package guru.springframework.controller;


import guru.springframework.repository.*;
import guru.springframework.service.RecipeService;
import guru.springframework.service.impl.RecipeServiceImpl;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("TEST")
public class ConfigTests {

    @Bean
    @Primary
    public RecipeRepository getRecipeRepository(){
        return Mockito.mock(RecipeRepository.class);
    }

    @Bean
    @Primary
    public CategoryRepository getCategoryRepository(){
        return Mockito.mock(CategoryRepository.class);
    }
    @Bean
    @Primary
    public NotesRepository getNotesRepository(){
        return Mockito.mock(NotesRepository.class);
    }

    @Bean
    @Primary
    public IngredientRepository getIngredientRepository(){
        return Mockito.mock(IngredientRepository.class);
    }

    @Bean
    @Primary
    public UnitOfMeasureRepository getUnitOfMeasureRepository(){
        return Mockito.mock(UnitOfMeasureRepository.class);
    }

    /*@Bean
    public RecipeService getRecipeService(@Autowired RecipeRepository repository){
        return new RecipeServiceImpl(repository);
    }*/
}
