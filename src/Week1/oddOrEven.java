package Week1;
public class oddOrEven {
    public static void main(String[] args) {
        System.out.println("number is " +oddOrEvenMethod(4));//print statement + argument is being set inside the statement
    }
    public  static String oddOrEvenMethod(int numberCheck){//oddOrEven method and passed parameters
        return (numberCheck%2==0)?"even":"odd";

    }

}
