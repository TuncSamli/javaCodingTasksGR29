package Week1;
public class swapTwoNumbers {
    public static void main(String[] args) {
        Numbers(1,2);// declaring arguments
    }
    public static void Numbers(int num1, int num2){//passing parameters into method
       num2=num2+num1; // adding both numbers  2+1=3
       num1=num2-num1; // subtracting          3-1=2 (1st number) swap result
       num2=num2-num1; // subtracting          3-2=1 (2nd number) swap result
        System.out.println("num 1 = " +num1 + " num 2 = " + num2);//printing output
    }
}
