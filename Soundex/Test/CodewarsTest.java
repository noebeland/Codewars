import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodewarsTest {

    @Test
    public void arnie() {
        assertEquals("S600 C560", Codewars.soundex("Sarah Connor"));
        assertEquals("S600 C560", Codewars.soundex("Sara Conar"));
        assertEquals("S600 C560", Codewars.soundex("Serah Coner"));
        assertEquals("S600 C560", Codewars.soundex("Sarh Connor"));
        assertEquals("S600 C560", Codewars.soundex("Sayra Cunnarr"));
    }

}