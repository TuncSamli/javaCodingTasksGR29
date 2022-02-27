package Week1;
public class swapTwoNumbers {
    public static void swapTwoNumbers(int x,int y)
    {
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swap:"
                + " x = " + x + ", y = " + y);
    }
    }

