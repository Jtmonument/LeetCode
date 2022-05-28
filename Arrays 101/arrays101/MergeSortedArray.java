package arrays101;

import java.util.Arrays;
class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m, j = 0; i < nums1.length; i++)
            nums1[i] = nums2[j++];
        Arrays.sort(nums1);
    }
}