import java.util.Stack;

public class Codewars {
    private static Stack theStack;

    public boolean isValid(String braces) {
        theStack = new Stack<Character>();
        char openingBraces;
        char closingBraces;
        char ch;

        if(braces.length() % 2 != 0 || braces.length() == 0)
            return false;

        for (int j = 0; j < braces.length(); j++) {
            ch = braces.charAt(j);

            if(ch != '(' && ch != ')' && ch != '{' && ch != '}' && ch != '[' && ch != ']')
                return false;

            if (ch == '(' || ch == '{' || ch == '[') {
                openingBraces = ch;
                theStack.push(openingBraces);
            } else if (ch == ')' || ch == '}' || ch == ']') {

                if(theStack.isEmpty())
                    return false;

                closingBraces = ch;
                openingBraces = (char) theStack.lastElement();

                if (findMatchingParentheses(openingBraces, closingBraces) != true) {
                    return false;

                } else {
                    if(!theStack.isEmpty())
                        theStack.pop();
                    else
                        return true;
                }
            }
        }
        if(theStack.isEmpty())
            return true;
        else
            return false;

    }

    private static boolean findMatchingParentheses(char openingBraces, char closingBraces){
        if (openingBraces == '(' && closingBraces == ')') {
            return true;
        }
        if (openingBraces == '[' && closingBraces == ']') {
            return true;
        }
        if (openingBraces == '{' && closingBraces == '}') {
            return true;
        }
        return false;
    }
}