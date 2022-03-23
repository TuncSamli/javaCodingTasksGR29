package Week5;

public class String_reverse {
    public static String StrReverse(String str) {

        String reverse="";

        for(int i=str.length()-1; i >= 0; i--) {
            reverse += str.toCharArray()[i];
        }
        return reverse;

    }
    public static String StrReverse2(String str) {

        String reverse="";

        for(int i=0; i < str.length(); i++) {
            reverse= str.toCharArray()[i]+reverse;
        }
        return reverse;

    }

    public static void main(String[] args) {
        System.out.println(StrReverse2("Olesia"));
    }
}

