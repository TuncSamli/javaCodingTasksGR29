package Week6;

public class Array_FindMaximum {
    /*
        Write a function that can find the maximum number from an int Array
     */


    public static int maxValue(int[] n) {

        int max = Integer.MIN_VALUE;

        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] a={3,4,6,7,8,99,6};
        System.out.println(maxValue(a));
    }


}
