package Week3;

public class ArmstrongNumbers {
    public static void isArmStrongNumber(int num) {
        int temp = 0, sum = 0, c = num;
        while (num > 0) {
            temp = num % 10;
            sum = sum + (temp * temp * temp);
            num /= 10;
        }
        if (sum == c) {
            System.out.println("Is an Armstrong Number!");
        } else {System.out.println("Is Not an Armstrong Number!");
        }
    }
}


