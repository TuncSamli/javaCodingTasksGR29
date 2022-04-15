package Week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListRemove {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,100,105,120));
        System.out.println(removeGreaterThan100(numbers));
    }

    public static List<Integer> removeGreaterThan100(List<Integer> numbers) {

        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()) {
            if (it.next()>100) {
                it.remove();
            }
        }
        return numbers;
    }
}
