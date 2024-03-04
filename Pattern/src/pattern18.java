public class pattern18 {
    static void pattern(int n){
        int alphabet =65;
        for(int i=0;i<n;i++){
            int value=4-i;
            for(int j=0;j<=i;j++){
                System.out.print((char) (alphabet+value)+" ");
                value++;



            }
            System.out.println();
        }


    }
    public static void main(String[] args){
        pattern(5);

    }
}
