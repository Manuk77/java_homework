package string.string2;

public class Main {

    /**
     * bonus exercise
     * mores Alphabet converts the given string to the morse alphabet
     * @param string
     */
    public void morseAlphabet(String string){
        if(string.equals("")){
            System.out.println("the given string is empty");
            return;
        }
        StringBuilder strB = new StringBuilder();

        for(int i = 0; i < string.length(); ++i){
            switch (string.charAt(i)){
                case 'a':
                case 'A':
                    strB.append("._ ");
                    break;
                case 'b':
                case 'B':
                    strB.append("_... ");
                    break;
                case 'c':
                case 'C':
                    strB.append("_._. ");
                    break;
                case 'd':
                case 'D':
                    strB.append("_.. ");
                    break;
                case 'e':
                case 'E':
                    strB.append(". ");
                    break;
                case 'f':
                case 'F':
                    strB.append(".._. ");
                    break;
                case 'g':
                case 'G':
                    strB.append("__. ");
                    break;
                case 'h':
                case 'H':
                    strB.append(".... ");
                    break;
                case 'i':
                case 'I':
                    strB.append(".. ");
                    break;
                case 'j':
                case 'J':
                    strB.append(".___ ");
                    break;
                case 'k':
                case 'K':
                    strB.append("_._ ");
                    break;
                case 'l':
                case 'L':
                    strB.append("._.. ");
                    break;
                case 'm':
                case 'M':
                    strB.append("__ ");
                    break;
                case 'n':
                case 'N':
                    strB.append("_. ");
                    break;
                case 'o':
                case 'O':
                    strB.append("___ ");
                    break;
                case 'p':
                case 'P':
                    strB.append(".__. ");
                    break;
                case 'q':
                case 'Q':
                    strB.append("__._ ");
                    break;
                case 'r':
                case 'R':
                    strB.append("._. ");
                    break;
                case 's':
                case 'S':
                    strB.append("... ");
                    break;
                case 't':
                case 'T':
                    strB.append("_ ");
                    break;
                case 'u':
                case 'U':
                    strB.append(".._ ");
                    break;
                case 'v':
                case 'V':
                    strB.append("..._ ");
                    break;
                case 'w':
                case 'W':
                    strB.append(".__ ");
                    break;
                case 'x':
                case 'X':
                    strB.append("_.._ ");
                    break;
                case 'y':
                case 'Y':
                    strB.append("_.__ ");
                    break;
                case 'z':
                case 'Z':
                    strB.append("__.. ");
                    break;
                default:
                    strB.append(string.charAt(i));

            }
        }
        System.out.println(strB);
    }

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
        System.out.println(ob.palindrome("abccba"));
        //System.out.println(ob.returnsList(str));


    }
}
