package drafts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i = 0, j = 0; i < nums.length; i++) {
            if(nums[j] == nums[nums[j] - 1]) {
                if(j != nums[j] - 1){
                    nums[j] = 0;
                }
                j = i;
                if(nums[j] - 1 > -1) {
                    int temp = nums[nums[j] - 1];
                    nums[nums[j] - 1] = nums[j];
                    nums[j] = temp;
                }
                if(i + 1 == nums.length && nums[j] != nums.length) {
                    nums[j] = 0;
                }
            } else {
                int temp = nums[nums[j] - 1];
                nums[nums[j] - 1] = nums[j];
                nums[j] = temp;
            }
            if(nums[j] == 0) {
                j++;
            }
            System.out.println(Arrays.toString(nums));
        }
        List<Integer> missing = new ArrayList(Arrays.asList(nums));
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                missing.add(i + 1);
            }
        }
        return missing;
    }
}
