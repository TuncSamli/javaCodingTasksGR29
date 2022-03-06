package Week4;

import java.util.*;

public class RemoveDuplicates {
    public static String removeDuplicates() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = input.next();
        String result = "";
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); // each character from string
            if (result.contains("" + ch)) {
                continue;
            }
            result += ch;
        }
        return result;
    }
    public static String removeDuplicates2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = input.next();
        String result = "";

        Set<String> duplicatesRemover = new LinkedHashSet<>(Arrays.asList(str.split("")));
        for (String s : duplicatesRemover) {
            result+=s;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates2());
    }
}
/*
Write a return method that can remove the duplicated values from
String
Ex:
removeDup (" AAABBBCCC")==> ABC
 */