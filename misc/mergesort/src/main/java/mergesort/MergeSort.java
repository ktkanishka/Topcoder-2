package mergesort;

import java.util.Arrays;
import java.util.List;

/**
 * Created by manoharprabhu on 14/7/16.
 */
public class MergeSort {
    public static int[] sort(int[] numbers) {
        int[] result = mergeSort(numbers);
        return result;
    }

    private static int[] mergeSort(int[] numbers) {
        if(numbers.length <= 1)
            return numbers;

        int[] left = copyFromTo(numbers, 0, (numbers.length / 2) - 1);
        int[] right = copyFromTo(numbers, (numbers.length / 2), numbers.length - 1);
        left = mergeSort(left);
        right = mergeSort(right);
        int[] result = merge(left, right);
        return result;
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int currentIndex = 0, leftIndex = 0, rightIndex = 0;
        while(true) {
            if(leftIndex >= left.length || rightIndex >= right.length) {
                break;
            }
            if (left[leftIndex] <= right[rightIndex]) {
                result[currentIndex++] = left[leftIndex++];
            } else {
                result[currentIndex++] = right[rightIndex++];
            }
        }
        if(leftIndex >= left.length) {
            //copy right
             while(rightIndex < right.length) {
                 result[currentIndex++] = right[rightIndex++];
             }
        } else {
            //copy right
            while(leftIndex < left.length) {
                result[currentIndex++] = left[leftIndex++];
            }
        }
        return result;
    }

    private static void printArray(int[] numbers) {
        for(int i=0; i < numbers.length; i++)
            System.out.print(numbers[i] + ", ");

        System.out.println();
    }

    private static int[] copyFromTo(int[] numbers, int fromIndex, int toIndex) {
        int[] result = new int[toIndex - fromIndex + 1];
        int counter = 0;
        for(int i = fromIndex; i <= toIndex; i++){
            result[counter++] = numbers[i];
        }
        return result;
    }
}
