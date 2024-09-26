public class pattern10 {
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("X");
            }
            System.out.println();
        }
        for(int i=0;i<n-1;i++){
            int count=4-i;
            for(int j=0;j<count;j++){
                System.out.print("X");
            }
            System.out.println();

        }


    }
    public static void main(String[] args){
        pattern(5);

    }
}
