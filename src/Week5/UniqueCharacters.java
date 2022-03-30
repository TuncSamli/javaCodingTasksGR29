package Week5;


public class UniqueCharacters {
    public static void main(String[] args) {
            String str = "AAABBBCCDEF";//given string
            String result = "";//collected final result
            for (int i = 0; i < str.length(); i++) {
                int freq = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        freq++;
                    }
                }
                if (freq == 1) {
                    result += str.charAt(i);
                }

            }       System.out.println(result);
        }

    }








