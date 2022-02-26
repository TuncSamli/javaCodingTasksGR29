package Week1;

public class finra {
    public static void main(String[] args) {

        FINRA(1, 30);

    }

    public static void FINRA(int num1, int num2) {

        for (int i = 1; i < 30; i++) {

            //numbers which are a multiple of both 3 and 5,print "FINRA" instead of the number.
            if (i % 15 == 0) {
                System.out.print("FINRA ");

                //numbers which are a multiple of 5, print "RA" instead of the number.
            } else if (i % 5 == 0) {
                System.out.print("RA ");

                //numbers which are a multiple of 3  print "FIN" instead of the number
            } else if (i % 3 == 0) {
                System.out.print("FIN ");

            } else {
                System.out.print(i + " ");
            }
        }
    }
}



/*FINRA :
Write a method which prints out the numbers from 1 to 30 but for
numbers which are a multiple of 3  print "FIN" instead of the number
and for numbers which are a multiple of 5, print "RA" instead of the number.
for numbers which are a multiple of both 3 and 5,print "FINRA" instead of the number.

 */