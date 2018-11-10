import java.util.ArrayList;
import java.util.Collections;

public class Codewars{
    public static int[] sortArray(int[] array) {
        ArrayList<Integer> sortingOdd = new ArrayList<>();
        int intToSort;
        int valueSort;

        for(int i = 0; i< array.length; i++){
            intToSort = array[i];

            if(intToSort % 2 != 0){
                sortingOdd.add(intToSort);
                array[i] = 999;
            }

        }
        Collections.sort(sortingOdd);
        for(int i = 0; i< array.length; i++){
            intToSort = array[i];

            if(intToSort == 999){
                for(int j = 0; j < sortingOdd.size(); j++){
                    valueSort = sortingOdd.get(j);
                    array[i] = valueSort;
                    sortingOdd.remove(j);
                    break;
                }
            }
        }
        return array;
    }

}