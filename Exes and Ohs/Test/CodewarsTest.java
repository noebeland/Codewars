import com.sun.tools.javac.jvm.Code;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.Random;

public class SolutionTest {

    Random rand = new Random();

    public static boolean expectXO (String str) {

        str = str.toLowerCase();
        return (str.length() - str.replace("x", "").length()) == (str.length() - str.replace("o", "").length());
    }

    public static String randomAlphaNumeric(int count) {
        String ALPHA_NUMERIC_STRING = "AXXXxxBXxxooOOCXXXooXXXXXXDoooXXEFXXXXoooGXXHXXxxooOOOOIJKLMNOPQOOOORSTUXXXXVWXXXYxxxxZ0oooo01XXXXX23xx45XX678XX9";
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }

    int  n = rand.nextInt(25) + 1;

    public void randTests(String str) {
        assertEquals(expectXO(str), Codewars.getXO(str));
    }

    @Test
    public void testSomething1() {
        assertEquals(true, Codewars.getXO("xxxooo"));
    }

    @Test
    public void testSomething2() {
        assertEquals(true, Codewars.getXO("xxxXooOo"));
    }

    @Test
    public void testSomething3() {
        assertEquals(false, Codewars.getXO("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void testSomething4() {
        assertEquals(false, Codewars.getXO("xXxxoewrcoOoo"));
    }

    @Test
    public void testSomething5() {
        assertEquals(false, Codewars.getXO("XxxxooO"));
    }

    @Test
    public void testSomething6() {
        assertEquals(true, Codewars.getXO("zssddd"));
    }

    @Test
    public void testSomething7() {
        assertEquals(false, Codewars.getXO("Xxxxertr34"));
    }

    @Test
    public void initiateRandTests() {
        for (int i=0; i<=n; i++) {
            randTests(randomAlphaNumeric(rand.nextInt(10)+1));
        }
    }
}