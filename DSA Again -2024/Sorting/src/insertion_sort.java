public class insertion_sort {
    static void InsertionSort(int arr[] , int n){
        for(int i =0;i<n;i++){
            for(int j =0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            for (int k=0; k<n;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();


        }
        System.out.println("final sort");
        for (int k=0; k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1, 3, 2,4, 0};
        int n= arr.length;
        InsertionSort(arr,n);
    }

}
