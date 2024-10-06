import java.util.*;
public class Array_practice {
    static void threeSum(int n,int target, int arr[]){
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==0){
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
                if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        for (int j = 0; j < ans.size(); j++) {
            List<Integer> it = ans.get(j);
            System.out.print("[");
            for (int k = 0; k < it.size(); k++) {
                Integer i = it.get(k);
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
    }
    public static void main(String args[]){
        int arr[]={-1, 0, 1, 2, -1, -4};
        int target=9;
        threeSum(arr.length,target,arr);
    }
}
