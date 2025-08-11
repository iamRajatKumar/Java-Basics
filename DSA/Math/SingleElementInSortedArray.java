package Math;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int [] arr = {1, 1 , 2 , 3, 3, 4, 4, 5, 5, 6, 6 };
        int n = arr.length;
        int xor = 0;
        for(int i = 0; i<n; i++){
            xor = xor ^ arr[i];
        }
        System.out.println(xor);
    }
}
