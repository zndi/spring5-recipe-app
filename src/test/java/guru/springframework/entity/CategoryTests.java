package guru.springframework.entity;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CategoryTests extends TestCase {

    Category category;

    @Before
    public void setUp(){
     category= Mockito.mock(Category.class);
     Mockito.doAnswer(invocationOnMock -> null).when(category).setDescription("fhriferzbfirb");
     Mockito.when(category.getDescription()).thenReturn("fhriferzbfirb");
    }


    @Test
    public void testGetRecipes() {

    }

    @Test
    public void testGetId() {
    }

    @Test
    public void testGetDescription() {
        assertEquals("fhriferzbfirb",this.category.getDescription());
    }
}