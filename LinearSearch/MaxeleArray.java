package LinearSearch;

public class MaxeleArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int result = Maxele(arr);
        System.out.println("Maximum is: " + result);
    }
    public static int Maxele(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
