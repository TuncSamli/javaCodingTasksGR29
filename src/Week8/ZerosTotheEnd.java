package Week8;


import java.util.Arrays;


public class ZerosTotheEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 2, 0, 3, 0, 4, 0};
        int[] result=new int[arr.length];
        int count =0;

        for(int each:arr) {
            if (each != 0) {
                result[count++] = each;
            }
        }
        System.out.println(Arrays.toString(result));
        }
}

