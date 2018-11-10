import java.lang.Math;

public class Codewars {

    public static String seriesSum(int n) {

        double sum = 0.0;
        double decimal = 1.0;

        for(int i = 0; i < n; i++){
            if(i == 0){
                sum = 1;

            }else{
                decimal +=3;
                sum = sum + (1/(decimal));
            }
        }

        return String.format("%.2f", sum);
    }
}