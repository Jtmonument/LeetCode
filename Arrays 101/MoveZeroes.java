class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int writePointer = 0;
        int zeroes = 0;
        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != 0) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            } else {zeroes++;}
        }
        for(int i = nums.length - 1; i != (nums.length  - 1)- zeroes; i--) {
            nums[i] = 0;
        }
    }
}