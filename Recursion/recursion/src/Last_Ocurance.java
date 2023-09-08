public class Last_Ocurance {
    public static int LastOca(int arr[], int key ,int i ){
        if(i==arr.length)
        {
            return -1;
        }
        int isFound =LastOca(arr,key,i+1);
        if (isFound!=-1){
            return isFound;
        }
        if (arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args){
        int arr[]={1,3,2,13,3,23,2};
        System.out.println( LastOca(arr,3,0));

    }
}
