package Week4;

import java.util.HashMap;
import java.util.Map;

public class StringFrequencyOfCharacters {
    public static void main(String[] args) {
        Freq("AABBDDCDEE");
    }
    public static void Freq(String string){
        Map<Character, Integer> newString = new HashMap<Character, Integer>();
        for(int i = 0; i < string.length(); i++)
        {
            if(newString.containsKey(string.charAt(i)))
            {
                newString.put(string.charAt(i), newString.get(string.charAt(i)) + 1);
            }
            else
            {
                newString.put(string.charAt(i), 1);
            }
            System.out.println(newString);
        }
        // Print characters and their
        // frequencies in same order
        // of their appearance
        for(int i = 0; i <string.length(); i++)
        {
            // Print only if this
            // character is not printed
            // before
            if(newString.get(string.charAt(i)) != 0){
                System.out.print(string.charAt(i));
                System.out.print(newString.get(string.charAt(i)) + " ");
                newString.put(string.charAt(i), 0);
            }
        }
    }
}


