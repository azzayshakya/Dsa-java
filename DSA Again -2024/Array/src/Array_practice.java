public class Array_practice {
    static void SLargest(int n, int arr[]){


        for(int i =0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("not sorted");

                return;
            }


        }
        System.out.println("array is sorted");
    }
    public static void main(String args[]){
        int arr[]={1,5,7,7,8,9};
        SLargest(arr.length,arr);
    }
}
