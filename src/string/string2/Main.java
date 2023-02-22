package string.string2;

public class Main {

   
    /**
     * ex.1
     * prints first two letters if th firs is "o" and the second is "z"
     * @param string
     */
    public void printsFirsTwoLetters(String string){

        if(string.equals("")){
            System.out.println("the given string is empty");
            return;
        }
        StringBuilder strB = new StringBuilder();
        if(string.charAt(0) == 'o'){
            strB.append(string.charAt(0));
            if(string.charAt(1) == 'z'){
                strB.append(string.charAt(1));
            }else{
                System.out.println("the second char is not equal to 'z'");
                return;
            }



        }else {
            System.out.println("the given strings first char is not equal to 'o'");
            return;
        }
        System.out.println(strB);

    }

    /**
     * ex.3
     * the method returns true if the given string is palindrome, if it's not returns false
     * @param string
     * @return
     */
    public boolean palindrome(String string){
        if(string.equals("")){
            System.out.println("the given string is empty");
            return false;
        }

        for(int i = 0, j = string.length() - 1; i < string.length() / 2; ++i, --j){
            if(string.charAt(i) != string.charAt(j)){
                return false;
            }
        }
        return true;
    }

    /**
     * ex.4
     * if the first letter starts with 'a' and the length of the string is equal to 3 returns it
     * @param str
     * @return StringBuilder strB
     */
    public StringBuilder  returnsList(String[] str){

        StringBuilder strB = new StringBuilder();
        if(str.length == 0){
            System.out.println("the given string[] is empty");
            return strB;
        }

        for(int i = 0; i < str.length; ++i){

            if(str[i].charAt(0) == 'a' && str[i].length() == 3){
                    strB.append(str[i] + "\n");
            }

        }
        return strB;
    }




    public static void main(String[] args){

        Main ob = new Main();
        //String[] str = {"acs", "acvf", "dsff", "axd"};
        //ob.morseAlphabet("java academic program");
        //ob.printsFirsTwoLetters("");
        //System.out.println(ob.palindrome("abccba"));
        //System.out.println(ob.returnsList(str));


    }
}
