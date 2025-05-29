import java.util.*;

public class LogestConsecutiveBrute {

    // Corrected linear search
    public static boolean linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static int bruteApproach(int[] arr) {
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int count = 1;

            while (linearSearch(arr, current + 1)) {
                current += 1;
                count += 1;
            }

            maxLen = Math.max(maxLen, count);
        }

        return maxLen;
    }

        public static int  optimalApproach(int [] arr ) {

            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < arr.length; i++) {
                set.add(arr[i]);
            }
            int maxLen = 1;
//            itrate over the array
            for (int i = 0; i < arr.length; i++) {
                int num = arr[i];
                if (!set.contains(num - 1)) {
                    int currentNum = num;
                    int count = 1;
                    while (set.contains(currentNum + 1)) {
                        currentNum++;
                        count++;

                    }
                    if (count > maxLen) {
                        maxLen = count;
                    }
                }
            }
            return maxLen;

        }


        public static void main(String[] args) {

            int[] arr = {100, 200, 1, 3, 300, 2, 4, 400, 500, 600};
            int[] array = {100, 101, 1, 3, 300, 0, 4, 103, 500, 102,104};
            System.out.println("Longest consecutive sequence length brute force approach: " + bruteApproach(arr));
            System.out.println("Longest consecutive sequence length optimal approach: " + optimalApproach(array));
        }
    }
