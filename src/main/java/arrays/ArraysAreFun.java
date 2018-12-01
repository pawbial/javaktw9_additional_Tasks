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
        TreeSet<Integer> sortedSet = new TreeSet<>(Arrays.asList(merged));
        merged = sortedSet.toArray(new Integer[0]);

        return merged;
    }

    public Integer[] reverse(Integer[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    public Integer[] roll(Integer[] array, int amount) {
        LinkedHashSet<Integer> rolledSet = new LinkedHashSet<>();
        Integer[] rolledArray = new Integer[array.length];
        for (int i = amount; i < array.length; i++) {
            rolledSet.add(array[i]);
        }
        for (int j = 0; j < amount; j++) {
            rolledSet.add(array[j]);
        }
        return rolledArray = rolledSet.toArray(new Integer[0]);

    }
    Integer [] array = {5,6,2,4,7,9,3,5,6};
    public Integer[] longestGrowingTrent(Integer[] array) {
        List <Integer> sequence = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    sequence.add(array[i]);
                    sequence.add(array[j]);
                }

            }

        }
        Integer [] result = sequence.toArray(new Integer[0]);
        return result;
    }
}
