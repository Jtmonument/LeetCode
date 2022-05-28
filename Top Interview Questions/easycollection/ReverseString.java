package easycollection;

public class ReverseString {
    public void reverseString(char[] s) {
        char temp;
        for(int i = s.length - 1, j = 0; i >= s.length / 2; i--, j++) {
            temp = s[j];
            s[j] = s[i];
            s[i] = temp;
        }
    }
}
