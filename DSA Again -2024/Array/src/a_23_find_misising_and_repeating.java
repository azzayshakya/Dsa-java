public class a_23_find_misising_and_repeating {
    static void FMAR(int arr[],int n){
//        int missingel=-1;
//        int repeatedel=-1;
        for(int i=1;i<=n;i++){
            int count =0;
            for(int j=0 ;j<n;j++){
                if (i==arr[j]){
                    count++;
                }

            }
            if(count>1){
                System.out.println("repeted np is "+ i);

            }
            if(count==0){
                System.out.println("mising no is this "+i);
            }
        }

    }
    public static void main(String[] args) {

        int arr[]={1,3,2,4,4,6};
        int n = arr.length;
        FMAR(arr,n);
    }
}
