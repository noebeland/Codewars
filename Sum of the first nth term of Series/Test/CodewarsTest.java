import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;


public class CodewarsTest {

    public static String solution(int n) {
        if (n == 0) return "0.00";
        double s = 1.0;
        int i = 1;
        double den = 4.0;
        while (i < n) {
            s = s + (1 / den);
            i++;
            den += 3.0;
        }
        return String.format("%.2f", s);

    }

    @Test
    public void test1() {
        assertEquals("1.57", Codewars.seriesSum(5));
    }
    @Test
    public void test2() {
        assertEquals("1.77", Codewars.seriesSum(9));
    }
    @Test
    public void test3() {
        assertEquals("1.94", Codewars.seriesSum(15));
    }
    @Test
    public void test4() {
        assertEquals("2.26", Codewars.seriesSum(39));
    }
    @Test
    public void test5() {
        assertEquals("2.40", Codewars.seriesSum(58));
    }

    @Test
    public void test6() {
        Random r = new Random();
        for (int i = 0; i < 50; i++) {
            int x = r.nextInt(100);
            System.out.println("Nth with n: " + x);
            assertEquals(CodewarsTest.solution(x), Codewars.seriesSum(x));
        }
    }

}