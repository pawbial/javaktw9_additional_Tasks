package strings;

import java.util.stream.Stream;

public class StringsAreFun {

    public boolean isPalindrome(String someString) {
        if (someString.length() % 2 != 0) {
            return false;
        }
       String firstHalf = someString.substring(0,someString.length() / 2);
       String secondHalf = someString.substring((someString.length() / 2), someString.length());
       StringBuilder reversed = new StringBuilder(secondHalf);
       reversed.reverse();

       if (firstHalf.equals(reversed.toString())) {
           return true;
       }
       else return false;
    }
}
