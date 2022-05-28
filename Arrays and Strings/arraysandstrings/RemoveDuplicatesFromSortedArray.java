package arraysandstrings;

class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) {return 0;}
        if(nums.length == 1) {return 1;}
        if(nums.length == 2) {return nums[0] != nums[1] ? 2 : 1;}
        int compare = nums[0];
        int index = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != compare && nums[i] != nums[index - 1]) {
                nums[index] = nums[i];
                index++;
                if(i == nums.length - 1){break;}
                compare = nums[index];
            } else if(nums[i] == compare && nums[i] != nums[index - 1]) {
                index++;
            }
        }
        return index;
    }
}