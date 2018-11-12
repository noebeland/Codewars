import java.util.ArrayList;
import java.util.List;

public class Codewars {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> itemsRemoved = new ArrayList<>();
        List<Integer> items2 = new ArrayList<>();
        for(int i = 0; i < items.size(); i++){
            items2.add(i);
        }

        int currentIndex = 0;

        while (items2.size() >= 1) {
            currentIndex = (currentIndex + k - 1) % items2.size();
            itemsRemoved.add(items.get(items2.get(currentIndex)));
            items2.remove(currentIndex);

        }
        return itemsRemoved;
    }
}