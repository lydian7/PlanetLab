import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlanetTest {

    Planet planet;

    @Before
    public void before(){
        planet = new Planet("Mars", 98965);
    }

    @Test
    public void hasName(){
        assertEquals("Mars", planet.getName());
    }

    @Test
    public void hasSize(){
        assertEquals(98965, planet.getSize());
    }

}
