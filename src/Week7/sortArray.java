package Week7;

import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int[] arr = {2, 15, 3, 17, 18, 1, 44};
        ArrayAscendingOrd(arr);
    }
public static void ArrayAscendingOrd(int [] arr){
    for (int i = 0; i < arr.length; i++) {
        for (int j = i +1 ;j< arr.length;j++){
            int temp=0;
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
         }
    for(int num:arr){
        System.out.println(num);
    }

    }
}




