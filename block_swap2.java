public class block_swap2 {
    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14, 15};
        int d = 2;
        int n = arr.length;

        // Rotate the array
        leftRotate(arr, d, n);

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void leftRotate(int[] arr, int d, int n) {
        // Create a temporary array to store the elements to be rotated
        int[] temp = new int[d];

        // Store the first 'd' elements in the temporary array
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Shift the remaining elements to the left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Copy the elements from the temporary array to the end of the original array
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }
}
