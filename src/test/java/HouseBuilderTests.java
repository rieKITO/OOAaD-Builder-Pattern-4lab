import org.example.CottageBuilder;
import org.example.ModernBuilder;
import org.example.House;
import org.example.HouseBuilder;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class HouseBuilderTests {
    @Test
    public void testCottageBuilder() {
        HouseBuilder cottageBuilder = new CottageBuilder();
        cottageBuilder.buildArea(150.0);
        cottageBuilder.buildFloors(2);
        cottageBuilder.buildMaterials("Wood");
        cottageBuilder.buildHasGarden(true);

        House cottageHouse = cottageBuilder.getHouse();

        assertEquals(150.0, cottageHouse.getArea(), 0.001);
        assertEquals(2, cottageHouse.getFloors());
        assertEquals("Wood", cottageHouse.getMaterials());
        assertTrue(cottageHouse.getHasGarden());
    }

    @Test
    public void testModernBuilder() {
        HouseBuilder modernBuilder = new ModernBuilder();
        modernBuilder.buildArea(200.0);
        modernBuilder.buildFloors(3);
        modernBuilder.buildMaterials("Concrete");
        modernBuilder.buildHasGarden(false);

        House modernHouse = modernBuilder.getHouse();

        assertEquals(200.0, modernHouse.getArea(), 0.001);
        assertEquals(3, modernHouse.getFloors());
        assertEquals("Concrete", modernHouse.getMaterials());
        assertFalse(modernHouse.getHasGarden());
    }
}
