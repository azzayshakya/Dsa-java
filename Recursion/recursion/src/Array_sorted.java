public class Array_sorted {
    public static boolean issorted(int arr[] ,int i){
        if (arr[i]==arr.length-1){
            return true;

        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return issorted(arr,i+1);
    }
    public static void main(String[] args){
        int arr[] ={1,4,6,9,8};
        System.out.println(issorted(arr,0));
    }
}
