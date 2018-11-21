public class Codewars {
    public static int persistence(long n) {
        int result = findSum(n, 0);
        return result;
    }

    public static int findSum(long number, int value){

        String n = String.valueOf(number);
        char[] digits = n.toCharArray();
        long sum = 1;
        int result;

        int size = String.valueOf(number).length();
        if(size == 1)
            return 0;

        for(int i = 0; i < digits.length; i++){
            sum *= (long)digits[i] - 48;
        }

        int length = String.valueOf(sum).length();

        if(length == 1)
            return value + 1;

        else{
            result = findSum(sum, ++value);
        }

        return result;
    }

}