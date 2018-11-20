import java.util.ArrayList;
import java.util.List;

public class Codewars {

    public static String soundex(final String names) {

        StringBuilder result = new StringBuilder();
        String[] letterChar = names.split(" ");

        for (int i = 0; i < letterChar.length; i++) {
            String worldResult = generateNum(letterChar[i]);
            result.append(worldResult);
            if(i != letterChar.length -1) result.append(" ");
        }
        return result.toString();
    }


    public static String generateNum(String input) {

        input = input.toUpperCase();
        input = input.substring(0,1) + input.substring(1).replaceAll("[WH]", "");

        char[] inputArray = input.toCharArray();
        char firstLetter = inputArray[0];

        for (int i = 0; i < inputArray.length; i++) {
            char ch = inputArray[i];
            switch (ch) {
                case 'B':
                case 'F':
                case 'P':
                case 'V': {
                    inputArray[i] = '1';
                    break;
                }
                case 'C':
                case 'G':
                case 'J':
                case 'K':
                case 'Q':
                case 'S':
                case 'X':
                case 'Z': {
                    inputArray[i] = '2';
                    break;
                }

                case 'D':
                case 'T': {
                    inputArray[i] = '3';
                    break;
                }

                case 'L': {
                    inputArray[i] = '4';
                    break;
                }

                case 'M':
                case 'N': {
                    inputArray[i] = '5';
                    break;
                }

                case 'R': {
                    inputArray[i] = '6';
                    break;
                }
                default: {
                    break;
                }

            }
        }
        String output = replaceAdjacent(new String(inputArray));

        output = output.substring(0,1) + output.substring(1).replaceAll("[AEIOUY]", "");

        if(output.substring(0,1).matches("[0-9]")){
            output = firstLetter + output.substring(1);
        }

        output += "000";
        return output.substring(0,4);
    }


    public static String replaceAdjacent(String input){
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < input.length()-1; i++){
            if(input.charAt(i) != input.charAt(i+1)){
                result.append(input.charAt(i));
            }
        }
        result.append(input.charAt(input.length()-1));
        return result.toString();
    }

}


