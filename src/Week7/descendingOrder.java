package Week7;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;


public class descendingOrder {
    public static void main(String[] args) {
        Integer [] array = {12,15,-21,4,1,6,-2};
       int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if(array[i]<array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }

        }
    for (int i=array.length-1;i>=0 ;i--){
        System.out.print(array[i]+" ");
    }
    }
}
