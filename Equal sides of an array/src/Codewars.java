public class Codewars {
    public static int findEvenIndex(int[] arr) {
        int sumLeft = 0;
        int sumRight = 0;

        for(int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sumRight += arr[j];
            }

            if (i == 0) {
                sumLeft = 0;

            }else{
                for (int k = i - 1; k >= 0; k--) {
                    sumLeft += arr[k];
                }
        }

        if(sumLeft == sumRight)
                return i;

        sumLeft = 0;
        sumRight = 0;

        }

    return -1;

    }

}