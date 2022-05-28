package misc;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = 0;
        int [] indices = new int[2];
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            indices[0] = i;
            for(int j = 0; j < nums.length; j++) {
                if(i == j) {continue;}
                if((sum + nums[j]) == target) {
                    indices[1] = j;
                    return indices;
                }
            }
            sum = 0;
            indices = new int[2];
        }
        return indices;
    }
}
