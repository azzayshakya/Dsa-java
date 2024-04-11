public class appear_only_ones {
    static int AON(int arr [],int n){
        int count=0;
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(arr[j]==arr[i]){
                    count++;

                    System.out.println("the value "+arr[i]+" is coming at this time "+count);
                }
            }
            if(count==1){
                System.out.println("answer here ");
                return arr[i];
            }
            count=0;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,2,4,3,1};
        int n=arr.length;
        System.out.println(AON(arr,n));

    }
}
