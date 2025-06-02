public class mooreVotingAlgo {
     public static int MooreVoting(int[] arr ){
         int count=0;
         int el=0;
         for(int i =0 ;i<arr.length; i++){
             if(count==0){
                 el=arr[i];
             }
             if(arr[i]==el){
                 count++;
             }
             else {
                 count--;
             }
         }
         int CountCk=0;
         for(int i =0; i<arr.length;i++){
             if(el==arr[i]){
                 CountCk++;
             }
         }
         if(CountCk>arr.length/2){
             return el;
         }
         else {
             return -1;
         }
     }
    public static  void main(String [] args){
        System.out.println("Moor's voting algo for the n/2 elements appearence");
        int [] arr={7,7,5,7,5,1,5,7,5,5,7,7,5,5,7,7,1,1,5,5,5,5,5,5};
        System.out.println(MooreVoting(arr));
    }
}