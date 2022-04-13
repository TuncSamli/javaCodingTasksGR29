package Week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListRemoveAhmed {
    public static void main(String[] args) {
        List<String> newList = new ArrayList<>(Arrays.asList("Ahmed", "Andrew", "Valera"));
        System.out.println(removeAhmed(newList));
    }
    public static List<String> removeAhmed(List<String>array){
   array.removeIf(p->p.equals("Ahmed"));
    return array;
    }

}
