import java.util.*;
import java.lang.Math;

public class Codewars {
    public static boolean comp(int[] a, int[] b) {
        double evalElement;
        int [] c = new int[a.length];
        Arrays.fill(c, 0);

        if((a == null && b != null) || (a != null && b == null) || (a.length == 0 && b == null))
            return false;

        else if((a.length != 0 && b.length == 0) ||(a.length == 0 && b.length != 0))
            return false;

        for(int i = 0; i < a.length; i++){

            evalElement = Math.pow(a[i], 2);

            for(int j = 0; j < b.length; j++){
                if (evalElement == b[j]) {
                    if(c[j] == 0) {
                        c[j] = 1;
                        break;
                    }

                }
                if(j == b.length -1)
                    return false;
            }
        }
        for(int k = 0; k < c.length; k++){
            if(c[k] == 0)
                return false;
        }
        return true;
    }

}