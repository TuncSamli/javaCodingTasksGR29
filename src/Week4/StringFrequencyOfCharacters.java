package Week4;

import java.util.HashMap;
import java.util.Map;

public class StringFrequencyOfCharacters {
    public static void main(String[] args) {
        Freq("AABBDDCDEE");
    }
    public static void Freq(String string){
        Map<Character, Integer> newString = new HashMap<Character, Integer>();// we will be storing all characters (keys) and their frequencies (values) inside this newly created map data structure
        for(int i = 0; i < string.length(); i++)//iterating given string
        {
            if(newString.containsKey(string.charAt(i)))//collecting chars from string inside our map data structure in a random order but maintaining size of the map based on the number of characters transferred
            {
                newString.put(string.charAt(i), newString.get(string.charAt(i)) +1);//collecting chars/freqs+1 since they can appear more than 1 time
            }
            else
            {
                newString.put(string.charAt(i), 1);// otherwise, collecting characters that appeared only once
            }
            System.out.println(newString);//tracking iteration for debugging and just fyi how it works
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


