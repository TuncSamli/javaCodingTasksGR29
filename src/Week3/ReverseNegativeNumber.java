package Week3;

import java.util.Scanner;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int scan = s.nextInt();
        int reversed = 0;

        while (scan != 0) {
            int digit = scan % 10;
            reversed = reversed * 10 + digit;
            scan /= 10;
        }
        System.out.println(reversed);
    }
}
/*3. Number -- Reverse negative number
Write a return method that can reverse
negative number and return it as int*/