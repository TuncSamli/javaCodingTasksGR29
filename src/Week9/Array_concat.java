package Week9;

import java.util.Arrays;

public class Array_concat {


    public static int[] concat(int[] a, int[] b) {
        int length = a.length + b.length;
        int[] result = new int[length];
        int index = 0;
        for (int element : a) {
            result[index] = element;
            index++;
        }
        for (int element : b) {
            result[index] = element;
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        System.out.println(Arrays.toString(concat(array1, array2)));

    }
}










//public class Concat {
//
//    public static void main(String[] args) {
//        int[] array1 = {1, 2, 3};
//        int[] array2 = {4, 5, 6};
//
//        int aLen = array1.length;
//        int bLen = array2.length;
//        int[] result = new int[aLen + bLen];
//
//        System.arraycopy(array1, 0, result, 0, aLen);
//        System.arraycopy(array2, 0, result, aLen, bLen);
//
//        System.out.println(Arrays.toString(result));
//    }
//}
