import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ar21 {
    static List<List<Integer>> threesum(int arr[],int n){
        List<List<Integer>> ans =new  ArrayList<>();

        Arrays.sort(arr);
        for(int i =0;i<n;i++ ){
            if(i != 0 && arr[i]==arr[i-1]){
                continue;
            }

            int j=i+1;
            int k=n-1;
            while (j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum>0){
                    k--;


                }
                if(sum<0){
                    j++;
                }
                if(sum==0){
                    List<Integer> temp= Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(temp);
                    k--;
                    j++;
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
            }



        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;

        List<List<Integer>> ans = threesum( arr,n);
        for (int j = 0; j < ans.size(); j++) {
            List<Integer> it = ans.get(j);
            System.out.print("[");
            for (int k = 0; k < it.size(); k++) {
                Integer i = it.get(k);
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();




    }
}
