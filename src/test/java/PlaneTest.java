import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.A320);
    }

    @Test
    public void getPlaneType() {
        assertEquals(PlaneType.A320, plane.getPlaneType());
    }
}