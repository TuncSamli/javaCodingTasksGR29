package Week3;

public class ArmstrongNumbers {
    public static void main(String []args){
    armStrongNum(153);
}

    public static void armStrongNum(int num) {
        int remainder,sum=0, temp = num;
        while (temp!= 0) {
            remainder = temp % 10;
            sum = sum + (remainder*remainder*remainder);
            temp /=  10;
        }
        if(sum==num){
            System.out.println(num + " is an armstrong number");
        }else{
            System.out.println(num + " is not an armstrong number");
        }
    }
}


