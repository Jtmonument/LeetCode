package arraysandstrings;

public class LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        if(nums.length < 2)
            return 0;
        int[] indices = new int[]{-1,-1};
        for(int i = 0; i < nums.length; i++) {
            if(indices[0] == -1 || nums[i] > nums[indices[0]]) {
                if(indices[1] == -1 || nums[i] > nums[indices[1]]) {
                    indices[0] = indices[1];
                    indices[1] = i;
                    continue;
                }
                indices[0] = i;
            }
        }
        return nums[indices[1]] - nums[indices[0]] < nums[indices[0]] ? -1 : indices[1];
    }
}
