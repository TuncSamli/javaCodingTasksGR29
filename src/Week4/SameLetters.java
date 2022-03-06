package Week4;

import java.util.*;

public class SameLetters
{
    public static boolean SameLettersCheck() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first word:");
        String first = scan.next();
        System.out.println("Please enter your second word:");
        String second = scan.next();
        String[] firstAry = first.split("");
        String[] secondAry = second.split("");
        TreeSet<String> firstSet = new TreeSet<>(Arrays.asList(firstAry));
        TreeSet<String> secondSet = new TreeSet<>(Arrays.asList(secondAry));
        if (firstSet.equals(secondSet)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(SameLettersCheck());
    }


}
/*
Write a return method that check if a string is build out of the
same letters as another string.
Ex:
same(" abc ",","cabcab"); --> true
same("
abc abb "); -->
 */