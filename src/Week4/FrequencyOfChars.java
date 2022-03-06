package Week4;

import java.util.Scanner;

public class FrequencyOfChars {
    public static String frequencyChars() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = input.next();
        String result = ""; //a2b1c3d1
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); // each character from string
            int count = 0;
            for (int i = 0; i < str.length(); i++) { //to find the frequency of each character
                char each = str.charAt(i); // each character of str
                if (ch == each) {
                    count++;
                }
            }
            if (result.contains("" + ch)) {
                continue;
            }
            result += ch;
            result += count;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(frequencyChars());
    }
}
/*
Write a return method that can find the frequency of
characters
Ex:
FrequencyOfChars ("AAABBCDD") ==> A3B2C1D2
 */