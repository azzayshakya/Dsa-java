import java.util.ArrayList;
import java.util.Arrays;

public class a_17_2sum {
    static ArrayList<Integer> twosum(int arr[],int target){
        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                ans.add(arr[left]);
                ans.add(arr[right]);
                return ans;
            }
            if(sum<target){
                left++;
            }
            if(sum>target){
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,6,4,2,8,43};
        int target=47;
        System.out.println(twosum(arr,target));
    }
}
