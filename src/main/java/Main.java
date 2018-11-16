import arrays.ArraysAreFun;
import printing.PrintingIsFun;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        PrintingIsFun printingIsFun = new PrintingIsFun();

        printingIsFun.printRectangle(8, 3);

        System.out.println();

        printingIsFun.printTrianagle(13);

        System.out.println();

        printingIsFun.printTree(8);

        System.out.println();

        printingIsFun.printBox(6, 3);

        ArraysAreFun arraysAreFun = new ArraysAreFun();

        Integer[] first = {1, 4, 5};
        Integer[] second = {3, 5, 8};
        Integer[] toReverse = {3, 7, 2, 4};
        Integer[] toRoll = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(arraysAreFun.merge(first, second)));

        System.out.println();

        System.out.println(Arrays.toString(arraysAreFun.reverse(toReverse)));

        System.out.println();

        System.out.println(Arrays.toString(arraysAreFun.roll(toRoll, 4)));
    }
}
