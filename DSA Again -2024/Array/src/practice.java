public class practice {
    static void RemoveDuplicate(int n, int arr[],int m) {
        for(int i=1;i<n;i++) {
//            arr[i-1]=arr[i];

            int temp = arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;

        }

        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }


    }
    public static void main(String args[]){
        int arr[]={1,5,7,8,9};
        RemoveDuplicate(arr.length,arr,8);
    }
}
