public class ar12_ConsecutiveOnes {
    static int MCO(int arr [], int n ){
        int count=0;
        int maxC=0;
        for(int  i=0;i<n;i++)
        {
            if(arr[i]==1){
                count ++;
            }
            else{
                count=0;
            }
            maxC=Math.max(maxC,count);
        }
        return maxC;
    }




    public static void main(String[] args) {
        int arr[]={1,1,1,1,1,1,0,0,0,0,1,1,0,0,1,1,1,1,1};
        int n=arr.length;
        System.out.println("the max consecutive ones in the array is "+ MCO(arr,n));



    }
}

