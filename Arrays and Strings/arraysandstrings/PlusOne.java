package arraysandstrings;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        if(digits[len - 1] != 9) {
            digits[len - 1]+=1;
            return digits;
        }
        digits[len - 1] = 0;
        for(int i = len - 2; i >= 0; i--) {
            if(digits[i] != 9) {
                digits[i]+=1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNum = new int[len + 1];
        System.arraycopy(digits, 0, newNum, 1, len);
        newNum[0] = 1;
        return newNum;
    }
}
