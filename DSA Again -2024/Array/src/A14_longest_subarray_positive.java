import org.w3c.dom.ls.LSOutput;

public class A14_longest_subarray_positive {

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
       int arr[] ={-1, 1, 1,2,1,1,0,1};
       int target=1;
       int ans= (LongesSubarray(arr,target));
        System.out.println(ans);

    }
}
