import java.util.Arrays;
/*
* Runtime beats 100% of Java submissions
* Memory usage beats 95.28% of Java submissions
* */

class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int NEGATIVE_INFINITY = Integer.MIN_VALUE;
        int[] maxNums = new int[3];
        Arrays.fill(maxNums, NEGATIVE_INFINITY);
        int hasNegativeInfinity = 0;
        for(int num : nums) {
            hasNegativeInfinity = num == NEGATIVE_INFINITY ?
                    hasNegativeInfinity + 1 : hasNegativeInfinity;
            if(num > maxNums[2]) {
                if(num > maxNums[1]) {
                    if(num > maxNums[0]) {
                        maxNums[2] = maxNums[1];
                        maxNums[1] = maxNums[0];
                        maxNums[0] = num;
                        continue;
                    }
                    if(num == maxNums[0])
                        continue;
                    maxNums[2] = maxNums[1];
                    maxNums[1] = num;
                    continue;
                }
                if(num == maxNums[1])
                    continue;
                maxNums[2] = num;
            }
        }
        return maxNums[1] == NEGATIVE_INFINITY ? maxNums[0] :
                maxNums[2] != NEGATIVE_INFINITY || hasNegativeInfinity > 0 ? maxNums[2] : maxNums[0];
    }
}