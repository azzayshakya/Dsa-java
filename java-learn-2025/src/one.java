import com.sun.tools.jconsole.JConsoleContext;

public class one{

        public static int maxSubArraySum(int[] arr) {
            int max = Integer.MIN_VALUE;
            int sum = 0;

            int start = 0;
            int tempStart = 0;
            int end = 0;

            for (int i = 0; i < arr.length; i++) {

                sum += arr[i];

                if (sum > max) {
                    max = sum;
                    start = tempStart;
                    end = i;
                    System.out.println("start " + start +" tempStart "+tempStart + " end "+ end);
                }

                if (sum < 0) {
                    sum = 0;
                    tempStart = i + 1;
                }
            }

            // Print the subarray
            System.out.print("Subarray: ");
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            return max;
        }

        public static void main(String[] args){
            System.out.println("ajay");
            int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            int result = maxSubArraySum(nums);
            System.out.println("Maximum subarray sum: " + result);
        }

    }