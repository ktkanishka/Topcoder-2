package mergesort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by manoharprabhu on 14/7/16.
 */
public class Tests {

    @Test
    public void test1() {
        int[] numbers = new int[]{3,2,1,5,2,7,8};
        Assert.assertArrayEquals(new int[]{1,2,2,3,5,7,8}, MergeSort.sort(numbers));
    }

    @Test
    public void test2() {
        int[] numbers = new int[]{3};
        Assert.assertArrayEquals(new int[]{3}, MergeSort.sort(numbers));
    }

    @Test
    public void test3() {
        int[] numbers = new int[]{};
        Assert.assertArrayEquals(new int[]{}, MergeSort.sort(numbers));
    }

    @Test
    public void test4() {
        int[] numbers = new int[]{1,2,3,4,5};
        Assert.assertArrayEquals(new int[]{1,2,3,4,5}, MergeSort.sort(numbers));
    }

    @Test
    public void test5() {
        int[] numbers = new int[]{5,4,3,2,1};
        Assert.assertArrayEquals(new int[]{1,2,3,4,5}, MergeSort.sort(numbers));
    }

    @Test
    public void test6() {
        int[] numbers = new int[]{3, 2};
        Assert.assertArrayEquals(new int[]{2, 3}, MergeSort.sort(numbers));
    }

    @Test
    public void test7() {
        int[] numbers = new int[]{2, 3};
        Assert.assertArrayEquals(new int[]{2, 3}, MergeSort.sort(numbers));
    }
}
