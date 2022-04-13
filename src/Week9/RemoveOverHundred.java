package Week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveOverHundred {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,102,210,45,131));
        System.out.println(removeOver100(listOfNumbers));
    }
    public static List<Integer>removeOver100(List<Integer>nums){
        nums.removeIf(p->p>100);
    return nums;
    }

}
