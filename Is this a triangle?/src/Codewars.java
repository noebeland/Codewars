class Codewars{
    public static boolean isTriangle(int a, int b, int c){

        int firstTest = 0;
        int secondTest = 0;
        int thirdTest = 0;


        if(a > 0 && b > 0 && c > 0){

            int sum1 = a + c;
            if(sum1 > b)
                firstTest = 1;

            int sum2 = a + b;
            if(sum2 > c)
                secondTest = 1;

            int sum3 = b + c;
            if(sum3 > a)
                thirdTest = 1;
        }
        if(firstTest == 1 && secondTest == 1 && thirdTest == 1)
            return true;

        return false;
    }
}