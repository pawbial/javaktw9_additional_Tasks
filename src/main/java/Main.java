import arrays.ArraysAreFun;
import printing.PrintingIsFun;
import strings.StringsAreFun;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        PrintingIsFun printingIsFun = new PrintingIsFun();

        System.out.println("printRectangle");
        printingIsFun.printRectangle(8, 3);

        System.out.println();

        System.out.println("printTrianagle");
        printingIsFun.printTrianagle(13);

        System.out.println();

        System.out.println("printTree");
        printingIsFun.printTree(8);

        System.out.println();

        System.out.println("printBox");
        printingIsFun.printBox(6, 3);

        System.out.println();

        ArraysAreFun arraysAreFun = new ArraysAreFun();

        Integer[] first = {1, 4, 5};
        Integer[] second = {3, 5, 8};
        Integer[] toReverse = {3, 7, 2, 4};
        Integer[] toRoll = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        Integer [] array = {5,6,2,4,7,9,3,5,6};

        System.out.println("merge" + Arrays.toString(arraysAreFun.merge(first, second)));

        System.out.println();

        System.out.println("reverse" + Arrays.toString(arraysAreFun.reverse(toReverse)));

        System.out.println();

        System.out.println("roll" + Arrays.toString(arraysAreFun.roll(toRoll, 4)));

        System.out.println();

        System.out.println("sequence" + Arrays.toString(arraysAreFun.longestGrowingTrent(array)));

        StringsAreFun stringsAreFun = new StringsAreFun();

        System.out.println("isPalindrome String " + stringsAreFun.isPalindrome("abccba"));

        System.out.println();

        System.out.println("countOccurences " + stringsAreFun.countOccurences("Lorem ipsum dolorrrrrrrr sit amet", "or"));

        System.out.println();

        System.out.println("ROT13 " + stringsAreFun.rot13("xyz"));

        String x = "abc";
        String coded = stringsAreFun.rot13(x);
        System.out.println(coded);
        String decoded = stringsAreFun.decodeROT13(coded);
        System.out.println(decoded);
    }
}

