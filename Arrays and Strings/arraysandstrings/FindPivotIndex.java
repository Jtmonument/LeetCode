package arraysandstrings;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        if (nums.length < 3) {return -1;}
        int left = nums[0];
        int right = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                right += nums[j];
            }
            if(left == right) {return i;}
            right = 0;
            if(i + 1 == nums.length) {break;}
            left += nums[i + 1];
        }
        return -1;
    }
}
