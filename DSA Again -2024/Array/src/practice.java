public class practice {
    static void LeftRotateByDPlace(int n, int arr[], int D) {
        for(int k=0;k<D;k++){
            for(int i =0;i<n-1;i++){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
//            type -2
//            for(int k=0;k<D;k++){
//                int temp=arr[0];
//                for(int i =1;i<n;i++){
//                    arr[i-1]=arr[i];
//                }
//                arr[n-1]=temp;
//            }
        }
        for(int j=0;j<n;j++) {
            System.out.print(arr[j] + " ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,5,7,8,9};
        int Dpalce=4;
        LeftRotateByDPlace(arr.length,arr,Dpalce);
    }
}
