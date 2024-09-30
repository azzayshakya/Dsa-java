public class ar5_left_rotate_by_one_place {
    static public void  left_rotate_by_one(int arr[],int n){
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;

//        for(int i=1;i<n;i++) {
//            int temp = arr[i];
//            arr[i]=arr[i-1];
//            arr[i-1]=temp;
//        }

        for (int k=0;k<n;k++ ){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("hy");
        int arr[]={2,4,62,6,9,1};
        int n =arr.length;
        left_rotate_by_one(arr,n);
    }
}
