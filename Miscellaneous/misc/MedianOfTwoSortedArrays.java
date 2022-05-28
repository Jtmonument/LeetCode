package misc;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mid;
        int[] newArray;
        {int size1 = nums1.length;
            int size2 = nums2.length;
            mid = (size1 + size2) / 2;
            newArray = new int[size1 + size2];
            System.arraycopy(nums1, 0, newArray, 0, size1);
            System.arraycopy(nums2, 0, newArray, size1, size2);}
        Arrays.sort(newArray);
        if(newArray.length % 2 != 0) {
            return newArray[mid];
        } else {
            return (newArray[mid] + newArray[mid - 1]) / 2.0;
        }
    }
}
