package Week3;

public class PrimeNumber {
    public static void primeOrNot(int number){
        int count=0;
        for (int i = 2; i <number ; i++) {
            if(number%i==0){
                count++;
            }
        }
        if(count>0){
            System.out.println("This number is not Prime!");
        }else{
            System.out.println("Prime number!");
        }
    }

}

/*1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
 */