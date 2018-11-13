package arrays;

import java.util.*;
import java.util.stream.Stream;

public class ArraysAreFun {


    public Integer[] merge(Integer[] first, Integer[] second) {
        Integer[] merged = new Integer[first.length + second.length];
        for (int i = 0; i < first.length; i++) {
            merged[i] = first[i];
        }
        for (int j = first.length; j < first.length + second.length; j++) {
            merged[j] = second[j - first.length];
        }
        TreeSet<Integer> sortedSet = new TreeSet<Integer>();
        sortedSet.addAll(Arrays.asList(merged));
        merged = sortedSet.toArray(new Integer[0]);

        return merged;
    }

    Integer[] reverse(Integer[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }


    public static void main(String[] args) {


        ArraysAreFun arraysAreFun = new ArraysAreFun();

        Integer[] first = {1, 4, 5};
        Integer[] second = {3, 5, 8};
        Integer[] toReverse = {3, 7, 2, 4};

        System.out.println(Arrays.toString(arraysAreFun.merge(first, second)));

        System.out.println();


        System.out.println(Arrays.toString(arraysAreFun.reverse(toReverse)));

    }
}
