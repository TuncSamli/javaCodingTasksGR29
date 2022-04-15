package Week8;

import java.util.Arrays;

public class Array_MoveAllZerosToTheEnd {

    /*
    write a program that can move all the zeros to the end of an array
     */

    public static int[] moveZerosToTheEnd(int[] array) {

        int[] result = new int[array.length];
        int index = 0;
        for (int each : array) {
            if (each != 0)
                result[index++] = each;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array={2,5,76,8,9,2,4,5,0,30,0,4,40,0,2};
        System.out.println(Arrays.toString(moveZerosToTheEnd(array)));
    }
}
