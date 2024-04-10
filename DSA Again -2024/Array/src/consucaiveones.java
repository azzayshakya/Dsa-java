public class consucaiveones {
    public static void  most_consecutive_ones (int arr[], int n){
        int count = 0;
        int maxcount=0;
        for(int i =0;i<n;i++){

            if(arr[i]==1){
                count++;
            }
            if(arr[i]!=1 && count>maxcount){
                maxcount=count;
                count=0;
                System.out.println("value of last"+ count);
            }
            System.out.println();
        }
//        System.out.println("last is "+ first);
//        if(first<last){
//            System.out.println(last);
//        }
//        if(first>last) {
//            System.out.println(first);
//        }
    }


    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,0,1,1,1,1,1,0};
//        int arr[]={1,1,0,1,1,0,1,1,1,1,1,0,0,1,1};

        most_consecutive_ones(arr,arr.length);

    }
}
