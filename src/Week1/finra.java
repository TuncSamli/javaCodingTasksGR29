package Week1;
public class finra {
    public static void main(String[] args) {
        FINRA(1,30);// stating arguments
    }
    public static void FINRA(int num1, int num2) { //FINRA method and passed parameters
        String rslt = "";// creating a string to collect result in the future

        for (int i = num1; i <= num2; i++) {//loop to iterate from num1 to num2 including
            if (i % 15 == 0) {// if a number equals to 15 a word "FINRA" will be printed
                rslt += "FINRA ";// collecting FINRA

            } else if (i % 5 == 0) {// if a number equals to 5 a word "FIN" will be printed

                rslt +="FIN ";//collecting FIN
            } else if (i%3  == 0){//if a number equals to 3 a word "RA" will be printed
                rslt+="RA ";//collecting RA

            }else{ //if no conditions above are not met it will return a number
                rslt+=i+" ";

            }
        }
        System.out.println(rslt);// printing result for user to observe

    }
}
