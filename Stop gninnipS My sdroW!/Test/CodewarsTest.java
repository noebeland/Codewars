import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SpinWordsTest {
    @Test
    public void test() {
        assertEquals("emocleW", new Codewars().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new Codewars().spinWords("Hey fellow warriors"));
        assertEquals("This is a test", new Codewars().spinWords("This is a test"));
        assertEquals("This is rehtona test", new Codewars().spinWords("This is another test"));
        assertEquals("You are tsomla to the last test", new Codewars().spinWords("You are almost to the last test"));
        assertEquals("Just gniddik ereht is llits one more", new Codewars().spinWords("Just kidding there is still one more"));
        assertEquals("ylsuoireS this is the last one", new Codewars().spinWords("Seriously this is the last one"));
    }

}