public class Codewars{
    public static boolean validate(String n) {
        float sum = 0;
        int numberLength = 0;
        int numberToIncrement = 0;

        numberLength = n.length();

        if (numberLength % 2 == 0) {
            for (int i = 0; i < n.length(); i++) {

                char ch = n.charAt(i);
                numberToIncrement = Character.getNumericValue(ch);

                if(i % 2 == 0){
                    numberToIncrement = numberToIncrement * 2;
                    if (numberToIncrement > 9) {
                        numberToIncrement -= 9;
                    }
                    sum += numberToIncrement;
                }else{
                    sum +=numberToIncrement;
                }
            }
        }else{
            for (int i = 0; i < n.length(); i++) {

                char ch = n.charAt(i);
                numberToIncrement = Character.getNumericValue(ch);

                if(i % 2 == 1){
                    numberToIncrement = numberToIncrement * 2;
                    if (numberToIncrement > 9) {
                        numberToIncrement -= 9;
                    }
                    sum += numberToIncrement;
                }else{
                    sum +=numberToIncrement;
                }
            }
        }

        if(sum % 10 == 0)
            return true;
        else
            return false;
    }
}