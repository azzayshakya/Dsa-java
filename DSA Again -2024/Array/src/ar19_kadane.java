public class ar19_kadane {
    static int kadane(int arr[] ,int n){
//        int ans=Integer.MIN_VALUE;
//        for(int i=0; i<n;i++){
//            for(int j=i ; j<n;j++){
//                int sum=0;
//                for(int k=i;k<=j;k++){
//                    sum+=arr[k];
//                }
//                ans= Math.max(sum,ans);
//            }
//        }
//        return ans;
        int maxi = Integer.MIN_VALUE; // maximum sum
        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;

        return maxi;
    }

    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;
        System.out.println(kadane(arr,n));
    }
}
