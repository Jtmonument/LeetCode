/*  Given a fixed length array arr of integers, duplicate each occurrence of zero,
    shifting the remaining elements to the right.
    Note that elements beyond the length of the original array are not written.
    Do the above modifications to the input array in place, do not return anything from your function.

    Example 1:
        Input: [1,0,2,3,0,4,5,0]
        Output: null
        Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
    Example 2:
        Input: [1,2,3]
        Output: null
        Explanation: After calling your function, the input array is modified to: [1,2,3]
    Note:
        1 <= arr.length <= 10000
        0 <= arr[i] <= 9
* */
public class DuplicateZeros1089 {
    //Accepted Solutions Runtime Distribution: 0 ms beats 100% of java submissions
    //Accepted Solutions Runtime Distribution: 39.5 MB beats 0% of java submissions
    public void duplicateZeros(int[] arr) {
        int length = arr.length;
        int i = 0;
        for(int n : arr.clone()) {
            if(n == 0) {
                arr[i] = 0;
                if(i < length - 1) {
                    arr[++i] = 0;
                    i++;
                } else {
                    i++;
                }
            } else {
                arr[i++] = n;
            }
            if(i == length) {break;}
        }
    }
}
