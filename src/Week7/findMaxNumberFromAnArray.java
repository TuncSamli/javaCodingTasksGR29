package Week7;

public class findMaxNumberFromAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 15, 3, 17, 18, 1, 44};
        System.out.println("maxNum(arr) = " + maxNum(arr));

    }


    public static int maxNum(int[] arr) {

        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
             }

        return max;

    }
}
