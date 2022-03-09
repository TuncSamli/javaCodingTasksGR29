package Week4;

import java.util.Arrays;
import java.util.Scanner;

public class StringSameLetters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter you word");
        String w1,w2;
        w1 = s.nextLine();
        w2=s.nextLine();
        System.out.println(Letter(w1, w2));
    }

    private static boolean Letter(String fst, String snd) {
    String resultfst ="";
    String resultsnd = "";
        char[]  ch = fst.toCharArray();
      char[] ch1 = snd.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        for (char c : ch) {
            resultfst+=c;
        }
        for (char c : ch1) {
            resultsnd+=c;
        }
        return resultfst.equals(resultsnd);
    }
}





