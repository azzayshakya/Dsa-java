public class ar_11_missing_element {
    static void missingElement(int arr[],int n){
        int sum=0;
        for(int i =0;i<n-1;i++){
            sum+=arr[i];

        }

        System.out.println(n);
        int total=(n*(n+1))/2;
        System.out.println(total);
        int missing=total-sum;
        System.out.println(missing);


    }
    public static void main(String args[]){
        System.out.println();
        int arr[]={1,2,3,5,6,7};
        missingElement(arr,arr.length);
    }

}
