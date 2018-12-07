package arrays;

import java.util.*;

public class ArraysAreFun {


    public Integer[] merge(Integer[] first, Integer[] second) {
        Integer[] merged = new Integer[first.length + second.length];
        for (int i = 0; i < first.length; i++) {
            merged[i] = first[i];
        }
        for (int j = first.length; j < first.length + second.length; j++) {
            merged[j] = second[j - first.length];
        }
        for (int k = 1; k < merged.length; k++) {
            if (merged[k - 1] > merged[k]) {
                Integer temp = merged[k - 1];
                merged[k - 1] = merged[k];
                merged[k] = temp;
            }
        }
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

    Integer[] array = {5, 6, 2, 4, 7, 9, 3, 5, 6};

    public Integer[] longestGrowingTrent(Integer[] array) {
        if (array.length == 0) {
            return null;
        }
        int longestStart = 0;
        int currentStart = 0;
        int longestLength = 1;
        int currentLength = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                currentLength++;
                if (currentLength > longestLength) {
                    longestStart = currentStart;
                    longestLength = currentLength;
                }
            } else {
                currentStart = i;
                currentLength = 1;
            }
        }
        Integer[] result = new Integer[longestLength];
        for (int i = 0; i < longestLength; i++) {
            result[i] = array[longestStart + i];
        }
        return result;
    }

}



