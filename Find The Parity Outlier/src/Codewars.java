import java.util.*;

public class Codewars{
    static int find(int[] integers){

        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        for(int i = 0; i < integers.length; i++){
            if(integers[i] % 2 == 0)
                evenNumbers.add(integers[i]);
            else
                oddNumbers.add(integers[i]);
        }
        if(evenNumbers.size() == 1)
            return evenNumbers.get(0);

        else if(oddNumbers.size() == 1)
            return oddNumbers.get(0);

        return 0;

    }
}