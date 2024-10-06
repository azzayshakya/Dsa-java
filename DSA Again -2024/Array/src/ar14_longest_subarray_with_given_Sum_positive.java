import org.w3c.dom.ls.LSOutput;

public class ar14_longest_subarray_with_given_Sum_positive {

    static int LongesSubarray(int arr[] ,int target){
        int n =arr.length;
        int len=0;
        for(int i =0;i<n;i++){
            int s=0;
            for(int j=i;j<n;j++) {
                s += arr[j];

                if(s==target){
                    len = Math.max(len, j - i +1);

                }

            }

        }
        return len;
    }
    public static void main(String[] args) {
       int arr[] ={1,5,5,2,3,5,10,1,9};
       int target=13;
       int ans= (LongesSubarray(arr,target));
        System.out.println(ans);

    }
}
