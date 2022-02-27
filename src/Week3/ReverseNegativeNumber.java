package Week3;

public class ReverseNegativeNumber {
    public static int reverseNegativeNum(int number) {
        int result = 0;
        if (number < 0){  number = number - number * 2;
            while (number != 0) {
                result = result * 10 + number % 10;
                number /= 10;
            }
            result = result - 2 * result;
            return result;
        }else{
            System.out.println("You have entered a Positive number or Zero!");
            return number;
        }
    }
}


/*3. Number -- Reverse negative number
Write a return method that can reverse
negative number and return it as int


 */

/*
git checkout master
git merge --no-ff Tunc
git push origin master
 */