package Week1;
public class finra {
    public static void finra(int a) {
        for (int i = 1; i < a; i++) {

            if (i % 15 == 0) {
                System.out.println("FinRA");
            } else if (i % 3 == 0) {
                System.out.println("Fin");
            } else if (i % 5 == 0) {
                System.out.println("Ra");
            } else {
                System.out.println(i);
            }
        }
    }
}
