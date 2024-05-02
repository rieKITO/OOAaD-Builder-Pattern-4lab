import org.example.House;
import org.example.HouseBuilder;
import org.example.HouseDirector;
import org.example.ModernBuilder;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

public class HouseDirectorTest {
    @Test
    public void testHouseDirector() {
        HouseBuilder modernBuilder = new ModernBuilder();
        HouseDirector director = new HouseDirector(modernBuilder);

        House modernHouse = director.construct(200.0, 3, "Concrete", false);

        assertEquals(200.0, modernHouse.getArea(), 0.001);
        assertEquals(3, modernHouse.getFloors());
        assertEquals("Concrete", modernHouse.getMaterials());
        assertFalse(modernHouse.getHasGarden());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHouseDirectorWithNullBuilder() {
        HouseDirector director = new HouseDirector(null);
    }
}
