import java.util.Stack;
import java.lang.StringBuilder;

public class Codewars {

    public String spinWords(String sentence) {
        String finalSentence = "";
        String[] words = sentence.split(" ");

        for(int i = 0; i < words.length; i++){
            if(words[i].length() >= 5) {
                finalSentence += new StringBuilder(words[i]).reverse().toString();
            }else
                finalSentence += words[i];
            if(i != words.length-1)
                finalSentence += " ";
        }
        return finalSentence;
    }
}