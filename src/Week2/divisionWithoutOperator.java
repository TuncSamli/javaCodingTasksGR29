package Week2;
public class divisionWithoutOperator {
    public static void main(String[] args) {
        divisionWOOperatorMethod(100,5);// passing arguments into called method
    }
    public static void divisionWOOperatorMethod(int parNum1, int parNum2) {// passing parameters
         int count = 0;// declaring a variable that in the future will be served as a counter


            try {// try block is established to prevent division by 0

               if  (parNum1<=0||parNum2<=0)// condition to state that parNum1 or parNum2 are not equal to zero
                   throw new ArithmeticException(); // creating exception object

            }catch(ArithmeticException e){// compiler will execute catch block ONLY if try block confirms that one of the passed numbers are equal to zero
                System.err.println(e+ " Invalid number, start over"); ;// print of an error for user to see info about wrong input
        }

            while (parNum1 >= parNum2) { // while block is to serve AS LONG AS any parNum1 more or equal parNum2 will get executed
           parNum1 = parNum1 - parNum2;// subtraction
            count++;    //counts parNum1-parNum2 executed which acts as a division method where "/" is not used
        }
        System.out.println(count);// printing output for user to observe
         }
}
