public class ar2_sorted_array_or_not {
    static private void Csorted(int arr[] ,int n){
        for(int i =0;i<n-1;i++){
            if(arr[i+1]<arr[i]){
                System.out.println("array is not sorted ");
                return;
            }
        }
        System.out.println("array is sorted");
    }
    public static void main(String[] args) {
        System.out.println("heyyy");
        int arr[] = {4,7,8,8,9,4};
        int n =arr.length;
        Csorted(arr,n);
    }
}
