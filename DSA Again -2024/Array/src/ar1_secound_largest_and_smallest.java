public class ar1_secound_largest_and_smallest {
    static void ssmallest(int arr[] ,int n){
        int s=Integer.MAX_VALUE;
        int sS=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if(arr[i]<s){
                sS=s;
                s=arr[i];
            } else if (arr[i]<sS && arr[i]!=s) {
                sS=arr[i];
            }
        }
        System.out.println("the lowest value is "+ s);
        System.out.println("and the secound smallest value is this " + sS);
    }

    static void slargest(int arr[] ,int n ){
         int l=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;
        for(int i =0;i<n; i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];

            } else if (arr[i]>sl && arr[i]!=l) {
                sl=arr[i];

            }
        }
        System.out.println("the largest value is "+ l);
        System.out.println("and the secound largest value is this " + sl);

    }

    public static  void main(String[] args) {
        int arr[]= {8,5,1,7,7,3,6};
        int n=arr.length;
        ssmallest(arr,n);
        slargest(arr,n);

    }
}
