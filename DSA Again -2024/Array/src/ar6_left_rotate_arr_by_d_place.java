public class ar6_left_rotate_arr_by_d_place {
    static void LeftRotateByDPlace(int n, int arr[], int D) {
        for(int k=0;k<D;k++){
            for(int i =0;i<n-1;i++){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int j=0;j<n;j++) {
            System.out.print(arr[j] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,5,7,8,9};
        int Dpalce=4;
        LeftRotateByDPlace(arr.length,arr,Dpalce);

    }
}

//    static public void  left_rotate_by_one(int arr[],int n){
//        int temp=arr[0];
//        for(int i=1;i<n;i++){
//            arr[i-1]=arr[i];
//        }
//        arr[n-1]=temp;
//        for (int k=0;k<n;k++ ){
//            System.out.print(arr[k]+" ");
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println("hy");
//        int arr[]={2,4,62,6,9,1};
//        int n =arr.length;
//        left_rotate_by_one(arr,n);
//    }
//}
