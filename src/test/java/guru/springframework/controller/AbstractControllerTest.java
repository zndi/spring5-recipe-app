package guru.springframework.controller;

import guru.springframework.repository.RecipeRepository;
import guru.springframework.service.impl.RecipeServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.mockito.Mockito.reset;

@ActiveProfiles("TEST")
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {ConfigTests.class, RecipeServiceImpl.class, RecipeController.class, IndexController.class})
@WebAppConfiguration
@ComponentScan(basePackages = "guru.springframework")
public class AbstractControllerTest  extends AbstractJUnit4SpringContextTests {


    @Autowired
    private WebApplicationContext webApplicationContext;

    protected MockMvc mockMvc;

    @Autowired
    protected RecipeRepository recipeRepository;

    @Before
    public void setUp() {
        mockMvc= MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        reset(recipeRepository);
    }


    @Test
    public void junitWantOneMethodeAbsolutely() {
    }
}
