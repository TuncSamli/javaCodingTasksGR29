package Week4;

import java.util.Scanner;//importing scanner utility library

public class StringRemoveDups {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);//creating scanner object
        System.out.println("Enter your letters");//displays our scanner input message
        String letters =    s.nextLine();//declare string scanner input
        noDuplicates(letters);//ready to use method that will have no have duplicates upon calling.
    }
    public static void noDuplicates(String str   ){
        String newString = "";//emptry string for future char collection
        int length = str.length();//declare length for our string for the ease of use
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i); // store the character available at ith index in the string
            if (newString.indexOf(ch) < 0) { // check the index of the ch. If the indexOf() method returns true add it to the resuting string
                newString += ch;//collections all the chars
            }
        }
        System.out.println(newString);//printing our result
    }
    }


