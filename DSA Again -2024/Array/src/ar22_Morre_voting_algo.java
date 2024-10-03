public class ar22_Morre_voting_algo {
    static int MVA(int arr[],int n){
        int el=0;
        int count=0;

        for(int i=0;i<n;i++){
            if(count==0){
                count =1;
                el=arr[i];

            }
            if(el==arr[i]){
                count ++;
            }
            else{
                count --;
            }
        }

        int count2 =0;
        for(int i=0;i<n;i++){
            if(arr[i]==el){
                count2++;
            }


        }
        if(count2 >n/2){
            return el;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("ajay");
        int arr[]={2, 2, 1, 1, 1, 2, 2};
        int n=arr.length;
        System.out.println(MVA(arr,n));

    }
}
