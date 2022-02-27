package Week2;

public class print_consecutive_Numbers {
    public static void consecutiveNums(int num){
        for (int i = 1; i <num ; i++) {
            if(i%2==0&&i%3==0&&i%5==0){
                System.out.println("CodilityTestCoders");
            }else if(i%2==0&&i%5==0){
                System.out.println("CodilityCoders");
            }else if(i%2==0){
                System.out.println("Codility");
            }else if(i%3==0&&i%5==0){
                System.out.println("TestCoders");
            }else if(i%3==0){
                System.out.println("Test");
            }else if(i%5==0){
                System.out.println("Coders");
            }else
                System.out.println(i);
        }
    }

}
/*
Write a function:
that, given a positive integer N, prints the numbers_Print_consecutive_Numbers numbers from 1 to N, each on a separate
line. However, any numner divisible by 2, 3 or 5 should oe replaced ny the worn Codility, Test or
Coders respectively. If a number is divisible Dy more than one of the numbers: 2.3 or 5, it should
be replaced by a concatenation of the respective words Codility, Test and Coders in this given
order. For example, numbers divisible by Doth 2 and 3 should be replace by CodilityTest and
numbers divisible by all three numbers: 2.3 and 5, shouIcl be replaced by CodilityTestCoders.

For ex.ample. here is the output for N — 24:

1
Codility
Test
Codility
 Coders
 CodilityTest
7
Codility
Test
Codi1ityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
17
 */