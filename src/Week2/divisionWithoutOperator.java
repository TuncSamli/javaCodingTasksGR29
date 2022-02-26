package Week2;

import java.util.Scanner;

public class divisionWithoutOperator {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
//sdsds
        boolean success= false;

        do{
            System.out.println("Please enter dividend");
            int num1= scan.nextInt();

            System.out.println("Please enter divisor");
            int num2= scan.nextInt();

            success = divisionWithoutOperator(num1, num2);

        }while (!success);
    }
    public static boolean divisionWithoutOperator(int num1, int num2) {

        if (num1 < num2) {
            System.out.println("Number 1 should be bigger");
            return false;
        }
        if (num2 == 0) {
            System.out.println("You can not divide by \"0\"");
            return false;
        }
        int counter = 0;
        while (true) {
            if (num1 < num2) {
                System.out.println("Result is " + counter + " with reminder " + num1);
                return true;
            }
            num1 = num1 - num2;
            counter++;
        }
    }
}
