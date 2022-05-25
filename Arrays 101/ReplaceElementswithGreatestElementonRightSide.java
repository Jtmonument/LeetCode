class ReplaceElementswithGreatestElementonRightSide {
    public int[] replaceElements(int[] arr) {
        if(arr.length == 1) {return new int[]{-1};}
        for(int i = 1, j = 0; i < arr.length;) {
            if(i != arr.length && i != 0 && arr[--i] < arr[i + 1]) {
                arr[i] = arr[i + 1];
                arr[i + 1] = -1;
                j = i - 1;
                while(j != -1 && arr[j] < arr[i]) {
                    arr[j--] = arr[i];
                }
            } else if(i == arr.length) {
                break;
            } else {
                i+=2;
            }
        }
        return arr;
    }
}