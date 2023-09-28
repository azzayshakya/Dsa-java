public class revision {
    public static void sorting(int arr[],int s,int e) {
        if(s>=e){
            return;
        }
        int temp =arr[s];
        arr[s]=arr[e];
        arr[e]=temp;

        sorting(arr,s+1,e-1);





    }
    public static void main(String[] args) {
        System.out.println("ajay");
        int arr[] ={5,3,4,2,1};

        sorting(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
