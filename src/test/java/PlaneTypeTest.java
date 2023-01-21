import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaneTypeTest {

    @Test
    public void getCapacity() {
        assertEquals(150, PlaneType.BOEING747.getCapacity());
    }

    @Test
    public void getTotalWeight() {
        assertEquals(6000, PlaneType.BOEING747.getTotalWeight(), 0.0);
    }
}