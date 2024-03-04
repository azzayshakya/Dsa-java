public class pattern5 {
    static void pattern(int n){

        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("X");

            }
            System.out.println();
        }


    }
    public static void main(String[] args){
        pattern(5);

    }
}
