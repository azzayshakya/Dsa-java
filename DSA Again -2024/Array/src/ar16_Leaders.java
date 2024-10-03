import java.util.ArrayList;

public class ar16_Leaders {
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> ans =new  ArrayList<>();
        int cmax=Integer.MIN_VALUE;
        for(int i =n-1;i>=0;i--){
            boolean flag = false;
            if(arr[i]>cmax){
                ans.add(arr[i]);
                cmax=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={10, 22, 12, 3, 0, 6};
        System.out.println(
                leaders(arr,arr.length)
        );
    }
}
