package Week7;

import java.util.Arrays;
import java.util.Collections;


public class descendingOrder {
    public static void main(String[] args) {
        Integer [] array = {12,15,-21,4,1,6,-2};
        Arrays.sort(array,Collections.reverseOrder());
        System.out.println(Arrays.toString(array));

    }
}
