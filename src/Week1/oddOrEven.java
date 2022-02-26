package Week1;

public class oddOrEven {

    public static void main(String[] args) {
        oddOrEven(15);
    }
    public static void oddOrEven(int number) {
        if (number % 2 == 0){
            System.out.println(number+" is EVEN");
        }else{
            System.out.println(number+" is ODD");
        }
    }
}
/*
Numbers ODD & even
Write a method which can identifies  given number is even or odd
*/