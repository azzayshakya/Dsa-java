public class ar15_2SUM {
    static int[] twosum(int arr[],int target){
        int sum=0  ;
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                if(arr[i]+arr[j]==target){
                    ans[0]=arr[i];
                    ans[1]=arr[j];
                    return ans;
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        int target=14;
        int ans[]=twosum(arr,target);
        System.out.println(ans[0]+"    "+ans[1]);




    }
}
