public class pattern17 {
    static void pattern(int n){
        for(int i=0;i<n;i++){
            int count=5-i;
            for(int j=0;j<count;j++){
                System.out.print(" ");

            }
            int alphabet=65;
            for(int j =0;j<=i;j++){
                System.out.print((char)(alphabet+j));
            }
            int value=i-1;
            for(int k=0;k<i;k++){
                System.out.print((char)(alphabet+value));
                value--;
            }
            System.out.println();
        }


    }
    public static void main(String[] args){
        pattern(5);

    }
}
