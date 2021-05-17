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
    public void canChangeName(){
        planet.setName("Jupiter");
        assertEquals("Jupiter", planet.getName());
    }

    @Test
    public void hasSize(){
        assertEquals(98965, planet.getSize());
    }

    @Test
    public void canChangeSize(){
        planet.setSize(150000);
        assertEquals(150000, planet.getSize());
    }

    @Test
    public void canExplode(){
        assertEquals("Boom! Mars has exploded", planet.explode());
    }

}
