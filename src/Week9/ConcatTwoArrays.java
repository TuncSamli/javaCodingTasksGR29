package Week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConcatTwoArrays {
    public static void main(String[] args) {
        String[] arr1 = {"one", "two", "three"};
        String[] arr2 = {"four", "five", "six"};
        System.out.println(TwoArraysConcat(arr1,arr2));
    }

    public static List<String> TwoArraysConcat(String[] arr1, String[] arr2) {

        List<String> list = new ArrayList<>();
        Collections.addAll(list, arr1);
        Collections.addAll(list, arr2);
        return list;
    }

}
