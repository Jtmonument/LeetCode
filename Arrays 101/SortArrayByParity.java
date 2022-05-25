class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int odd_index = 0;
        int even = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] % 2 != 0) {
                odd_index = i;
                for(int j = i; j < A.length; j++) {
                    if(A[j] % 2 == 0) {
                        even = A[j];
                        A[j] = A[odd_index];
                        A[odd_index] = even;
                        break;
                    }
                }
            }
        }
        return A;
    }
}