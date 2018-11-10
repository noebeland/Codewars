import com.sun.tools.javac.jvm.Code;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CreditcardValidationTest{
    @Test
    public void test891(){
        assertEquals(false, Codewars.validate("891"));
    }
    @Test
    public void test123(){
        assertEquals(false, Codewars.validate("123"));
    }
    @Test
    public void test1(){
        assertEquals(false, Codewars.validate("1"));
    }
    @Test
    public void test2121(){
        assertEquals(true, Codewars.validate("2121"));
    }
    @Test
    public void test1230(){
        assertEquals(true, Codewars.validate("1230"));
    }
    @Test
    public void test8675309(){
        assertEquals(false, Codewars.validate("8675309"));
    }
    @Test
    public void test4111111111111111(){
        assertEquals(true, Codewars.validate("4111111111111111"));
    }
    @Test
    public void test26(){
        assertEquals(true, Codewars.validate("26"));
    }
    @Test
    public void test2626262626262626(){
        assertEquals(true, Codewars.validate("2626262626262626"));
    }
    @Test
    public void test91(){
        assertEquals(true, Codewars.validate("91"));
    }
    @Test
    public void test92(){
        assertEquals(false, Codewars.validate("92"));
    }
    @Test
    public void test912030(){
        assertEquals(true, Codewars.validate("912030"));
    }
    @Test
    public void test922030(){
        assertEquals(false, Codewars.validate("922030"));
    }
}