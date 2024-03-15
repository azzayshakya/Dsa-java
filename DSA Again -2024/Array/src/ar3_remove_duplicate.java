public class ar3_remove_duplicate {
    static void RemoveDuplicate(int arr[] ,int n){
        int i =0;
        for(int j=0;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        System.out.println(i+1);
        for (int k=0;k<i;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("ajay");
        int arr[]={1,3,3,4,5,5,5,5,6,9,9};
        int n =arr.length;
        RemoveDuplicate(arr,n);
    }
}