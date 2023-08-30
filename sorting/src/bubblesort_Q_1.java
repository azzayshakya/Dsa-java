

public class bubblesort_Q_1{

    public static void bubblesort(int arr[]){

        for (int turn=0;turn<arr.length;turn++){
            for (int j=0; j<arr.length-1-turn;j++ ){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void printarray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {

        int arr[]={5,1,3,2};
        bubblesort(arr);
        printarray(arr);
    }
}