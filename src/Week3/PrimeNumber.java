package Week3;
public class PrimeNumber {

    public static void main(String[] args) {
        int num =3;
        System.out.println("Number " + num + " is " + primeNumber(num)+" prime number");
    }
 public static boolean primeNumber(int num) {

            if (num < 2) {
                return false;
            }

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;

     }
        }






/*1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
 */