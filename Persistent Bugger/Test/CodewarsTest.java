import static org.junit.Assert.*;
import org.junit.Test;

public class CodewarsTest {

    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        assertEquals(1, Codewars.persistence(12));
        assertEquals(0, Codewars.persistence(4));
        assertEquals(2, Codewars.persistence(25));
        assertEquals(4, Codewars.persistence(999));
    }

}

