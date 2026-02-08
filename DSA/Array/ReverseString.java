package DSA.array;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(s); // Output: "olleh"
    }

    private static void reverseString(char[] s) {
       int low = 0, high = s.length - 1;
         while (low < high) {
              char temp = s[low];
              s[low] = s[high];
              s[high] = temp;
              low++;
              high--;
         }
    }
}
