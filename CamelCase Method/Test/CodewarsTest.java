import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {

    @Test
    public void testTwoWords() {
        assertEquals("TestCase", Codewars.camelCase("test case"));
    }

    @Test
    public void testThreeWords() {
        assertEquals("CamelCaseMethod", Codewars.camelCase("camel case method"));
    }

    @Test
    public void testLeadingSpace() {
        assertEquals("CamelCaseWord", Codewars.camelCase(" camel case word"));
    }

    @Test
    public void testTrailingSpace() {
        assertEquals("SayHello", Codewars.camelCase("say hello "));
    }

    @Test
    public void testSingleLetter() {
        assertEquals("Z", Codewars.camelCase("z"));
    }

    @Test
    public void testTwoSpacesBetweenWords() {
        assertEquals("AbC", Codewars.camelCase("ab  c"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", Codewars.camelCase(""));
    }

    private static final int NUMBER_OF_RANDOM_TESTS = 1_000;

    @Test
    public void testRandomInput() {
        Random random = ThreadLocalRandom.current();
        char[] randomLetters = generateRandomLowerCaseLetters(100, random);
        for (int i = 0; i < NUMBER_OF_RANDOM_TESTS; i++) {
            StringBuilder randomInput = new StringBuilder();
            StringBuilder expectedOutput = new StringBuilder();
            int numberOfWords = (1 + random.nextInt(5)) * (1 + random.nextInt(5)) - 1;
            for (int j = 0; j < numberOfWords; j++) {
                if (j > 0)
                    randomInput.append(' ');
                int wordLength = random.nextInt(11);
                if (wordLength > 0) {
                    int wordOffset = random.nextInt(randomLetters.length - wordLength);
                    randomInput.append(randomLetters, wordOffset, wordLength);
                    expectedOutput.append(Character.toUpperCase(randomLetters[wordOffset]));
                    if (wordLength > 1)
                        expectedOutput.append(randomLetters, wordOffset + 1, wordLength - 1);
                }
            }
            assertEquals(expectedOutput.toString(), Codewars.camelCase(randomInput.toString()));
        }
    }

    protected char[] generateRandomLowerCaseLetters(int count, Random random) {
        char[] randomLetters = new char[count];
        for (int i = 0; i < randomLetters.length; i++)
            randomLetters[i] += 'a' + random.nextInt(26);
        return randomLetters;
    }

}