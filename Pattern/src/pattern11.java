public class pattern11 {
    static void pattern(int n){
        for(int i=0;i<n;i++){
            int start;

            if(i%2==0){
                start=1;
            }
            else{
                start=0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start=1-start;


            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern(5);

    }
}
