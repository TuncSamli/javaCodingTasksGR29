package Week2;
public class divisionWithoutOperator {
    public static void division(int a,int b) {
        if(b==0){
            System.out.println("Divider cannot be 0");
            return;
        }
        int count=0;
        while(a>=b){
            a-=b;
            count++;
        }
        System.out.println(count);
    }
}
