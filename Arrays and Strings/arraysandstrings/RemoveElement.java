package arraysandstrings;

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        for(int i = 0, j = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                nums[j] = 0;
                length--;
            } else {
                nums[j++] = nums[i];
            }
        }
        return length;
    }
}