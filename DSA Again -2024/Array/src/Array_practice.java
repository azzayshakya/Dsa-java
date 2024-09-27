public class Array_practice {
    static void RemoveDuplicate(int n, int arr[]){
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]!=arr[j]){
                    arr[k]=arr[i];
                    k++;
                }
//                if(arr[i]==arr[j]){
//
//                }
            }
        }
////        System.out.println(i+1);
        for(int x=0;x<k;x++){
            System.out.print(arr[k]+" ");
        }

    }
    public static void main(String args[]){
        int arr[]={1,1,5,7,7,8,9};
        RemoveDuplicate(arr.length,arr);
    }
}
