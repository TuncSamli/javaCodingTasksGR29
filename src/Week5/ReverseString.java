package Week5;

public class ReverseString {
    public static void main(String[] args) {
//        String str = "ABDS";
//        String result = "";
//        for (int i = str.length()-1; i >=0 ; i--) {
//            result+=str.charAt(i)+" ";
//        }
//        System.out.println(result);
//    }
    String str = "Name", nstr = ""; // understand null mind.
    char ch; // character travesing

        System.out.print("word: ");
        System.out.println("Name"); //Example word x +=1 math rule 0 = 0 +1 //

        for (int i = 0; i < str.length(); i++) {
        ch = str.charAt(i); //extracts each
        nstr = ch + nstr; //adds each character  in front of the existing string // word x +=1 math rule 0 = 0 +1 //
    }
        System.out.println("Reverse your name: " + nstr);
    }
}
