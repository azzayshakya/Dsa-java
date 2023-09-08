public class first_ocurance {
    public static int FirstOc(int arr[] ,int key ,int i){
        if (arr[i]==arr.length){
            return -1;
        }
        if (arr[i] ==key){
            return i;
        }
        return FirstOc(arr,key,i+1);
    }
    public static void main(String[] args){
        int arr[] = {1,5,2,67,843,63,5,221,9};
        System.out.println(FirstOc(arr,843,0));
    }
}
