import static org.junit.Assert.*;
import org.junit.Test;


public class TriangleTesterTest {
    @Test
    public void publicTests() {
        assertEquals(true, Codewars.isTriangle(1,2,2));
        assertEquals(false, Codewars.isTriangle(7,2,2));
    }

    @Test
    public void changingSidesTest() {
        assertEquals(false, Codewars.isTriangle(1,2,3));
        assertEquals(false, Codewars.isTriangle(1,3,2));
        assertEquals(false, Codewars.isTriangle(3,1,2));

        assertEquals(false, Codewars.isTriangle(1,2,5));
        assertEquals(false, Codewars.isTriangle(1,5,2));
        assertEquals(false, Codewars.isTriangle(5,1,2));
    }

    @Test
    public void triangleTypes() {
        assertEquals(true, Codewars.isTriangle(4,2,3));
        assertEquals(true, Codewars.isTriangle(5,1,5));
        assertEquals(true, Codewars.isTriangle(2,2,2));
    }

    @Test
    public void NegativeTypes() {
        assertEquals(false, Codewars.isTriangle(-1,2,3));
        assertEquals(false, Codewars.isTriangle(1,-2,3));
        assertEquals(false, Codewars.isTriangle(1,2,-3));
        assertEquals(false, Codewars.isTriangle(-5,1,3));
        assertEquals(false, Codewars.isTriangle(0,2,3));
    }
}