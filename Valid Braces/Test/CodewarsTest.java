import static org.junit.Assert.*;
import org.junit.Test;

public class CodewarsTest {

    private Codewars checker = new Codewars();

    @Test
    public void testValid() {
        assertEquals(true, checker.isValid("()"));
        assertEquals(true, checker.isValid("[]"));
        assertEquals(true, checker.isValid("{}"));
        assertEquals(true, checker.isValid("(){}[]"));
        assertEquals(true, checker.isValid("([{}])"));
        assertEquals(true, checker.isValid("({})[({})]"));
        assertEquals(true, checker.isValid("(({{[[]]}}))"));
        assertEquals(true, checker.isValid("{}({})[]"));
    }

    @Test
    public void testInvalid() throws Exception {
        assertEquals(false, checker.isValid("[(])"));
        assertEquals(false, checker.isValid("(}"));
        assertEquals(false, checker.isValid("(})"));
        assertEquals(false, checker.isValid(")(}{]["));
        assertEquals(false, checker.isValid("())({}}{()][]["));
        assertEquals(false, checker.isValid("(((({{"));
        assertEquals(false, checker.isValid("}}]]))}])"));
    }

}