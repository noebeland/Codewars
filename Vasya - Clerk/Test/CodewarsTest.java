import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class CodewarsTest {
    @Test
    public void test1() {
        assertEquals("YES", Codewars.Tickets(new int[] {25, 25, 50}));
    }
    @Test
    public void test2() {
        assertEquals("NO", Codewars.Tickets(new int []{25, 100}));
    }
    @Test
    public void test3() {
        assertEquals("YES", Codewars.Tickets(new int[] {25, 25, 25, 25, 25, 25, 25, 25, 25, 25}));
    }
    @Test
    public void test4() {
        assertEquals("NO", Codewars.Tickets(new int []{50, 50, 50, 50, 50, 50, 50, 50, 50, 50}));
    }
    @Test
    public void test5() {
        assertEquals("NO", Codewars.Tickets(new int []{100, 100, 100, 100, 100, 100, 100, 100, 100, 100}));
    }
    @Test
    public void test6() {
        assertEquals("YES", Codewars.Tickets(new int []{25, 25, 25, 25, 50, 100, 50}));
    }
    @Test
    public void test7() {
        assertEquals("NO", Codewars.Tickets(new int []{50, 100,100}));
    }
    @Test
    public void test8() {
        assertEquals("NO", Codewars.Tickets(new int []{25, 25, 100}));
    }
    @Test
    public void test9() {
        assertEquals("NO", Codewars.Tickets(new int []{25, 25, 25, 25, 25, 25, 25, 50, 50, 50, 100, 100, 100, 100}));
    }
    @Test
    public void test10() {
        assertEquals("NO", Codewars.Tickets(new int []{25,25,50,50,100}));
    }
    @Test
    public void test11() {
        assertEquals("NO", Codewars.Tickets(new int []{25, 25, 25, 25, 25, 100, 100}));
    }

}