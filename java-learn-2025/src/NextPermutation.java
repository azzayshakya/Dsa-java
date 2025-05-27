import java.util.Arrays;

public class NextPermutation {
    public static int[] nextPermutation(int[] arr) {
        int startInd = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                startInd = i;
                break;
            }
        }

        if (startInd == -1) {
            reverse(arr, 0, arr.length - 1);
            return arr;
        }

        for (int j = arr.length - 1; j > startInd; j--) {
            if (arr[j] > arr[startInd]) {
                int temp = arr[startInd];
                arr[startInd] = arr[j];
                arr[j] = temp;
                break;
            }
        }

        reverse(arr, startInd + 1, arr.length - 1);

        return arr;
    }

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        nextPermutation(arr);
        System.out.println("Next permutation: " + Arrays.toString(arr));
    }
}
