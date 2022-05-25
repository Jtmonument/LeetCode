class ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        if(A.length < 3) {return false;}
        boolean increasing = A[1] > A[0];
        for(int i = 1; i < A.length; i++) {
            if(i == 1 && increasing == false) {return false;}
            if(increasing && A[i] > A[i - 1]) {
                continue;
            } else if(A[i] < A[i - 1]) {
                increasing = false;
                continue;
            } else {
                return false;
            }
        }
        return !increasing;
    }
}