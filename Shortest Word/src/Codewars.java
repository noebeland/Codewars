import java.util.Arrays;


public class Codewars {
    public static int findShort(String s) {

        //int wordLength;
        int count =  0;
        int shortestWord = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ' && ch != '.')
                count++;
            else {
                if(shortestWord == 0) {
                    shortestWord = shortestWord + count;
                    count = 0;
                }
                else if(shortestWord >= count) {
                    shortestWord = count;
                    count = 0;
                }else
                    count = 0;

            }
        }

        if(shortestWord == 0)
            shortestWord += count;

        return shortestWord;
    }
}
