public class ar10_linear_search {

    static void linear_search(int arr [],int n,int target){
        int value =0;
        for(int i =0;i<n;i++){
            if(arr[i] == target){
                value++;
                System.out.println("target found at index "+ i);
            }
        }
        if(value==0){
            System.out.println("target not found");
        }
    }
        public static void main(String[] args){
            int arr[]={1,4,6,7,88};
            int n= arr.length;
            int target=88;
//            ar10_linear_search s1=new ar10_linear_search();
//            s1.linear_search(arr,n,target);
            linear_search(arr,n,target);

        }
}
