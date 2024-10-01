import java.sql.Array;
import java.util.*;

public class ar9_moves_zero_to_end {
    static void MovesZeroToEnd(int arr[], int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }
        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }
        for (int i = temp.size(); i < n; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

public static int[] Move_Zero_type_two(int arr[],int n) {

    int j=-1;
    for(int i=0;i<n;i++){
        System.out.println();
        if(arr[i]==0){
            j=i;
            break;
        }
    }
    if (j==-1) return arr;
    for(int i=j+1;i<n;i++){
        if(arr[i]!=0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
        }

    }

    return  arr;
}


    public static void main(String args[]){
        int arr[]={2,5,0,1,0,0,5,3};
//        type-1

//        MovesZeroToEnd(arr,arr.length);

//        type-2
        Move_Zero_type_two(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
