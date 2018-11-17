package strings;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;
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

    public int countOccurences (String string, String occurency) {
        return StringUtils.countMatches(string, occurency);
    }

    public String rot13 (String someString) {
        char [] initialString = someString.toCharArray();
        for (int i = 0; i < initialString.length; i++) {
            initialString[i] += 13;
        }
        return Arrays.toString(initialString);
    }
}
