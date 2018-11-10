import org.junit.Test;
import static org.junit.Assert.*;

public class CodewarsTest {

    @Test
    public void testEncrypt() {
        // assertEquals("expected", "actual");
        assertEquals("This is a test!", Codewars.encrypt("This is a test!", 0));
        assertEquals("hsi  etTi sats!", Codewars.encrypt("This is a test!", 1));
        assertEquals("s eT ashi tist!", Codewars.encrypt("This is a test!", 2));
        assertEquals(" Tah itse sits!", Codewars.encrypt("This is a test!", 3));
        assertEquals("This is a test!", Codewars.encrypt("This is a test!", 4));
        assertEquals("This is a test!", Codewars.encrypt("This is a test!", -1));
        assertEquals("hskt svr neetn!Ti aai eyitrsig", Codewars.encrypt("This kata is very interesting!", 1));
    }

    @Test
    public void testDecrypt() {
        // assertEquals("expected", "actual");
        assertEquals("This is a test!", Codewars.decrypt("This is a test!", 0));
        assertEquals("This is a test!", Codewars.decrypt("hsi  etTi sats!", 1));
        assertEquals("This is a test!", Codewars.decrypt("s eT ashi tist!", 2));
        assertEquals("This is a test!", Codewars.decrypt(" Tah itse sits!", 3));
        assertEquals("This is a test!", Codewars.decrypt("This is a test!", 4));
        assertEquals("This is a test!", Codewars.decrypt("This is a test!", -1));
        assertEquals("This kata is very interesting!", Codewars.decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
    }

    @Test
    public void testNullOrEmpty() {
        // assertEquals("expected", "actual");
        assertEquals("", Codewars.encrypt("", 0));
        assertEquals("", Codewars.decrypt("", 0));
        assertEquals(null, Codewars.encrypt(null, 0));
        assertEquals(null, Codewars.decrypt(null, 0));
    }

}