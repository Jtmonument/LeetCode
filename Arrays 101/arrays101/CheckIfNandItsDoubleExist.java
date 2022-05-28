package arrays101;

class CheckIfNandItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        int check = arr[0] * 2;
        for(int n = 0, m = 0; n < arr.length; m++) {
            if(m == arr.length) {
                m = 0;
                if(n != arr.length - 1) {
                    check = arr[++n] * 2;
                } else {
                    break;
                }
            }
            if(check == arr[m] && n != m) {
                return true;
            }
        }
        return false;
    }
}