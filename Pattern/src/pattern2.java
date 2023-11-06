public class pattern2 {
    static void pattern(int n){
        for(int i=0;i<n;i++){
//            System.out.print("X");
            for(int j=0;j<=i;j++){
                System.out.print("X");
            }
            System.out.println();

        }
    }

    public static void main(String Args[]){
        pattern(5);
    }
}
