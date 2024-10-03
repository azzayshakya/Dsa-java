public class ar4_linear_search {
    static void LinearS(int arr[] , int n, int target){
        for(int i =0;i<n;i++){
            if(arr[i]==target){
                System.out.println("elment found at index "+ i);
                return ;
            }

        }
        System.out.println("element is not available");
    }
    public static void main(String[] args) {
        int arr[]= {1,94,55,23,23,9};
        int n = arr.length;
        int target= 9;
        LinearS(arr,n,target);
    }
}
