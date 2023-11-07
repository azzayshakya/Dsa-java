public class pattern6 {
    static void pattern(int n){

        for(int i=0;i<n;i++){
            int count=1;
            for(int j=n;j>i;j--){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern(5);

    }
}
